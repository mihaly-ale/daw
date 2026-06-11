Algoritmo calculaVolumenCilindro
	// declarar variables
	Definir altura, diametro, volumen Como Real
	
	// leer entradas
	Escribir "Teclea la altura del cilindro: " Sin Saltar
	Leer altura
	Escribir "Teclea el diámetro del cilindro: " Sin Saltar
	Leer diametro
	
	// computación
	volumen = altura * 3.14 * (diámetro / 2) ^ 2
	
	// mostrar resultado
	Escribir "El volumen del cilindro es: ", volumen	
FinAlgoritmo
