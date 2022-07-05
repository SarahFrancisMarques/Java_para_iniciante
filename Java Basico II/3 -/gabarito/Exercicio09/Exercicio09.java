public class Exercicio09 {
	public static void main(String[] args) {
		int cont, penultimo, ultimo, aux;
		
		System.out.println("\nEste programa mostra os 10 primeiros numeros da sequencia de Fibonacci\n");
		
		penultimo = 0;
		ultimo = 1;
		cont = 0;
		do {
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
			cont = cont + 1;
		} while(cont < 10);
	}
}