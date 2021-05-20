programa
{
	
	funcao inicio()
	{
		real base, altura

		escreva("Informe a base: ")
		leia(base)

		escreva("Informe a altura: ")
		leia(altura)

		se(base <= 0 ou altura <= 0) {
			escreva("Valores inválidos")
		} senao {
			escreva("A área do triângulo é: ", ((base * altura) / 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */