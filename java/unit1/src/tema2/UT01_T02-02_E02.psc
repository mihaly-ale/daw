Algoritmo convertirGrados
	// definir variables
	Definir gradoCelsius, gradoFahrenheit, gradoKelvin Como Real
	
	// leer entrada
	Escribir "Grados Celsius " Sin Saltar
	Leer gradoCelsius
	
	// computacion
	gradoFahrenheit = (1.8 * gradoCelsius) + 32
	gradoKelvin = gradoCelsius + 273.15
	
	// mostrar resultados
	Escribir "Los ", gradoCelsius, " grados Celsius equivales a ", gradoKelvin,  " grados Kelvin."
	Escribir "Los ", gradoCelsius, " grados Celsius equivales a ", gradoFahrenheit,  " grados Fahrenheit."
FinAlgoritmo