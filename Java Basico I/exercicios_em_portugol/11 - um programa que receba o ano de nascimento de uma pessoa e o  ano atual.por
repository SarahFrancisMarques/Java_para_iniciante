programa"Idade_da_pessoa"
{
	
	funcao inicio()
	{
		inteiro nasc, ano, idade, meses, semana, dias
		
		escreva("Em que ano voce naceu? ")
		leia(nasc)

		escreva("Em que ano estamos? ")
		leia(ano)

		idade = ano - nasc
		escreva("\n A idade: ", idade)

		meses = idade * 12
		semana = idade * 4
		dias = idade * 365

		escreva("\n A idade da pessoa em meses: ", meses)

		escreva("\n A idade da pessoa em semanas: ",semana)

		escreva("\n A idade da pessoa em dias: ",dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 59; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */