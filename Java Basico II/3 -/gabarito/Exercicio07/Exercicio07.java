public class Exercicio07 {
	public static void main(String[] args) {
		int quad;
		
		System.out.println("Este programa mostra os quadrados dos numeros inteiros de 15 a 200.\n");
		
		for(int numero = 15; numero <= 200; numero = numero + 1) {
			quad = numero * numero;
			System.out.printf("%d ao quadrado = %d\n", numero, quad);
		}
	}
}