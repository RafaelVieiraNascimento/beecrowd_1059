package program;

/*
beecrowd | 1059 - Números Pares

Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
*/

public class Main {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i += 2) System.out.println(i);
	}
}
