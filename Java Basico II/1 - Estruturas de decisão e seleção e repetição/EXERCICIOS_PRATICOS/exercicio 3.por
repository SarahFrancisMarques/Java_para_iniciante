programa
{
	
	funcao inicio()
	{
		real a,b,c,delta
		
		escreva("Digite 1 numero: ")
		leia(a)
		escreva("Digite 2 numero: ")
		leia(b)
		escreva("Digite 3 numero: ")
		leia(c)

		delta = (b*b) - (4*a*c)
		escreva("\nO valor de delta: ",delta)

		se (delta < 0){
			escreva("\nNAo possui raíz real")
		}
		se (delta > 0){
			escreva("\nPossui raíz real")
		}
		se (delta == 0){
			escreva("\nMostrar que possui uma única raiz real")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */