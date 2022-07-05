programa"MEDIA" 
{ 
 funcao inicio() 
 { 
 real n1, n2, n3, med,notaex
 
 escreva("Digite o 1 numero: ") 
 leia(n1) 
 escreva("Digite o 2 numero: ") 
 leia(n2)
 escreva("Digite o 3 numero: ") 
 leia(n3) 

med = (n1+n2+n3)/3
escreva("\nMedia: ", med) 

 se (med>=0 e med<3) senao{
 	escreva("\nReprovado")
 }

se (med>=3 e med <7)senao{
	escreva("\nEXAME")
	notaex = 12 - med
	escreva("\nA nota do exame: ",notaex)
}

 se (med>=7) senao{
 	escreva("\nAprovado")
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