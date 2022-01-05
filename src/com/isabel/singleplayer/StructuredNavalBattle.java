package com.isabel.singleplayer;
import java.util.Random;
import java.util.Scanner;

public class StructuredNavalBattle {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random position = new Random();

		String[][] tabuleiro = new String[8][8];

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

		for (int contSub = 0; contSub <= 4; contSub++) {
			System.out.println("\nEscolha a " + (contSub + 1) + "ª posição do seu Navio Submarino");
			System.out.println("Linha");
			linha = leia.nextInt();
			System.out.println("Coluna");
			coluna = leia.nextInt();
			
			if (coluna >= tabuleiro.length || linha >= tabuleiro.length) {
				System.out.println("Digite corretamente a posição!");
				contSub--;
			} else if(tabuleiro[linha][coluna] == ">"){			
				System.out.println("Você já posicionou um navio aqui, escolha outra posição!");
				contSub--;
			}else {
				tabuleiro[linha][coluna] = ">";	
			}
		}
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
		
		Scanner tiro = new Scanner(System.in);
		int contacerto = 0;
		
		System.out.println("\n════ CAMPO DE BATALHA ════");
		
		for (int conttiro = 0; conttiro <= 5; conttiro++) {
			System.out.println("\nEscolha onde quer dar seu " + (conttiro + 1) + "º tiro");
			System.out.println("Linha");
			linha = tiro.nextInt();
			System.out.println("Coluna");
			coluna = tiro.nextInt();
			
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
		
		System.out.print(
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
		System.out.println("\n Quantidade de navios afundados: " + contacerto);
	}
	
}
