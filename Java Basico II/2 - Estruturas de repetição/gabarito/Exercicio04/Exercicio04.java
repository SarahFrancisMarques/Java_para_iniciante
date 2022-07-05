public class Exercicio04 {
	public static void main(String[] args) {
		int idade, soma = 0, quantIdades = 0;
		double media;
		
		System.out.println("Este programa calcula a media de idades digitadas por voce. Termine a lista de idades digitando zero.\n");
		
		System.out.print("Digite uma idade: ");
		idade = Integer.parseInt(System.console().readLine());
		
		while(idade != 0) {
			soma = soma + idade;
			quantIdades = quantIdades + 1;
			System.out.print("Digite outra idade: ");
			idade = Integer.parseInt(System.console().readLine());
		}
		
		media = (double)soma / quantIdades;
		System.out.printf("MEDIA DE IDADES = %.1f\n", media);
	}
}