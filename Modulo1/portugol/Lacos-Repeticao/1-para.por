programa
{
	inclua biblioteca Matematica --> mat

	
	
	funcao inicio()
	{
		const inteiro CANDIDATOS = 3
		real salario = 0.0
		real totalSalario = 0.0
		real qtdFilhos = 0.0
		real totalFilhos = 0.0
		real maiorSalario = 0.0
		real salariosAte100 = 0.0

		para(inteiro i = 0; i < CANDIDATOS; i++) {
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


		real mediaSalario = totalSalario / CANDIDATOS
		real mediaFilhos = totalFilhos / CANDIDATOS
		real porcentagem = (salariosAte100 / CANDIDATOS) * 100

		escreva("\n\nMédia de salários: " + mat.arredondar(mediaSalario, 2) + "\nMédia de filhos: "
		+ mat.arredondar(mediaFilhos, 2) + "\nPercentagem de pessoas com salários até R$100: "
		+ mat.arredondar(porcentagem, 1) + "%")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 921; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */