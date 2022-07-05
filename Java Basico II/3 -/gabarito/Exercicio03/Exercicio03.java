public class Exercicio03 {
	public static void main(String[] args) {
		double numero, soma;
		
		soma = 0;
		for(int cont = 0; cont < 10; cont = cont + 1) {
			System.out.print("Digite um numero: ");
			numero = Double.parseDouble(System.console().readLine());
			soma = soma + numero;
		}
		
		System.out.printf("SOMA DOS NUMEROS DIGITADOS = %f\n", soma);
	}
}