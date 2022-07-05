class Main {
  public static void main(String[] args) {
    double n1, n2, cal;
    
    System.out.println("Digite o primeiro numero: ");
    n1 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o segundo numero que seje maior que 0: ");
    n2 = Double.parseDouble(System.console().readLine());

    cal = (n1 / n2);
    System.out.println(cal);

  }
}
