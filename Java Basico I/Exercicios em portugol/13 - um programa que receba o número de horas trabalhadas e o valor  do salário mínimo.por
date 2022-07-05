programa
{
	
	funcao inicio()
	{
		real horas_trabalhas,valor_salario_minimo, valor_horas_trabalhas
		real salario_bruto_trabalha, percentual_imposto, imposto, valor_salario_liquido

		percentual_imposto = 0.03
		
		escreva("\n A quatidade de horas trabalhas: ")
		leia(horas_trabalhas)

		escreva("\n O valor do salario minimo: ")
		leia(valor_salario_minimo)

		valor_horas_trabalhas = valor_salario_minimo / 10
		salario_bruto_trabalha = valor_horas_trabalhas * horas_trabalhas
		imposto = salario_bruto_trabalha * percentual_imposto /100
		valor_salario_liquido = salario_bruto_trabalha - imposto

		escreva("\n O valor de horas trabalhas: ",valor_horas_trabalhas )
		escreva("\n O valor do salario bruto: ",salario_bruto_trabalha )
		escreva("\n O valor do imposto: ",imposto )
		

		escreva("\n O valor do salario liquido: ",valor_salario_liquido )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 769; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */