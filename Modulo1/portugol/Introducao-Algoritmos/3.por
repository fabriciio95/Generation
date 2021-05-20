programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao
		escreva("Tempo de duração do evento em segundos: ")
		leia(tempoDuracao)

		inteiro horas = tempoDuracao / 3600
		inteiro minutos = (tempoDuracao % 3600) / 60
		inteiro segundos = (tempoDuracao % 3600) % 60

		escreva("Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */