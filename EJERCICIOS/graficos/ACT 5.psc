Algoritmo ACT_5
	limite <- 1000
	Escribir 'cantidad de lapices'
	Leer lapices
	Si lapices>=limite Entonces
		precio <- 0.85
	SiNo
		precio <- 0.90
	FinSi
	Escribir "Precio = $", lapices * precio
FinAlgoritmo
