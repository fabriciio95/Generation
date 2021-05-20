programa
{
	
	funcao inicio()
	{
		real indicePoluicao = 0.0

		escreva("Informe o indice de poluição: ")
		leia(indicePoluicao)

		se(indicePoluicao >= 0.3 e indicePoluicao < 0.4) {
			escreva("Indústrias do 1º grupo devem suspender as atividades")
		} senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5) {
			escreva("Indústrias do 1º e do 2º grupo devem suspender as atividades")
		} senao se(indicePoluicao >= 0.5) {
			escreva("Todos os grupos devem suspender as atividades")
		} senao {
			escreva("Indice de poluição aceitável.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */