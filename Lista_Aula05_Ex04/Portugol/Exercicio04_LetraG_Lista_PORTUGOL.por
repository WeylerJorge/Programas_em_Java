programa
{
	
	funcao inicio()
	{
		real peso_saco, quant_gato1, quant_gato2, result, result_dias, rest_dias

		escreva("Digite o peso do saco de ração: \n")
		leia(peso_saco)
		escreva("Digite a quantidade de ração para o gato 1 em gramas: \n")
		leia(quant_gato1)
		escreva("Digite a quantidade de ração para o gato 2 em gramas: \n")
		leia(quant_gato2)

		result = peso_saco * 1000

		escreva("O peso do saco de ração em gramas é: ", result, "g \n")

		result_dias = (quant_gato1 + quant_gato2) * 5

		rest_dias = result - result_dias

		escreva("A quantidade de ração que irá restar após 5 dias é de: ", rest_dias,"g\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 638; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */