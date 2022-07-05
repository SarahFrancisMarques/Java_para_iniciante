programa"calcular_preco"
{
	
	funcao inicio()
	{
		real salario,gratificacao,imposto,salario_final
		
		escreva("Digite o valor do produto: R$ ")
		leia(salario)

		gratificacao = salario * 0.05
		escreva("\nValor da graificacao: R$ ",gratificacao)
		
		imposto = salario * 0.07
		escreva("\nvalor do imposto: R$ ",imposto)

		
		salario_final = salario + gratificacao - imposto
		escreva("\nSalario: R$ ",salario_final)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */