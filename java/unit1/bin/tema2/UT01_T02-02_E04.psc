Algoritmo calcSueldoConComison
	// definir variables
	Definir sueldoBasico, venta1, venta2, venta3, comision, sueldoNeto Como Real
	
	// leer entrada
	Escribir "Sueldo básico: " Sin Saltar
	Leer sueldoBasico
	Escribir "Valor venta 1: " Sin Saltar
	Leer venta1
	Escribir "Valor venta 2: " Sin Saltar
	Leer venta2
	Escribir "Valor venta 3: " Sin Saltar
	Leer venta3	
	
	// computacion
	comision = (venta1 + venta2 + venta3) * 0.1
	sueldoNeto = sueldoBasico + comision
	
	// mostrar resultados
	Escribir "Valor de la comisión: ", comision
	Escribir "Sueldo neto:          ", sueldoNeto
FinAlgoritmo

