# Architectural Pattern: Template Method

explain me the design diferences between the tow files: interfaz.interfaz_herenciaMultiple and interfaz_herenciaMultiple-ED47004986P105.java. focus on the why and what was done differently, include design patterns if necessary

---

## Assistant (Build · Gemini Flash Latest · 12.7s)

_Thinking:_

**Analyzing Design Differences**

Okay, I'm now zeroing in on the _why_ and _what_ behind the design disparities between `interfaz_herenciaMultiple.java` and `interfaz_herenciaMultipleIncorrecto`. I'm comparing the structures with an eye toward understanding the reasoning for the specific alterations, especially the differences in multiple inheritance implementations.

**Examining Implementation Divergences**

I've uncovered significant differences in how multiple inheritance is handled. In the first design, `SerVivoBase` provides the `comer()` implementation, which relies on the subclass-defined `alimentosPermitidos()`. However, the second design has the `comer()` method implemented in subclasses like `GatoXX`, and it also has a different set of interfaces (`SerVivoY`). This variance in inheritance strategies could be pivotal to functionality, maintainability or performance.

The primary difference between these two files is the **evolution from decentralized logic to a centralized architectural pattern**. Here is the breakdown:

### 1. Architectural Pattern: Template Method

The 2nd file (`interfaz_herenciaMultiple.java`) implements the **Template Method Pattern**, whereas the 3rd file is a "Work in Progress" that suffers from code duplication.

- **File 2 (Best Design):** The abstract class `SerVivoBase` defines the "template" for how eating works. It implements the `comer()` method once. Inside that method, it calls the abstract method `alimentosPermitidos()`.
  - **The "What":** Subclasses only provide the data (the list of foods).
  - **The "How":** The base class controls the logic (the validation and the print statement).
- **File 3 (WIP Design):** The base class is mostly empty of logic. Each concrete subclass (`GatoXX`, `VacaXX`) is forced to implement the same `if (!comida.contains(alimento))` check.

### 2. The DRY Principle (Don't Repeat Yourself)

- **File 2 (DRY):** If you decide to change the error message or log the eating action to a file, you only change it in **one place** (`SerVivoBase`).
- **File 3 (WET - "Write Everything Twice"):** You have the exact same validation logic duplicated in `GatoXX` and `VacaXX`. If you add 10 more animals, you have to copy-paste that logic 10 times. This is a maintenance nightmare and a source of bugs.

### 3. Encapsulation and Data Hiding

- **In File 2**, the validation logic is encapsulated within the base class. The subclasses don't need to know _how_ the validation happens; they only need to specify their diet. This is a cleaner form of **Information Hiding**.
- **In File 3**, the subclasses are "over-exposed"—they have to handle the flow control of the `comer` action themselves, even though that flow is identical for all animals.

### 4. Polymorphism in Action

- **File 2** uses **Polymorphism** more effectively. When `SerVivoBase.comer()` is called, it executes:
  ```java
  if (!alimentosPermitidos().contains(alimento)) { ... }
  ```
  At runtime, Java looks at the specific object (e.g., a `GatoX`) and calls its specific implementation of `alimentosPermitidos()`. The base class "trusts" the subclass to provide the right data, while the base class provides the "rules."

### Summary Table

| Feature              | `interfaz_herenciaMultiple` (2nd) | `interfaz_herenciaMultipleIncorrecto (3rd) |
| :------------------- | :-------------------------------- | :----------------------------------------- |
| **Logic Placement**  | **Centralized** in `SerVivoBase`  | **Decentralized** in subclasses            |
| **Code Duplication** | None (DRY)                        | High (Validation logic repeated)           |
| **Design Pattern**   | **Template Method**               | None (Basic Inheritance)                   |
| **Maintainability**  | Easy (Change logic in 1 place)    | Hard (Change logic in every class)         |
| **Focus**            | Focus on **Behavior**             | Focus on **Implementation**                |

---
