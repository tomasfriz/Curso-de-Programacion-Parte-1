Algoritmo ACT_7
	Escribir 'Tipo(a-b)?'
	Leer tipo
	Escribir 'Tama�o(1-2)?'
	Leer tama�o
	Escribir 'Precio x kg: '
	Leer precio
	Escribir 'Cantidad de Kilos: '
	Leer kilos
	Si tipo='a' Entonces
		Si tama�o=1 Entonces
			Escribir "Total= ", (0.2+precio)*kilos,"$ "
		SiNo
			Escribir "Total= ",(0.3 + precio)*kilos, "$ "
		FinSi
	SiNo
		Si tama�o=1 Entonces
			Escribir "Total= ", (precio - 0.3)* kilos, "$ "
		SiNo
			Escribir "Total= ",(precio-0.5)*kilos,"$ "
		FinSi
	FinSi
FinAlgoritmo
