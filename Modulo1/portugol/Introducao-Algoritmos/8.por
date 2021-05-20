programa
{
	
	funcao inicio()
	{
		real custoFabrica
		escreva("Custo de fábrica: ")
		leia(custoFabrica)

		real porcentagemDistribuidor = custoFabrica * 0.28
		real imposto = custoFabrica * 0.45

		real precoTotal = custoFabrica + porcentagemDistribuidor + imposto

		escreva("Valor para o consumidor: ", precoTotal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */