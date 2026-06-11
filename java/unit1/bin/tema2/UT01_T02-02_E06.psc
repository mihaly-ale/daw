Algoritmo parcials
	// definir variables
		// constantes
	Definir pesoPrimerParcial, pesoSegundoParcial, pesoPractica, pesoFinalParcial Como Entero // a lo mejor esta línea sobra ahora, pero luego puede facilitar el trabajo
	pesoPrimerParcial = 20
	pesoSegundoParcial = 20
	pesoPractica = 35
	pesoFinalParcial = 25	
		// entradas
	Definir primerParcial, segundoParcial, practica, finalParcial Como Real	
		// valores para calcular
	Definir pesoAplicadoPrimerParcial, pesoAplicadoSegundoParcial, pesoAplicadoPractica, pesoAplicadoFinalParcial, notaDefinitiva Como Real	
	
	// leer entrada
	Escribir "Primer parcial : " Sin Saltar
	Leer primerParcial
	Escribir "Segundo parcial: " Sin Saltar
	Leer segundoParcial
	Escribir "Práctica       : " Sin Saltar
	Leer practica
	Escribir "Parcial final  : " Sin Saltar
	Leer finalParcial	
	
	// computacion
	pesoAplicadoPrimerParcial = primerParcial * pesoPrimerParcial / 100
	pesoAplicadoSegundoParcial = segundoParcial * pesoSegundoParcial / 100
	pesoAplicadoPractica = practica * pesoPractica / 100
	pesoAplicadoFinalParcial= finalParcial * pesoFinalParcial / 100
	notaDefinitiva = pesoAplicadoPrimerParcial + pesoAplicadoSegundoParcial + pesoAplicadoPractica + pesoAplicadoFinalParcial
	
	// mostrar resultados
	Escribir "Nota definitiva: ", notaDefinitiva 
FinAlgoritmo
