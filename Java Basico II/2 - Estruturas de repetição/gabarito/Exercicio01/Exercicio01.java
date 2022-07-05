public class Exercicio01 {
	public static void main(String[] args) {
		double numero, soma;
		int cont;
		
		soma = 0;
		cont = 0;
		while(cont < 10) {
			System.out.print("Digite um numero: ");
			numero = Double.parseDouble(System.console().readLine());
			soma = soma + numero;
			cont = cont + 1;
		}
		
		System.out.printf("SOMA DOS NUMEROS DIGITADOS = %f\n", soma);
	}
}