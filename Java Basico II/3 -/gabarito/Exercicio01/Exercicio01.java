public class Exercicio01 {
	public static void main(String[] args) {
		int dia, mes, ano;
		String nomeMes;
		
		System.out.println("\nEste programa le uma data em numeros e mostra a mesma data com o mes por extenso.\n");
		
		System.out.print("Dia: ");
		dia = Integer.parseInt(System.console().readLine());
		System.out.print("Mes: ");
		mes = Integer.parseInt(System.console().readLine());
		System.out.print("Ano: ");
		ano = Integer.parseInt(System.console().readLine());
		
		switch(mes) {
			case 1: nomeMes = "Janeiro"; break;
			case 2: nomeMes = "Fevereiro"; break;
			case 3: nomeMes = "Março"; break;
			case 4: nomeMes = "Abril"; break;
			case 5: nomeMes = "Maio"; break;
			case 6: nomeMes = "Junho"; break;
			case 7: nomeMes = "Julho"; break;
			case 8: nomeMes = "Agosto"; break;
			case 9: nomeMes = "Setembro"; break;
			case 10: nomeMes = "Outubro"; break;
			case 11: nomeMes = "Novembro"; break;
			case 12: nomeMes = "Dezembro"; break;
			default: nomeMes = ""; // Necessario, pois caso contrario a variavel pode ficar sem valor quando o usuario digitar valores invalidos para o mes (como -1 ou 14, por exemplo).
		}
		
		System.out.printf("\nDATA = %d de %s de %d\n", dia, nomeMes, ano);
	}
}