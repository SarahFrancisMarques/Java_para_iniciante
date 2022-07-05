programa
{
	
	funcao inicio()
	{
		real preco_fabrica, percentual_lucro, percentual_imposto,valor_distribuidor, valor_imposto, preco_final

		
		escreva("qual o preco do carro: ")
		leia(preco_fabrica)

		escreva("qual o percentual do lucro: ")
		leia(percentual_lucro)

		escreva("qual o percentual do imposto: ")
		leia(percentual_imposto)

		valor_distribuidor = preco_fabrica * percentual_lucro /100
		valor_imposto = preco_fabrica * percentual_imposto /100
		preco_final = preco_fabrica + valor_distribuidor + valor_imposto

		
		escreva("\n O valor do lucro da distribuidor: ",valor_distribuidor )

		escreva("\n O valor imposto: ",valor_imposto )

		escreva("\n O preco final: ",preco_final )


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */