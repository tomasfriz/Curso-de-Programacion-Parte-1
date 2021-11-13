Algoritmo ACT_3
	Escribir 'numero a...'
	Leer a
	Escribir 'numero b...'
	Leer b
	Escribir 'numero c...'
	Leer c
	Si a*b >= 0 Entonces
		r = a*b
	SiNo
		Si a*c >= 0 Entonces
			r = a*c
		SiNo
			r = b*c
		FinSi
	FinSi
	Escribir 'r = ' r
FinAlgoritmo
