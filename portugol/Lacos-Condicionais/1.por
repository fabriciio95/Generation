programa
{
	
	funcao inicio()
	{
		real p
		real excesso = 0.0
		real m = 0.0
		escreva("Peso de tomates: ")
		leia(p)

		se(p > 50) {
			excesso = p - 50
			m = excesso * 4
		}

		escreva("Peso: " + p + "\nExcesso: " + excesso + "\nMulta: " + m)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */