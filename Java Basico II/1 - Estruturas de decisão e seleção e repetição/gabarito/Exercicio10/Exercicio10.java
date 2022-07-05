public class Exercicio10 {
	public static void main(String[] args) {
		double notaTrabLab, notaAvSem, notaExFinal, media;
		char conceito = ' ';
		
		System.out.println("\nEste programa calcula media de um estudante e seu conceito, considerando que o estudante possui tres notas (um trabalho de laboratório, uma avaliação semestral e um exame final), com pesos 2, 3 e 5 respectivamente.\n");
		
		System.out.print("Nota no trabalho de laboratorio: ");
		notaTrabLab = Double.parseDouble(System.console().readLine());
		System.out.print("Nota na avaliacao semestral: ");
		notaAvSem = Double.parseDouble(System.console().readLine());
		System.out.print("Nota no exame final: ");
		notaExFinal = Double.parseDouble(System.console().readLine());
		
		media = (notaTrabLab * 2 + notaAvSem * 3 + notaExFinal * 5) / (2 + 3 + 5);
		
		if(media >= 8 && media <= 10)
			conceito = 'A';
		if(media >= 7 && media < 8)
			conceito = 'B';
		if(media >= 6 && media < 7)
			conceito = 'C';
		if(media >= 5 && media < 6)
			conceito = 'D';
		if(media < 5)
			conceito = 'E';
		
		System.out.printf("MEDIA FINAL = %.1f\n", media);
		System.out.printf("CONCEITO = %c\n", conceito);
	}
}