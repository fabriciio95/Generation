programa
{
	inclua biblioteca Matematica --> mat

	
	
	funcao inicio()
	{
		const inteiro candidatos = 20
		real salario = 0.0
		real totalSalario = 0.0
		real qtdFilhos = 0.0
		real totalFilhos = 0.0
		real maiorSalario = 0.0
		real percentual = 0.0
		real salariosAte100 = 0.0

		para(inteiro i = 0; i < candidatos; i++) {
			escreva("Salário: ")
			leia(salario)

			totalSalario += salario

			se(salario <= 100){
				salariosAte100 += 1
			}

			escreva("Quantidade de filhos: ")
			leia(qtdFilhos)

			totalFilhos += qtdFilhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}
			
		}


		real mediaSalario = totalSalario / candidatos
		real mediaFilhos = totalFilhos / candidatos
		real percentagem = (salariosAte100 / candidatos) * 100

		escreva("\n\nMédia de salários: " + mat.arredondar(mediaSalario, 2) + "\nMédia de filhos: "
		+ mat.arredondar(mediaFilhos, 2) + "\nPercentagem de pessoas com salários até R$100: " + percentagem + "%")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 108; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */