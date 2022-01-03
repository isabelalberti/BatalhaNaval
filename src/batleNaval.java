import java.util.Random;
import java.util.Scanner;

public class batleNaval {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random position = new Random();

		int[][] tabuleiro = new int[8][8];

		int destroier = 2;
		int submarino = 1;
		
		int coluna;
		int linha;
		
		System.out.print(" | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | \n");
				
		for (linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print(linha);
		for (coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
			tabuleiro[linha][coluna] = 0;
			System.out.print("|  " + tabuleiro[linha][coluna]);	
				
			}
		
			System.out.print("|");
			System.out.print("\n");
			
		}
			System.out.print("═══════════════════════════");
		
		System.out.println("\nEscolha a posição do seu navio");
		linha =leia.nextInt();
		coluna = leia.nextInt();
		tabuleiro[linha][coluna] = 7;
		
		for (linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print(linha);
		for (coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
			
			System.out.print("|  " + tabuleiro[linha][coluna]);	
		}
		System.out.print("\n");

		}
		
		String[][] campoDeBatalha = new String[8][8];
        System.out.println(
                "\n------------------------------------------\n" +
                "    CAMPO DE BATALHA\n"+
                "  ║ 0 | 1 | 2 | 3 | 4 |\n" +
                        "═══════════════════════"
        );
		
		
		
	}	
	
}
	

