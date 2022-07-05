public class Exercicio03 {
	public static void main(String[] args) {
		double A, B, C, delta;
		
		System.out.println("\nEste programa verifica quantas raizes reais possui uma equacao de segundo grau.\n");
		
		System.out.print("Digite o valor do coeficiente A.: ");
		A = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o valor do coeficiente B.: ");
		B = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o valor do coeficiente C.: ");
		C = Double.parseDouble(System.console().readLine());
		
		delta = B * B - 4 * A * C;
		
		if(delta > 0)
			System.out.println("A equacao possui duas raizes reais.");
		if(delta == 0)
			System.out.println("A equacao possui uma raiz real.");
		if(delta < 0)
			System.out.println("A equacao nao possui raizes reais.");
	}
}