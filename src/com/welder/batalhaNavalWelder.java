package com.welder;

import java.util.Scanner;

public class batalhaNavalWelder {

	public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int tamanhoTabuleiro = 5;
	        int[][] tabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];

	        System.out.println(
	                "  ║ 0 | 1 | 2 | 3 | 4 |\n" +
	                "═══════════════════════"
	        );

	        for (int i = 0; i < tabuleiro.length; i++) {
	            System.out.print(i + " ║");

	            for (int j = 0; j < tabuleiro[i].length; j++) {
	                tabuleiro[i][j] = 0;
	                System.out.print(" " + tabuleiro[i][j] + " |");

	            }System.out.print("\n");
	        }

	        posicionarNavio(tabuleiro);

	        System.out.println(
	                "  ║ 0 | 1 | 2 | 3 | 4 |\n" +
	                "═══════════════════════"
	        );
	        for (int i = 0; i < tabuleiro.length; i++) {
	            System.out.print(i + " ║");

	            for (int j = 0; j < tabuleiro[i].length; j++) {
	                System.out.print(" " + tabuleiro[i][j] + " |");

	            }
	            System.out.print("\n");
	        }

	        String[][] campoDeBatalha = new String[tamanhoTabuleiro][tamanhoTabuleiro];
	        System.out.println(
	                "\n------------------------------------------\n" +
	                "    CAMPO DE BATALHA\n"+
	                "  ║ 0 | 1 | 2 | 3 | 4 |\n" +
	                        "═══════════════════════"
	        );

	        for (int i = 0; i < campoDeBatalha.length; i++) {
	            System.out.print(i + " ║");

	            for (int j = 0; j < campoDeBatalha[i].length; j++) {
	                campoDeBatalha[i][j] = "~";
	                System.out.print(" " + campoDeBatalha[i][j] + " |");

	            }System.out.print("\n");
	        }






	    }

	    public static void posicionarNavio(int[][] tabuleiro){
	        Scanner entrada = new Scanner(System.in);
	        int horizontal;
	        int vertical;
	        String posicaoLida;

	        for (int contNavio = 1; contNavio <= 5; contNavio++){
	            System.out.println("escolha a posição  do seu " + contNavio +"º navio (separado por \",\" :");
	            posicaoLida = entrada.nextLine(); //5,9
	            var posicaoArray = posicaoLida.trim().split(",");
	            horizontal = Integer.parseInt(posicaoArray[0].trim());
	            vertical = Integer.parseInt(posicaoArray[1].trim());

	            tabuleiro[horizontal][vertical] = 1;
	        }
	    }

	}
}
