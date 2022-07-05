class Main {
  public static void main(String[] args) {

    
    double horas_trab,valor_sal_min, valor_horas_trab;
		double sal_bruto_trab, perc_imp, imp, valor_sal_liq;

		perc_imp = 0.03;

    System.out.println("\nQual a quantidade de horas trabalhada? ");
    horas_trab = Double.parseDouble(System.console().readLine());

    System.out.println("\nQual e o salario minimo?  ");
    valor_sal_min = Double.parseDouble(System.console().readLine());

    System.out.println("\nQual o percentual do imposto?  ");
    perc_imp = Double.parseDouble(System.console().readLine());
    
    valor_horas_trab = valor_sal_min / 10;
		sal_bruto_trab = valor_horas_trab * horas_trab;
		imp = sal_bruto_trab * perc_imp /100;
		valor_sal_liq = sal_bruto_trab - imp;


    System.out.printf("\nO valor de horas trabalhadas: %.2f",valor_horas_trab);
    System.out.printf("\nO valor do salario bruto: %.2f",sal_bruto_trab);
    System.out.printf("\nO valor do impsoto: %.2f",imp);
    System.out.printf("\nO valor do salario liquido: %.2f",valor_sal_liq);
    }
}
