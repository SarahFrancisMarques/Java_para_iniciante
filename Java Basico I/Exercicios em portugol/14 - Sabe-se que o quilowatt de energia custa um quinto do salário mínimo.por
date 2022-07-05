programa
{
	
	funcao inicio()
	{
		real valor_salario, quantidade_kw, valor_kw
		real valor_reais,percentual_desconto,desconto,valor_desconto

	     escreva("Digite o salario: ")
	     leia(valor_salario)

	     escreva("Digite a quantidade kw: ")
	     leia(quantidade_kw)

	     percentual_desconto = 0.15

	    valor_kw =  valor_salario / 5
	    valor_reais = valor_kw * quantidade_kw
	    desconto = valor_reais * percentual_desconto /100
	    valor_desconto = valor_reais - desconto

	    escreva("\n O valor do salario em quilowatt: ",valor_kw)
	    escreva("\n O valor do salario em reais: ",valor_reais)
	    escreva("\n O valor do salario com desconto: ",valor_desconto)
	     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */