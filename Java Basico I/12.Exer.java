class Main {
  public static void main(String[] args) {


    double preco_fab, perc_lucro, perc_imp;
    double valor_dist, valor_imp, preco_final;

    System.out.println("\nQual e o preço do carro? ");
    preco_fab = Double.parseDouble(System.console().readLine());

    System.out.println("\nQual o percentual do lucro?  ");
    perc_lucro = Double.parseDouble(System.console().readLine());

    System.out.println("\nQual o percentual do imposto?  ");
    perc_imp = Double.parseDouble(System.console().readLine());
    
    valor_dist = preco_fab * perc_lucro /100;
		valor_imp = preco_fab * perc_imp /100;
		preco_final = preco_fab + valor_dist + valor_imp;


    System.out.printf("\nO valor do lucro distribuidor: %.2f",valor_dist);
    System.out.printf("\nO valor do imposto: %.2f",valor_imp);
    System.out.printf("\nO preço final: %.2f",preco_final);
    }
}
