class Main {
  public static void main(String[] args) {
    double sal, grat,imp,sal_final;


    System.out.println("\nDigite o salario:");
    sal = Double.parseDouble(System.console().readLine());

    grat = sal *0.05 ;
    imp = sal * 0.07 ;

    System.out.printf("\nO valor da gratificaçao = %.2f\n",grat);

    System.out.printf("\nO valor do imposto = %.2f\n",imp);

    sal_final = sal + grat - imp;
    System.out.printf("O salario final : R$ %.2f",sal_final);
  }
}