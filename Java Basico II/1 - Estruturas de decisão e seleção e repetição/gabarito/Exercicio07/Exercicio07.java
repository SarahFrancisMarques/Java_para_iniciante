public class Exercicio07 {
	public static void main(String[] args) {
		int N1, N2, N3;
		
		System.out.println("\nEste programa verifica o maior de tres valores lidos.\n");
		
		System.out.print("Digite o primeiro valor.: ");
		N1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo valor..: ");
		N2 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o terceiro valor.: ");
		N3 = Integer.parseInt(System.console().readLine());
		
		if(N1 >= N2 && N1 >= N3)
			System.out.printf("O maior valor informado foi %d.\n", N1);
		if(N2 > N1 && N2 > N3)
			System.out.printf("O maior valor informado foi %d.\n", N2);
		if(N3 > N1 && N3 > N2)
			System.out.printf("O maior valor informado foi %d.\n", N3);
	}
}