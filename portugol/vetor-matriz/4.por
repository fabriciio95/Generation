programa
{
	
	funcao inicio()
	{
		const inteiro LINHAS = 3
		const inteiro COLUNAS = 3


		inteiro numeros[LINHAS][COLUNAS]
		inteiro somaValores = 0
		inteiro somaDiagonal = 0
		
		para(inteiro linha = 0; linha < LINHAS; linha++) {
			para(inteiro coluna = 0; coluna < COLUNAS; coluna++) {
				escreva("Número da linha " + (linha+1) + " e coluna " + (coluna+1) + ":")
				leia(numeros[linha][coluna])
				somaValores += numeros[linha][coluna]
				se(linha == coluna) {
					somaDiagonal += numeros[linha][coluna]
				}
				cadeia espaco = "  "
				se(numeros[linha][coluna] > 9) {
					espaco = " "
				}
			}
		}

		limpa()

		escreva("===== NÚMEROS DIGITADOS =====\n")

		
		para(inteiro linha = 0; linha < LINHAS; linha++) {
			para(inteiro coluna = 0; coluna < COLUNAS; coluna++) {
				cadeia espaco = "  "
				se(numeros[linha][coluna] > 9) {
					espaco = " "
				}
				escreva(numeros[linha][coluna], espaco)
			}
			escreva("\n")
		}


		escreva("Soma total dos valores: " + somaValores + "\nSoma Primeira Diagonal: " + somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */