public class Exercicio02 {
	public static void main(String[] args) {
		int n, cont, soma, somaQuad;
		double media;
		
		System.out.println("Este programa calcula a soma, a soma dos quadrados e a media dos N primeiros numeros positivos.\n");
		System.out.print("Digite o valor de N: ");
		n = Integer.parseInt(System.console().readLine());
		
		soma = 0;
		somaQuad = 0;
		cont = 1;
		while(cont <= n) {
			soma = soma + cont;
			somaQuad = somaQuad + cont * cont;
			cont = cont + 1;
		}
		media = (double)soma / n; // O termo (double) antes de "soma" permite tratar o valor dessa variavel como double na divisao.
								  // Isso foi feito para que o resultado da divisao seja exato (divisao entre inteiros sempre gera um 
								  // valor inteiro.
		
		System.out.printf("SOMA DOS NUMEROS = %d\n", soma);
		System.out.printf("SOMA DOS QUADRADOS DOS NUMEROS = %d\n", somaQuad);
		System.out.printf("MEDIA DOS NUMEROS = %f\n", media);
	}
}