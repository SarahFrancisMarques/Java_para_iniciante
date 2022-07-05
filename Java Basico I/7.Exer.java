class Main {
  public static void main(String[] args) {
    double n1, n2, n3;
    double p1, p2, p3;
    double somap , med;
    
    System.out.println("Digite o primeira nota: ");
    n1 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o segunda nota: ");
    n2 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o terceira nota: ");
    n3 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o primeiro peso: ");
    p1 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o segundo peso: ");
    p2 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o terceiro peso: ");
    p3 = Double.parseDouble(System.console().readLine());

    somap = p1 + p2 +p3 ;

    med = (n1*p1+n2*p2+n3*p3)/somap;
    System.out.printf("Media final = %.2f",med);
      }
}
