public class Exercicio02 {
	public static void main(String[] args) {
		int numero;
		
		System.out.println("\nEste programa verifica se um numero estah entre 1 e 9.\n");
		
		System.out.print("Digite numero.: ");
		numero = Integer.parseInt(System.console().readLine());
		
		if(numero >= 1 && numero <= 9)
			System.out.println("O valor está na faixa permitida");
		else
			System.out.println("O valor está fora da faixa permitida");
	}
}