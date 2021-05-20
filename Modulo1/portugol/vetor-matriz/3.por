programa
{
	inclua biblioteca Matematica --> mat

	
	
	funcao inicio()
	{
		const inteiro LINHAS = 4
		const inteiro COLUNAS = 6

		inteiro n1[LINHAS][COLUNAS] = {{2, 4, 6, 8, 10, 12}, {10, 12, 14, 16, 20, 30}, {30, 5, 5, 10, 2, 4}, {2, 4, 6, 1, 0, 12}}
		inteiro n2[LINHAS][COLUNAS] = {{18, 20, 22, 24, 50, 100}, {26, 28, 30, 32, 1, 0},{20, 3, 6, 10, 1, 3}, {1, 3, 5, 2, 9, 12}}


		inteiro m1[LINHAS][COLUNAS]
		inteiro m2[LINHAS][COLUNAS]

		

		para(inteiro linha = 0; linha < LINHAS; linha++) {
			para(inteiro coluna = 0;  coluna < COLUNAS; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
				m2[linha][coluna] = mat.valor_absoluto(n1[linha][coluna] - n2[linha][coluna])
			}
		}

		escreva("===== M1 =====\n")

		para(inteiro linha = 0; linha < LINHAS; linha++) {
			para(inteiro coluna = 0; coluna < COLUNAS; coluna++) {
				cadeia espaco = "  "
				se(m1[linha][coluna] > 9) {
					espaco = " "
				}
				escreva(m1[linha][coluna], espaco)
			}
			escreva("\n")
		}

		escreva("===== M2 =====\n")

		para(inteiro linha = 0; linha < LINHAS; linha++) {
			para(inteiro coluna = 0; coluna < COLUNAS; coluna++) {
				cadeia espaco = "  "
				se(m2[linha][coluna] > 9) {
					espaco = " "
				}
				escreva(m2[linha][coluna], espaco)
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */