# Revisión Básica de Proyecto MVC — Arquitectura y Análisis OCP

---

## 1. Resumen Arquitectónico

El proyecto contiene cinco archivos que siguen una arquitectura MVC por capas:

1. `StudentModel.java` (Modelo): Representa la estructura de datos. Independiente de la vista y las operaciones de base de datos.
2. `StudentView.java` (Vista): Renderiza los detalles del estudiante. Sin estado — no tiene campos ni datos internos.
3. `StudentController.java` (Controlador): Mediador entre el Modelo y la Vista. Contiene la lógica de negocio para actualizar datos y renderizar la vista.
4. `StudentRepository.java` (Capa de Datos): Simula operaciones de base de datos. Mantiene el acceso a datos separado de las clases MVC.
5. `StudentDemo.java` (Ensamblador): Punto de entrada que crea todos los componentes, los conecta y ejecuta el flujo.

MVC es un patrón de presentación. Combinado con una arquitectura de tres capas (una forma de organizar el código en niveles):
- **Capa de Presentación (Vista y Controlador)**: Coordina la interfaz de usuario y las entradas del usuario.
- **Capa de Negocio/Servicio (Controlador o Servicios separados)**: Implementa las reglas de negocio.
- **Capa de Dominio/Modelo (Modelo)**: Representa los objetos de dominio: conceptos de negocio del mundo real (ej. un `Student`, un `Product`, una `Account`). Son objetos planos sin código de base de datos ni de interfaz de usuario.
- **Capa de Acceso a Datos (Repositorio/DAO)**: Gestiona la obtención de datos de la base de datos, manteniéndola separada de la presentación y la lógica de negocio.

---

## 2. Análisis de Responsabilidades por Archivo

El proyecto utiliza una arquitectura limpia que combina el patrón **MVC** para la capa de presentación con un **Repositorio (DAO)** para la capa de datos.

```
                  ┌──────────────────────┐
                  │     StudentDemo      │ (Ensamblador / Punto de Entrada)
                  └──────────┬───────────┘
                             │ (Crea y conecta)
                             ▼
 ┌────────────────────────────────────────────────────────┐
 │                      CAPA MVC                          │
 │                                                        │
 │ ┌──────────────────┐            ┌────────────────────┐ │
 │ │   StudentModel   ◄────────────┤ StudentController  │ │
 │ │    (Modelo)      │  actualiza │   (Controlador)    │ │
 │ └──────────────────┘            └─────────┬──────────┘ │
 │                                           │            │         
 │                                           │  usa       │
 │                                           │            │
 │                                           ▼            │
 │                                 ┌────────────────────┐ │
 │                                 │    StudentView     │ │
 │                                 │     (Vista)        │ │
 │                                 └────────────────────┘ │
 └───────────────────────────┬────────────────────────────┘
                             │ (Obtiene datos)
                             ▼
                  ┌──────────────────────┐
                  │  StudentRepository   │ (Capa de Acceso a Datos)
                  └──────────────────────┘
```

### Capa de Dominio (Modelo)
* **`StudentModel.java`**: Un **POJO** puro (una clase simple con solo campos, getters y setters, sin necesidad de frameworks especiales).
    * **Responsabilidad:** Representar los datos de negocio y sus reglas asociadas (getters, setters, constructores).
    * **Diseño:** No contiene lógica de base de datos ni referencias a la vista o al controlador, lo que lo hace 100% independiente y reutilizable.

### Capa de Presentación (Vista)
* **`StudentView.java`**: Representa la interfaz de usuario.
    * **Responsabilidad:** Mostrar información al usuario (en este ejemplo, salida por consola).
    * **Diseño:** Sin estado (no almacena datos entre llamadas — solo muestra lo que recibe). Recibe datos primitivos desde fuera (`printDetails(name, studentId)`), evitando que la vista conozca el modelo o tenga dependencias directas con el resto de la aplicación.

### Capa de Control (Controlador)
* **`StudentController.java`**: El intermediario principal (orquestador).
    * **Responsabilidad:** Puente de comunicación. Controla las modificaciones al modelo y coordina las actualizaciones de la vista.
    * **Diseño:** El Controlador no crea el Modelo ni la Vista por sí mismo. En su lugar, los recibe a través de su constructor — esto se llama **inyección de dependencias (DI)**. En lugar de escribir `StudentModel model = new StudentModel(...)` dentro del Controlador, las dependencias se le entregan ya listas. Esto significa que el Controlador depende solo de *interfaces y tipos*, no de *cómo se crean las cosas*. Beneficios: más fácil de probar (puedes pasar un Mock de Vista o Modelo), y el Controlador se mantiene enfocado puramente en la lógica de coordinación.

### Capa de Acceso a Datos (Repositorio)
* **`StudentRepository.java`**: El patrón repositorio de almacenamiento.
    * **Responsabilidad:** Encapsular toda la lógica de obtención de datos (en un entorno real: consultas SQL, JPA, llamadas REST, etc.).
    * **Diseño:** Mantiene todo el código de base de datos en un solo lugar, evitando que la lógica de base de datos se filtre a otras clases. El Repositorio se inyecta en el Controlador mediante DI, por lo que la fuente de datos se puede intercambiar (ej. un simulador en memoria para pruebas vs. una base de datos MySQL real) sin cambiar la lógica del Controlador.

### Ensamblador (Punto de Entrada)
* **`StudentDemo.java`**:
    * **Responsabilidad:** Punto de entrada de la aplicación. Crea instancias de cada capa, las conecta entre sí e inicia el flujo.

### Por Qué la DI es Importante

Observa cómo `StudentDemo.java` conecta las capas:

```java
StudentModel student = repository.retrieveStudent("p-100", "Peter");
StudentView view = new StudentView();
StudentController controller = new StudentController(student, view);
```

El `StudentModel` y el `StudentView` se crean **antes** que el Controlador, y luego se pasan a su constructor. El Controlador nunca llama a `new StudentModel()` ni a `new StudentView()` internamente — simplemente recibe lo que necesita. Eso es **DI**.

Sin DI, el Controlador se vería así:

```java
public StudentController() {
    this.studentModel = new StudentModel("p-100", "Peter");  // ❌ hard-coded interno
    this.studentView = new StudentView();
}
```

Esto es rígido y difícil de probar — no puedes cambiar los datos del estudiante ni intercambiar la vista sin editar el Controlador. Con DI, los objetos se crean **fuera** y se **entregan** a las clases que los necesitan. Cada clase se mantiene enfocada en su propia tarea, y el Ensamblador maneja las conexiones.

---

## 3. Beneficios Clave del Diseño

1. **SRP:** Cada clase tiene una única razón para cambiar. Si el almacenamiento cambia (ej. de memoria a MySQL), **solo** `StudentRepository` cambia.
2. **Mantenibilidad y Escalabilidad:** Puedes insertar una nueva clase entre el Controlador y el Repositorio (ej. `StudentService`) sin modificar el código existente. Ejemplo:

   ```
   Antes:  Controlador → Repositorio
   Después: Controlador → StudentService → Repositorio
   ```

   El Controlador llama al Servicio en lugar del Repositorio. El Servicio añade validaciones o reglas de negocio (ej. verificar datos, formatear, autorizar), y luego llama al Repositorio. Solo cambia el cableado en `StudentDemo` — el Controlador y el Repositorio permanecen intactos.
3. **Testeabilidad:** El Repositorio puede ser simulado (reemplazado con una versión simplificada que devuelve datos predefinidos) en pruebas unitarias aisladas, ya que el Controlador lo recibe mediante inyección por constructor.

---

## 4. Implementación de Vistas y Análisis OCP

**OCP** establece que las clases deben estar **abiertas para extensión pero cerradas para modificación**. En otras palabras: deberías poder añadir nueva funcionalidad escribiendo *código nuevo*, no modificando *código existente* que ya funciona. Las dos opciones siguientes muestran cómo diferentes diseños de vista respetan o violan este principio.

### 4.1 Opción 1 — Enfoque con Interfaz (Respeta OCP)

```java
// StudentView.java — interfaz (abierta para extensión)
public interface StudentView {
    void printDetails(String name, String studentId);
}

// StudentConsoleView.java — implementación concreta
public class StudentConsoleView implements StudentView {
    public void printDetails(String name, String studentId) {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}

// StudentJsonView.java — otra implementación
public class StudentJsonView implements StudentView {
    public void printDetails(String name, String studentId) {
        System.out.println("{ \"name\": \"" + name + "\", \"studentId\": \"" + studentId + "\" }");
    }
}
```

```
                    «interface»
                    StudentView
                         ▲
                         │
            ┌────────────┼────────────┐
            │            │            │
            ▼            ▼            ▼
  StudentConsoleView  StudentJsonView  StudentXmlView (NUEVO)
```

El enfoque con interfaz respeta **OCP** porque extender el sistema con un nuevo formato de vista requiere **añadir una nueva clase** que implemente `StudentView`, sin modificar ningún código existente. El Controlador depende solo de la abstracción (`StudentView`), no de implementaciones concretas. **Extender = añadir**, no modificar — cero riesgo de romper lo que ya funciona, aislamiento total y escalabilidad ilimitada.

> **¿Por qué una interfaz y no una clase abstracta?** Usamos una interfaz porque las vistas no comparten código ni estado común — cada una implementa `printDetails` de forma completamente diferente. Una interfaz es solo un **contrato mínimo** (qué métodos implementar), no una forma predefinida de cómo deben funcionar. Una clase abstracta añadiría peso innecesario. Si más tarde las vistas compartieran lógica (ej. formateo de fechas), tendría sentido migrar a una clase abstracta.

### 4.2 Opción 2 — Enfoque con Switch (Violación OCP)

```java
public class StudentView {
    public void printDetails(String name, String studentId, String format) {
        switch (format) {
            case "simple":
                System.out.println(name + " - " + studentId);
                break;
            case "json":
                System.out.println("{ \"name\": \"" + name + "\", \"studentId\": \"" + studentId + "\" }");
                break;
            default:
                System.out.println("Name: " + name);
                System.out.println("ID: " + studentId);
        }
    }
}
```

```
         ┌─────────────────────────────────┐
         │  StudentView (clase monolítica)  │
         │                                 │
         │  ├─ case "simple"               │
         │  ├─ case "json"                 │
         │  ├─ case "xml"    ← MODIFICAR   │
         │  └─ case "markdown" ← MODIFICAR │
         │                                 │
         └─────────────────────────────────┘
         			❌ Viola OCP
```

El enfoque con switch viola **OCP** porque extender el sistema con un nuevo formato requiere **modificar** la clase `StudentView` existente añadiendo un nuevo `case` al switch. Cada modificación corre el riesgo de romper la funcionalidad existente (ej. un `break` olvidado, un fall-through no deseado). Con 10 formatos, tienes un switch monolítico de 10 ramas difícil de leer, probar y mantener. **Extender = modificar**, lo que contradice directamente OCP.

### 4.3 Resumen

**Opción 1 (Interfaz)** es el enfoque recomendado porque respeta OCP: añadir nuevos formatos de vista significa crear nuevos archivos sin tocar el código existente ya probado.

**Opción 2 (Switch)** viola OCP: cada nuevo formato fuerza una modificación de la clase existente, aumentando la complejidad y el riesgo de regresión con cada adición.

---

## 5. Acrónimos

| Acrónimo | Significado (inglés) | Sigla en español | Significado (español) |
|----------|----------------------|-----------------|----------------------|
| **DAO** | Data Access Object | IDA | Objeto de Acceso a Datos |
| **DI** | Dependency Injection | ID | Inyección de Dependencias |
| **JPA** | Java Persistence API | JPA | API de Persistencia de Java |
| **JSON** | JavaScript Object Notation | JSON | Notación de Objetos JavaScript |
| **MVC** | Model-View-Controller | MVC | Modelo-Vista-Controlador |
| **OCP** | Open/Closed Principle | PAC | Principio de Abierto/Cerrado |
| **POJO** | Plain Old Java Object | POJO | Objeto Java Simple y Ordinario |
| **REST** | Representational State Transfer | REST | Transferencia de Estado Representacional |
| **SRP** | Single Responsibility Principle | PRU | Principio de Responsabilidad Única |
