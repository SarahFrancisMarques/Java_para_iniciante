class Main {
  public static void main(String[] args){
    double sal_final, coms,vendas, sal_fixo;

    System.out.println("Qual foi o numero de vendas? ");
    vendas = Double.parseDouble(System.console().readLine());

    System.out.println("Qual e o salario fixo? ");
    sal_fixo = Double.parseDouble(System.console().readLine());

    coms = vendas * 4 / 100 ;
    sal_final = coms + sal_fixo;

    System.out.printf("\nA comissao R$ %.2f ", coms);
    System.out.printf("\nO salario final R$ %.2f", sal_final);

  }
}