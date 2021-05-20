programa
{
	
	funcao inicio()
	{
		inteiro anos
		escreva("Idade em anos: ")
		leia(anos)

		inteiro meses
		escreva("Idade em meses: ")
		leia(meses)

		inteiro dias
		escreva("Idade em dias: ")
		leia(dias)


		inteiro totalDiasAnos = anos * 365
		inteiro totalDiasMeses = meses * 30
		inteiro totalDias = totalDiasAnos + totalDiasMeses + dias
		

		escreva("Sua idade em dias é " + totalDias + ".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */