programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const inteiro QTD_LANCAMENTOS = 4
		real lancamentos[QTD_LANCAMENTOS]

		para(inteiro i = 0; i < QTD_LANCAMENTOS; i++) {
			escreva("Lançamento: ")
			leia(lancamentos[i])
		}


		limpa()

		real somaLancamentos = 0.0
		real maiorLancamento = 0.0
		inteiro ocorrenciasMaiorPontuacao = 0

		para(inteiro i = 0; i < QTD_LANCAMENTOS; i++) {
			escreva("\nLançamento " + (i+1) + ": " + lancamentos[i])

			somaLancamentos += lancamentos[i]

			se(lancamentos[i] > maiorLancamento) {
				ocorrenciasMaiorPontuacao = 0
				maiorLancamento = lancamentos[i]
			}

			se(lancamentos[i] == maiorLancamento) {
				ocorrenciasMaiorPontuacao += 1
			}
		}

		/*
		para(inteiro i = 0; i < QTD_LANCAMENTOS; i++) {
			se(lancamentos[i] == maiorLancamento) {
				ocorrenciasMaiorPontuacao += 1
			}
		}*/

		real mediaLancamentos = mat.arredondar(somaLancamentos / QTD_LANCAMENTOS, 2)

		escreva("\nMédia: " + mediaLancamentos + "\nMaior pontuação: " + maiorLancamento +
		"\nOcorrências da maior pontuação: " + ocorrenciasMaiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorLancamento, 19, 7, 15}-{ocorrenciasMaiorPontuacao, 20, 10, 25};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */