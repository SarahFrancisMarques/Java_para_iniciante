class Main {
  public static void main(String[] args) {
    
    int nasc,ano;
    double dia, semana, mes, idade;

    System.out.println("\nQual o ano que voce nasceu?  ");
    nasc = Integer.parseInt(System.console().readLine());

    System.out.println("\nQual e o ano atual?  ");
    ano = Integer.parseInt(System.console().readLine());
    
    idade = ano - nasc;
    System.out.printf("\nA sua idade: %.2f",idade);


    mes = idade * 12;
	  semana = idade * 4;
	  dia = idade * 365;


    System.out.printf("\nA idade da pessoa em meses: %.2f",mes);
    System.out.printf("\nA idade da pessoa em semana: %.2f",semana);
    System.out.printf("\nA idade da pessoa em dia: %.2f",dia);
    }
}
