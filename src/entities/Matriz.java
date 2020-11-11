package entities;

import java.util.Scanner;

public class Matriz extends Operacoes {

	Integer[][] matriz;

	private int linha;
	private int coluna;

	public Matriz(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		matriz = new Integer[linha][coluna];
	}

	public Integer[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Integer[][] matriz) {
		this.matriz = matriz;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	
	@Override
	public Integer[][] somaMatriz(Matriz m1) {
		 Integer[][] m = matriz;
		for (int i = 0; i < m1.linha; i++) {
			for (int j = 0; j < m1.coluna; j++) {
				m[i][j] += m1.getMatriz()[i][j];
			}
		}
		return m;
	}

	@Override
	public void subtrairMatriz(Matriz m1) {
		for (int i = 0; i < m1.linha; i++) {
			for (int j = 0; j < m1.coluna; j++) {
				matriz[i][j] -= m1.getMatriz()[i][j];
			}
		}
	} 

	@Override
	public void addNumMatriz() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < getLinha(); i++) {
			for (int j = 0; j < getColuna(); j++) {
				//atribui um valor no enderço da matriz
				matriz[i][j] = scan.nextInt();
			}

		}
	}

	@Override
	public void imprimirMatriz() {
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
