programa"calcular_preco"
{
	
	funcao inicio()
	{
		inteiro n1,desc,total
		
		escreva("Digite o valor do produto: R$ ")
		leia(n1)

		desc = n1 *10/100

		escreva("\nDesconto: R$ ",desc)
		
		total = n1-desc
		escreva("\npreco novo: R$ ",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */