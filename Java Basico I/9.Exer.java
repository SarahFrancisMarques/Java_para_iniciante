class Main {
  public static void main(String[] args) {
    double lado, area;
    
    System.out.println("Qual e o valor do lado? ");
    lado = Double.parseDouble(System.console().readLine());

    area = lado*lado;
    System.out.printf("A area do quadrado  = %.2f",area);
    }
}
