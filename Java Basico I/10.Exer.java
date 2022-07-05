class Main {
  public static void main(String[] args) {
    double pol, jar, mil;
    int n;

    System.out.println("\n DIGITE O NUMERO:  ");
    n = Integer.parseInt(System.console().readLine());

    pol= n * 12;

		jar= n * 3;
		
		mil = n * 1760;

    System.out.printf("\nO valor em polegadas  = %.2f",pol);
    System.out.printf("\nO valor em jardas  = %.2f",jar);
    System.out.printf("\nO valor em milhas  = %.2f",mil);
    }
}
