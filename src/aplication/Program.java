package aplication;

import java.util.Scanner;

import entities.Matriz;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Matriz m1 = new Matriz(2,2);
		Matriz m2 = new Matriz(2,2);
		
		System.out.println("Coloque os valores da matriz m1");
		m1.addNumMatriz();
		
		System.out.println("Coloque os valores da matriz m2");
		m2.addNumMatriz();
		
		System.out.println();
		System.out.println("Imprimindo a matriz m1");
		m1.imprimirMatriz();
		
		System.out.println();
		System.out.println("Imprimindo a matriz m2");
		m2.imprimirMatriz();
		
		System.out.println();
		System.out.println("Somando as Matrizes m1 + m2");
		m1.somaMatriz(m2);
		m1.imprimirMatriz();
		
		System.out.println();
		System.out.println("subtraindo as matrizes m1 - m2");
		m1.subtrairMatriz(m2);
		m1.imprimirMatriz();
		
		scan.close();
	}
	

}


