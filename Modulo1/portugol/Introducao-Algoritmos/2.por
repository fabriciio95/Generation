programa
{
	
	funcao inicio() {
		inteiro diasRecebido
		escreva("Informe sua idade em dias: ")
		leia(diasRecebido)

		inteiro anos = diasRecebido / 365
		inteiro meses = (diasRecebido % 365) / 30
		inteiro dias = (diasRecebido % 365) % 30

		escreva("Anos: " + anos + "\nMeses: " + meses + "\nDias: " + dias)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {meses, 10, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */