Algoritmo ACT_7
	Escribir 'Tipo(a-b)?'
	Leer tipo
	Escribir 'Tamaño(1-2)?'
	Leer tamaño
	Escribir 'Precio x kg: '
	Leer precio
	Escribir 'Cantidad de Kilos: '
	Leer kilos
	Si tipo='a' Entonces
		Si tamaño=1 Entonces
			Escribir "Total= ", (0.2+precio)*kilos,"$ "
		SiNo
			Escribir "Total= ",(0.3 + precio)*kilos, "$ "
		FinSi
	SiNo
		Si tamaño=1 Entonces
			Escribir "Total= ", (precio - 0.3)* kilos, "$ "
		SiNo
			Escribir "Total= ",(precio-0.5)*kilos,"$ "
		FinSi
	FinSi
FinAlgoritmo
