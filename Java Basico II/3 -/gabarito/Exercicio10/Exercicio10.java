public class Exercicio10 {
	public static void main(String[] args) {
		int opcao;
		double num1, num2, res;
		
		System.out.println("Menu de opcoes:\n");
		System.out.println("1. Somar dois numeros.");
		System.out.println("2. Numero ao quadrado.");
				
		System.out.print("\nDigite a opcao desejada: ");
		opcao = Integer.parseInt(System.console().readLine());
	
		switch(opcao) {
			case 1:
				System.out.print("\nDigite o primeiro numero: ");
				num1 = Double.parseDouble(System.console().readLine());
				System.out.print("\nDigite o segundo numero: ");
				num2 = Double.parseDouble(System.console().readLine());
				res = num1 + num2;
				System.out.printf("Soma dos numeros = %f\n", res);
				break;
				
			case 2:
				System.out.print("\nDigite o numero: ");
				num1 = Double.parseDouble(System.console().readLine());
				res = num1 * num1;
				System.out.printf("Quadrado do numero = %f\n", res);
				break;
			
			default:
				System.out.println("Opcao invalida!");
		}
	}
}