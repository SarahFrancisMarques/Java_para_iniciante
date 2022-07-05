class Main {
  public static void main(String[] args) {

    double valor_sal, quant_kw, valor_kw;
		double valor_reais,perc_desc,desc,valor_desc;


    System.out.println("\nQual o valor do salario? ");
    valor_sal = Double.parseDouble(System.console().readLine());

    System.out.println("\nQual e a  quantidade kw usado?  ");
    quant_kw = Double.parseDouble(System.console().readLine());
    
    perc_desc = 0.15;
   
    valor_kw =  valor_sal / 5;
	  valor_reais = valor_kw * quant_kw;
	  desc = valor_reais * perc_desc /100;
	  valor_desc = valor_reais - desc;


    System.out.printf("\nO valor em kw: %.2f",valor_kw);
    System.out.printf("\nO valorem reais: %.2f",valor_reais);
    System.out.printf("\nO valor com desconto: %.2f",valor_desc);
    }
}