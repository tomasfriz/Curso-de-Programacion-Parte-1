Algoritmo ACT_6
	Escribir 'cantidad de personas... '
	Leer clientes
	Si clientes >= 300 Entonces
		individual <- 75
	SiNo
		Si clientes >= 200 Entonces
			individual <- 85
		SiNo
			individual <- 95
		FinSi
	FinSi
	grupal = individual * clientes
	Escribir 'El costo por persona es: $', individual, ' haciendo un total de: $', grupal
FinAlgoritmo
