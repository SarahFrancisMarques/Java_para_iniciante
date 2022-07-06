class Main {
  public static void main(String[] args) {
    double n1, n2, n3;
    double med;
    
    System.out.println("Digite o primeira nota: ");
    n1 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o segunda nota: ");
    n2 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o terceira nota: ");
    n3 = Double.parseDouble(System.console().readLine());

    med = (n1+n2+n3)/3;
    System.out.printf("Media final = %.2f",med);

  }
}


