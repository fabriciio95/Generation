programa
{
	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4
		inteiro quadradoNum1, quadradoNum2, quadradoNum3, quadradoNum4

		escreva("Digite o primeiro número: ")
		leia(num1)

		escreva("Digite o segundo número: ")
		leia(num2)

		escreva("Digite o terceiro número: ")
		leia(num3)

		escreva("Digite o quarto número: ")
		leia(num4)

		quadradoNum1 = num1 * num1
		quadradoNum2 = num2 * num2
		quadradoNum3 = num3 * num3
		quadradoNum4 = num4 * num4

		se(quadradoNum3 >= 1000) {
			escreva(quadradoNum3)
		} senao {
		     escreva("Quadrado do número " + num1 + ": " +  quadradoNum1)
			escreva("\nQuadrado do número " + num2 + ": " +  quadradoNum2)
			escreva("\nQuadrado do número " + num3 + ": " +  quadradoNum3)
			escreva("\nQuadrado do número " + num4 + ": " +  quadradoNum4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 792; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */