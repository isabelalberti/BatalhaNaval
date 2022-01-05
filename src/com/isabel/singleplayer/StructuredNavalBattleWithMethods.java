package com.isabel.singleplayer;
import java.util.Random;
import java.util.Scanner;

public class StructuredNavalBattleWithMethods {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String[][] tabuleiro = new String[8][8];

		int coluna;
		int linha;
		int contAcerto = 0;
		
		printAndInitboard(tabuleiro);
		positionShip(tabuleiro);
		printPositionShip(tabuleiro);
		contAcerto = positionShot(tabuleiro, contAcerto);		
		printPositionShot(tabuleiro);
		
		System.out.println("\n Quantidade de navios afundados: " + contAcerto);
}
	
	public static void positionShip (String[][] tabuleiro) {
		
		int coluna;
		int linha;
		Scanner leia = new Scanner(System.in);
		
				
		for (int contSub = 0; contSub <= 4; contSub++) {
			System.out.println("\nEscolha a " + (contSub + 1) + "ª posição do seu Navio Submarino");
			String posicaoLida = leia.nextLine();
			var posicaoArray = posicaoLida.trim().split(",");
			linha = Integer.parseInt(posicaoArray[0].trim());
			coluna = Integer.parseInt(posicaoArray[1].trim());
						
			if (coluna >= tabuleiro.length || linha >= tabuleiro.length) {
				System.out.println("Digite corretamente a posição!");
				contSub--;
			} else if(tabuleiro[linha][coluna] == ">"){			
				System.out.println("Você já posicionou um navio aqui, escolha outra posição!");
				contSub--;
			} else {
				tabuleiro[linha][coluna] = ">";	
			}
		}
	}
	public static void printAndInitboard(String[][] tabuleiro) {
		int coluna;
		int linha;
		
		System.out.print(
				  " ╔════╦════╦════╦════╦════╦════╦════╦════╦═══╗\n"
				+ " ║    ║ 0  ║ 1  ║ 2  ║ 3  ║ 4  ║ 5  ║ 6  ║ 7 ║  \n"
				+ " ║    ╠════╬════╬════╬════╬════╬════╬════╬═══╣\n");

		for (linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print(" ║ " + " " + linha);
			for (coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				tabuleiro[linha][coluna] = "0";
				System.out.print(" ║ " + tabuleiro[linha][coluna] + " ");
			}

			System.out.print("║");
			System.out.print("\n");
		}
		System.out.print(" ╚════╩════╩════╩════╩════╩════╩════╩════╩═══╝");
	}
	
	public static void printPositionShip(String[][] tabuleiro) {
		int coluna;
		int linha;
		
		System.out.print(
				  " ╔════╦════╦════╦════╦════╦════╦════╦════╦═══╗\n"
				+ " ║    ║ 0  ║ 1  ║ 2  ║ 3  ║ 4  ║ 5  ║ 6  ║ 7 ║  \n"
				+ " ║    ╠════╬════╬════╬════╬════╬════╬════╬═══╣\n");

		for (linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print(" ║ " + " " + linha);
			for (coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				System.out.print(" ║ " + tabuleiro[linha][coluna] + " ");
			}

			System.out.print("║");
			System.out.print("\n");
		}
		
		System.out.print(" ╚════╩════╩════╩════╩════╩════╩════╩════╩═══╝");
	}
	
	public static int positionShot(String[][] tabuleiro, int contacerto) {
		int linha;
		int coluna;
		
		Scanner tiro = new Scanner(System.in);
		
		
		System.out.println("\n"
				+ "\n ════ CAMPO DE BATALHA ════");
		
		for (int conttiro = 0; conttiro <= 5; conttiro++) {
			System.out.println("\nEscolha onde quer dar seu " + (conttiro + 1) + "º tiro");
			String posicaoLida = tiro.nextLine();
			var posicaoArray = posicaoLida.trim().split(",");
			linha = Integer.parseInt(posicaoArray[0].trim());
			coluna = Integer.parseInt(posicaoArray[1].trim());
			
			if (coluna >= tabuleiro.length || linha >= tabuleiro.length) {
				System.out.println("Digite corretamente a posição!");
				conttiro--;
			} else if(tabuleiro[linha][coluna] == ">"){			
				tabuleiro[linha][coluna] = "X";
				contacerto++;
			}else {
				tabuleiro[linha][coluna] = "A";
			}
		}
		
		return contacerto;
	}
	
	public static void printPositionShot(String[][] tabuleiro) {
		int linha;
		int coluna;
	
		System.out.print("\n" + 
				  " ╔════╦════╦════╦════╦════╦════╦════╦════╦═══╗\n"
				+ " ║    ║ 0  ║ 1  ║ 2  ║ 3  ║ 4  ║ 5  ║ 6  ║ 7 ║\n"
				+ " ║    ╠════╬════╬════╬════╬════╬════╬════╬═══╣\n");

		for (linha = 0; linha < tabuleiro.length; linha++) {
			System.out.print(" ║ " + " " + linha);
			for (coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				System.out.print(" ║ " + tabuleiro[linha][coluna] + " ");
			}

			System.out.print("║");
			System.out.print("\n");
		}
		System.out.print(" ╚════╩════╩════╩════╩════╩════╩════╩════╩═══╝");
	}
	
}
