programa"peso_das_notas"
{
	
	funcao inicio()
	{
		real n1,n2,n3, p1,p2,p3,soma_p,media_p
		
		escreva("Digite a primeira nota: ")
		leia(n1)

		escreva("Digite a segunda nota: ")
		leia(n2)

		escreva("Digite a terceira nota: ")
		leia(n3)

		escreva("Digite a primeira peso: ")
		leia(p1)

		escreva("Digite a segunda peso: ")
		leia(p2)

		escreva("Digite a terceira peso: ")
		leia(p3)

		soma_p = p1+p2+p3

		media_p = ((n1*p1)+(n2*p2)+(n3*p3))/soma_p

		escreva("Media: ", media_p)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 23; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */