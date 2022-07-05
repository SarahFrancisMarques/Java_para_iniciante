public class Exercicio08 {
	public static void main(String[] args) {
		int senha;
		
		System.out.println("\nEste programa repetira a solicitacao de uma senha numerica ate que voce acerte.\n");
		
		do {
			System.out.print("Digite a senha: ");
			senha = Integer.parseInt(System.console().readLine());
		} while(senha != 1234);
		
		System.out.println("\nSenha correta, acesso liberado.");
	}
}