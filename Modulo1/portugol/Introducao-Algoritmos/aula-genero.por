programa
{
	
	funcao inicio()
	{
	
		cadeia nome
		escreva("Qual seu nome? ")
		leia(nome)

		caracter genero
		escreva("Como você se identifica? [M - Masculino | F - Feminino | O - Outros] : ")
		leia(genero)

		se (genero == 'M' ou genero == 'm' ou genero == 'f' ou genero == 'F' ou genero == 'O' ou genero == 'o') {

			inteiro anoNasc
			escreva("Qual seu ano de nascimento? ")
			leia(anoNasc)
	
			inteiro idade = 2021 - anoNasc
	
			se (idade <= 18) {
				escreva("Olá, " + nome + " sua idade é " + idade + " e você é jovem")
			} senao se (idade > 18 e idade <= 50) {
				se(genero == 'm' ou genero == 'M'){
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é adulto")
				} senao se(genero == 'f' ou genero == 'F'){
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é adulta")
				} senao {
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é adulte")
				}
			} senao {
				se(genero == 'm' ou genero == 'M'){
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é idoso")
				} senao se(genero == 'f' ou genero == 'F'){
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é idosa")
				} senao {
					escreva("Olá, " + nome + " sua idade é " + idade + " e você é idose")
				}
			}
		}  senao {
			escreva("Opção inválida")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */