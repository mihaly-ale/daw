Algoritmo calcSueldoConComison
	// definir variables
	Definir numeroHombres, numeroMujeres, totalEstudiantes, porcentajeHombres, porcentajeMujeres Como Real
	
	// leer entrada
	Escribir "Número de estudiantes hombres: " Sin Saltar
	Leer numeroHombres
	Escribir "Número de estudiantes mujeres: " Sin Saltar
	Leer numeroMujeres
	
	// computacion
	totalEstudiantes = numeroHombres + numeroMujeres
	porcentajeHombres = (trunc((numeroHombres / totalEstudiantes) * 10000)) /100
	porcentajeMujeres = (trunc((numeroMujeres / totalEstudiantes) * 10000)) /100
	
	// mostrar resultados
	Escribir "Total estudiantes del curso: ", totalEstudiantes
	Escribir "Porcentaje de hombres      : ", porcentajeHombres 
	Escribir "Porcentaje de mujeres      : ", porcentajeMujeres 
FinAlgoritmo

