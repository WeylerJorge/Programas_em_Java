programa
{
	
	funcao inicio()
//Exercicio04_LetraF_Lista
	{
		real salario, percent, cal, total

		escreva("Digite o valor do seu salário: \n")
			leia(salario)
		escreva("Digite a porcentagem do seu aumento: \n")
			leia(percent)

			cal = (percent / 100) * salario
			total = salario + cal

		escreva("\nSeu novo salário é: R$",total, "\n\n")


		escreva("__________PROGRAMA FINALIZADO________")
	}
//fimalgoritmo
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */