programa
{
	
	funcao inicio()
	{
		inteiro c
		real n
		const real valorGanhoPorHora = 10.00
		const real valorGanhoPorHoraExtra = 20.00

		escreva("Código: ")
		leia(c)

		escreva("Horas trabalhadas: ")
		leia(n)

		real excesso = 0.0
		se(n > 50) {
			excesso = n - 50
			n -= excesso
		}

		real salario =  valorGanhoPorHora * n
		
		real salarioExtra =  valorGanhoPorHoraExtra * excesso
		
		

		escreva("Salario: " + salario + "\nHoras Extras: " + excesso + "\nSalário Total: " + (salario + salarioExtra))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */