programa
{
	
	funcao inicio()
	{
		/*
		 G-GANHOU (3), P-PERDEU(0), OU E-EMPATOU(1)
		VETOR TIMES
		VETOR PONTOS
		3 RODADAS

			LISTAGEM NOME DE CADA TIME - PONTOS ATUAIS
		 * 
		 */

		 cadeia times[4] = {"São Paulo", "Palmeiras", "Corinthians", "Santos"}
		 inteiro pontos[4]
		 caracter resposta

		 para(inteiro rodada = 0; rodada < 4; rodada++){
		 	escreva("==== RODADA " + (rodada+1) + " ====\n")
		 	para(inteiro i = 0; i < 4; i++) {
		 		escreva(times[i] + " ganhou? [g - ganhou | e - empatou | p - perdeu] ")
		 		leia(resposta)
		 		se(resposta == 'g') {
		 			 pontos[i] += 3
		 		} senao se(resposta == 'e'){
		 			pontos[i] += 1
		 		} senao {
		 			pontos[i] += 0
		 		}
		 	}
		 }

		 
		para(inteiro i = 0; i < 4; i++){
			escreva("\n" + times[i] + " - " + pontos[i])
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */