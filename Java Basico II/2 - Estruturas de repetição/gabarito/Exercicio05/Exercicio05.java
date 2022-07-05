public class Exercicio05 {
	public static void main(String[] args) {
		int numViagens, cont;
		double litrosComb, distancia, somaKML, mediaKML;
		
		System.out.println("Este programa calcula a media de km/l de um automovel, a partir de dados de varias viagens.\n");
		
		System.out.print("Digite a quantidade de viagens: ");
		numViagens = Integer.parseInt(System.console().readLine());
		
		cont = 0;
		somaKML = 0;
		while(cont < numViagens) {
			System.out.printf("\n--- VIAGEM %02d ---\n", cont+1);
			System.out.print("Litros de combustivel consumidos: ");
			litrosComb = Double.parseDouble(System.console().readLine());
			System.out.print("Distancia total percorrida(km): ");
			distancia = Double.parseDouble(System.console().readLine());
			
			somaKML = somaKML + distancia / litrosComb;
			cont = cont + 1;
		}
		
		mediaKML = somaKML / numViagens;
		System.out.printf("CONSUMO MEDIO DO AUTOMOVEL = %.1f km/l\n", mediaKML);
	}
}