public class Exercicio04 {
	public static void main(String[] args) {
		double A, B, C;
		
		System.out.println("\nEste programa verifica se as medidas de tres lados formam um triangulo.\n");
		
		System.out.print("Digite a primeira medida.: ");
		A = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a segunda medida..: ");
		B = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a terceira medida.: ");
		C = Double.parseDouble(System.console().readLine());
		
		if(A + B > C && A + C > B && B + C > A)
			System.out.println("Os lados formam um triangulo");
		else
			System.out.println("Os valores informados nao podem formar um triangulo");
	}
}