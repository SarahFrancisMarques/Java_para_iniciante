class Main {
  public static void main(String[] args) {
    double c,f;
    
    System.out.println("Digite a temperatura em celsius: ");
    c = Double.parseDouble(System.console().readLine());

    f = ((9*c)/5)+32;
    System.out.printf("\n A temperatura em fahrenheit = %.2f",f);
    }
}
