public class Exercicio06 {
	public static void main(String[] args) {
		int N1, N2, N3, N4;
		
		System.out.println("\nEste programa verifica se quatro numeros digitados sao divisiveis por 2 ou por 3.\n");
		
		System.out.print("Digite o primeiro valor.: ");
		N1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo valor..: ");
		N2 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o terceiro valor.: ");
		N3 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o quarto valor...: ");
		N4 = Integer.parseInt(System.console().readLine());
		
		if(N1 % 2 == 0 || N1 % 3 == 0)
			System.out.println("O primeiro valor é divisível por 2 ou por 3");
		if(N2 % 2 == 0 || N2 % 3 == 0)
			System.out.println("O segundo valor é divisível por 2 ou por 3");
		if(N3 % 2 == 0 || N3 % 3 == 0)
			System.out.println("O terceiro valor é divisível por 2 ou por 3");
		if(N4 % 2 == 0 || N4 % 3 == 0)
			System.out.println("O quarto valor é divisível por 2 ou por 3");
	}
}