programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real soma = 0.0
		inteiro qtdNumLidos = 0
		real media = 0.0
		inteiro numLido = 0

		enquanto(numLido >= 0) {
			soma += numLido
			escreva("Número: ")
			leia(numLido)
			qtdNumLidos += 1
		}

		qtdNumLidos--

		media = mat.arredondar(soma / qtdNumLidos, 2)

		escreva("\nSoma: " + soma + "\nMédia: " + media + "\nTotal de valores lidos: " + qtdNumLidos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */