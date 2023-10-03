package HraCisla;

import java.util.Arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Board implements Comparable<Board> {
	private int[][] gameboard = new int[3][3];
	private int x;
	private int y;
	
	
	public Board() {
		initialize();
	}

	public void initialize() {
		gameboard[0][0] = 7;
		gameboard[0][1] = 2;
		gameboard[0][2] = 4;
		
		gameboard[1][0] = 5;
		gameboard[1][1] = 0;
		gameboard[1][2] = 6;
		
		gameboard[2][0] = 8;
		gameboard[2][1] = 3;
		gameboard[2][2] = 1;
		x = 1;
		y = 1;
	}
	
	public void moveUp() {
		gameboard[x][y] = gameboard[x-1][y];
		x = x-1;
		gameboard[x][y] = 0;
	}
	
	public void moveDown() {
		gameboard[x][y] = gameboard[x+1][y];
		x = x+1;
		gameboard[x][y] = 0;
	}
	
	public void moveLeft() {
		gameboard[x][y] = gameboard[x][y-1];
		y = y-1;
		gameboard[x][y] = 0;
	}
	
	public void moveRight() {
		gameboard[x][y] = gameboard[x][y+1];
		y = y+1;
		gameboard[x][y] = 0;
	}
	
	
	public void printBoard() {
		System.out.println("\n"+Arrays.deepToString(gameboard).replace("], ", "]\n"));
	}
	public int[][] getGameboard() {
		return this.gameboard;
	}

	public int weight() {
		int weight = 0;
		int index = 0;
		for(int[] row : gameboard)
			for(int i : row) {
				weight += i*Math.pow(2, index);
				index++;
			}
		return weight;
		
	}
	@Override
	public int compareTo(Board o) {
		int n1 = this.weight();
		int n2 = o.weight();
		if(n1<n2)
			return -1;
		else if(n1>n2)
			return 1;
		else
			return 0;
	}


}
