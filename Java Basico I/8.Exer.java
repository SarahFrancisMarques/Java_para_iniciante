class Main {
  public static void main(String[] args) {
    double altura, base, area;
    
    System.out.println("Qual e a altura? ");
    altura = Double.parseDouble(System.console().readLine());

    System.out.println("Qual e a base? ");
    base = Double.parseDouble(System.console().readLine());

    area = (altura * base) / 2;
    System.out.printf("A area do triangulo  = %.2f",area);
    }
}
