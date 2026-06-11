Algoritmo calculaMult
	// Definir los variables
	Definir num1, num2, num3 Como Real
	Definir suma, producto Como Real
	Definir promedio Como Real
	
	// Entrada de los variables
	Escribir "Ingrese el valor 1: " Sin Saltar	
	Leer num1
	Escribir "Ingrese el valor 2: " Sin Saltar
	Leer num2
	Escribir "Ingrese el valor 3: " Sin Saltar
	Leer num3
	
	// Computacion
	suma = num1 + num2 + num3
	producto = num1 * num2 * num3
	promedio = (num1 + num2 + num3) / 3
	promedio = Redon(promedio * 100) / 100
	
	// Mostrar resultados
	Escribir "La suma de los 3 valores es igual a    : " suma 
	Escribir "El producto de los 3 valores es igual a: " producto 
	Escribir "El promedio de los 3 valores es igual a: " promedio 
FinAlgoritmo
