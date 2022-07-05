public class Exercicio09 {
	public static void main(String[] args) {
		double salario, aumento, novoSalario;
		
		System.out.println("\nEste programa calcula o aumento de 30% no salario de um funcionario. Um funcionario terah direito a aumento somente se ganhar abaixo de R$ 5.000,00.\n");
		
		System.out.print("Digite o salario do funcionario: ");
		salario = Double.parseDouble(System.console().readLine());
		
		if(salario < 5000) {
			aumento = salario * 30 / 100;
			novoSalario = salario + aumento;
			System.out.printf("NOVO SALARIO = R$ %.2f\n", novoSalario);
		} else 
			System.out.println("Este funcionário não tem direito a aumento.");
	}
}