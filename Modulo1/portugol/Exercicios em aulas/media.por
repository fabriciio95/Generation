programa
{
	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 * nome e nota de 5 alunes
		 * media de notas 
		 * maior nota
		 * quantos alunos tiverem nota menor ou igual a 5
		 * 
		 * TODO MULTIPLO DE UM NUMERO O RESTO DELE É ZERO
		*/


		cadeia nome
		real media = 0.0
		real soma = 0.0
		real nota = 0.0
		real maiorNota = 0.0
		inteiro alunosReprovados = 0

	
		para(inteiro i = 0; i < 5; i++) {
			escreva("Nome do Aluno: ")
			leia(nome)

			escreva("Nota: ")
			leia(nota)

			soma += nota // soma = soma + nota

			se(nota > maiorNota) {
				maiorNota = nota
			}

			se (nota <= 5) {
				alunosReprovados += 1
			}
		}

		media = soma / 5

		escreva("Média de notas: " +  mat.arredondar(media, 1) + "\nMaior nota: " + maiorNota + "\nAlunos reprovados: " + alunosReprovados)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */