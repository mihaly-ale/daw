Algoritmo calcSueldoConComison
	// definir variables
	Definir valorDeCompra, valorDescontado, valorPagando Como Real
	
	// leer entrada
	Escribir "Valor de la compra: " Sin Saltar
	Leer valorDeCompra
	
	// computacion
	valorDescontado = valorDeCompra * 0.15
	valorPagando = valorDeCompra - valorDescontado
	
	// mostrar resultados
	Escribir "Porcentaje descuento: 15"
	Escribir "Valor descontado    : ", valorDescontado
	Escribir "Valor a pagar       : ", valorPagando
FinAlgoritmo

