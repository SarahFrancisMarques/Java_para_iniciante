public class Exercicio03 {
	public static void main(String[] args) {
		double numero, quad;
		
		System.out.println("Este programa calcula os quadrados de numeros digitados por voce, ate que voce digite um numero negativo.\n");
		
		System.out.print("Digite um numero: ");
		numero = Double.parseDouble(System.console().readLine());
		
		while(numero >= 0) {
			quad = numero * numero;
			System.out.printf("QUADRADO DO NUMERO DIGITADO = %f\n", quad);
			System.out.print("Digite um numero: ");
			numero = Double.parseDouble(System.console().readLine());
		}
	}
}