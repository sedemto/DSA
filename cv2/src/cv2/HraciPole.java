package cv2;

import java.util.Arrays;

public class HraciPole {
	private int[][] gameboard = new int[3][3];
	private int x;
	private int y;
	
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
	
	public void shiftZero(int direction) {
		//up
		if (direction == 1) {
			gameboard[x][y] = gameboard[x-1][y];
			x = x-1;
			gameboard[x][y] = 0;
		}
		
		//down
		if (direction == 2) {
			gameboard[x][y] = gameboard[x+1][y];
			x = x+1;
			gameboard[x][y] = 0;
		}
		
		//left
		if (direction == 3) {
			gameboard[x][y] = gameboard[x][y-1];
			y = y-1;
			gameboard[x][y] = 0;
		}
		
		//right
		if (direction == 4) {
			gameboard[x][y] = gameboard[x][y+1];
			y = y+1;
			gameboard[x][y] = 0;
		}
	}
	
	public void printBoard() {
		System.out.println("\n"+Arrays.deepToString(gameboard).replace("], ", "]\n"));
	}
}
