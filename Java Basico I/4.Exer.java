class Main {
  public static void main(String[] args) {
    double n1;
    double desc, total;
    
    System.out.println("\nDigite o valor do produto:");
    n1 = Double.parseDouble(System.console().readLine());

    desc = n1 *10/100 ;
    total = n1-desc ;

    System.out.printf("\nO valor do desconto = %.2f\n",desc);

    System.out.printf("\nO valor toral do produto com desconto = %.2f\n",total);
  }
}