programa
{
	
	funcao inicio()
	{
		real notas[5]

		para(inteiro i = 0; i < 5; i++) {
			escreva("Nota: ")
			leia(notas[i])
		}

		limpa()

		real maiorNota = 0.0

		para(inteiro i = 0; i < 5; i++) {
			se(notas[i] > maiorNota) {
				maiorNota = notas[i]
			}

			escreva("\nNota " + (i+1) + ": " + notas[i])
		}

		escreva("\nA maior nota digitada é: " + maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */