programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Informe o número: ")
		leia(num)

		se(num == 0){
			escreva("O número 0 é neutro.")
		} senao se(num % 2 == 0) {
			se( num >= 0) {
				escreva("O número "+ num + " é par positivo")
			} senao {
				escreva("O número "+ num + " é par negativo")
			}
		} senao {
			se( num >= 0) {
				escreva("O número "+ num + " é ímpar positivo")
			} senao {
				escreva("O número "+ num + " é ímpar negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */