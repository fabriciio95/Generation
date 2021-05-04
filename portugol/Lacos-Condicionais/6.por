programa
{
	
	funcao inicio()
	{
		inteiro idade = 0

		escreva("Informe a idade: ")
		leia(idade)

		se(idade < 5) {
			escreva("Nadador não possui idade mínima")
		} senao se(idade >= 5 e idade <= 7) {
			escreva("Nadador está na categoria Infantil A")
		} senao se(idade >= 8 e idade <= 11) {
			escreva("Nadador está na categoria Infantil B")
		} senao se(idade == 12 ou idade == 13) {
			escreva("Nadador está na categoria Juvenil A")
		} senao se(idade >= 14 e idade <= 17) {
			escreva("Nadador está na categoria Juvenil B")
		} senao {
			escreva("Nadador está na categoria Adultos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */