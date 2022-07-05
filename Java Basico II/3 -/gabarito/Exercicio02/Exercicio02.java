public class Exercicio02 {
	public static void main(String[] args) {
		int placa;
		String mesVistoria = "";
		
		System.out.println("\nEste programa le o numero da placa de um carro e mostra quanto deve ser feita a proxima vistoria.\n");
		
		System.out.print("Numero da placa (apenas os ultimos 4 digitos): ");
		placa = Integer.parseInt(System.console().readLine());
	
		switch(placa % 10) {
			case 0: mesVistoria = "Janeiro do proximo ano"; break;
			case 1: mesVistoria = "Fevereiro do proximo ano"; break;
			case 2: mesVistoria = "Marco do proximo ano"; break;
			case 3: mesVistoria = "Abril do proximo ano"; break;
			case 4: mesVistoria = "Maio do proximo ano"; break;
			case 5: mesVistoria = "Junho do proximo ano"; break;
			case 6: mesVistoria = "Setembro deste ano"; break;
			case 7: mesVistoria = "Outubro deste ano"; break;
			case 8: mesVistoria = "Novembro deste ano"; break;
			case 9: mesVistoria = "Dezembro deste ano"; break;
		}
		
		System.out.printf("\nVistoria em %s.\n", mesVistoria);
	}
}