public class Exercicio01 {
	public static void main(String[] args) {
		int num1, num2, dif = 0;
		
		System.out.println("\nEste programa calcula a diferenca entre dois numeros, devolvendo sempre o resultado positivo.\n");
		
		System.out.print("Digite o primeiro numero.: ");
		num1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo numero..: ");
		num2 = Integer.parseInt(System.console().readLine());
		
		if(num1 < num2)
			dif = num2 - num1;
		if(num1 > num2)
			dif = num1 - num2;
		if(num1 == num2)
			dif = 0;
		
		System.out.printf("\nDIFERENCA ENTRE OS NUMEROS = %d\n", dif);
	}
}