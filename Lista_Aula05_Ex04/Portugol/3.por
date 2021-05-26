programa
{
	
	funcao inicio()
//Exercicio04_LetraC_Lista
	{
		real peso1, peso2, peso3, nota1, nota2, nota3, mp, cal

		escreva("Digite a primeira nota: \n")
			leia(nota1)
		escreva("Digite o peso da primeira nota: \n")
			leia(peso1)	
			
		escreva("Digite a segunda nota: \n")
			leia(nota2)
		escreva("Digite o peso da segunda nota: \n")
			leia(peso2)
			
		escreva("Digite a terceira nota: \n")
			leia(nota3)
		escreva("Digite o peso da terceira nota: \n")
			leia(peso3)	

		cal = (nota1 * peso1) + (nota2 * peso2) * (nota3 * peso3) 

		mp = cal/(peso1 + peso2 + peso3)

		escreva("A média aritmética PONDERADA dos seus numeros é: ", mp, "\n\n")

		escreva("__________PROGRAMA FINALIZADO________")
	}
//fimalgoritmo
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */