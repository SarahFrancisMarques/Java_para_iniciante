programa"vendas"
{
	
	funcao inicio()
	{
		real sal_final, comissao, vendas, sal_fixo
		
		escreva("qual o salario fixo: R$ ")
		leia(sal_fixo)

		escreva("qual o valor das vendas: R$ ")
		leia(vendas)

		comissao = vendas *4/100
		escreva("\nA comissao: R$ ",comissao)
		
		sal_final = comissao + sal_fixo
		escreva("\nO salario final: R$ ",sal_final)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */