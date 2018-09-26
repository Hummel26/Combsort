import java.util.Scanner;

public class XO {
	static String[][] xo;
	static String xoxo = null;
	static String v = null;
	static int col = 0;
	static int row = 0;
	static int num = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		xo = new String[4][4];
		xoxo = "X";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				xo[i][j] = "-";
			}
		}
		print();
		while (v == null) {
			System.out.print(xoxo + " ( col):");
			col = kb.nextInt();
			System.out.print(xoxo + " ( row):");
			row = kb.nextInt();
			
			if (col < 3 && row < 3 && col>-1 && row >-1) {
				if (xo[row + 1][col + 1].equals("-")) {
					xo[row + 1][col + 1] = xoxo;
					if (xoxo.equals("X")) {
						xoxo = "O";
					} else {
						xoxo = "X";
					}
					print();
					check();
				} else {
					System.out.println("please input again...");
					v=null;
				}
			}
			else {
				System.out.println("please input again...");
				v=null;
			}
		}
		if (xoxo.equals("=")) {
			System.out.println("We're draw. ...");
		} else if (xoxo.equals("X")) {
			xoxo = "O";
			System.out.println("WIN " + xoxo);
		} else {
			xoxo = "X";
			System.out.println("WIN " + xoxo);
		}

	}
	static void print() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0) {
					System.out.print(" " + " ");
				} else if (j > 0 && i == 0) {
					System.out.print(j - 1 + " ");
				} else if (i > 0 && j == 0) {
					System.out.print(i - 1 + " ");
				} else {
					System.out.print(xo[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
	static String check() {
		int xx = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (!xo[i][j].equals("-")) {
					xx++;
				}
			}
		}
		if (xx == 9) {
			v = "STOP";
			xoxo = "=";
		}else if (xo[1][1] == "X" && xo[1][2] == "X" && xo[1][3] == "X") {
			v = "STOP";

		} else if (xo[1][1] == "X" && xo[2][1] == "X" && xo[3][1] == "X") {
			v = "STOP";

		} else if (xo[1][2] == "X" && xo[2][2] == "X" && xo[3][2] == "X") {
			v = "STOP";
		} else if (xo[1][3] == "X" && xo[2][3] == "X" && xo[3][3] == "X") {
			v = "STOP";

		} else if (xo[2][1] == "X" && xo[2][2] == "X" && xo[2][3] == "X") {
			v = "STOP";

		} else if (xo[3][1] == "X" && xo[3][2] == "X" && xo[3][3] == "X") {
			v = "STOP";

		} else if (xo[1][1] == "O" && xo[1][2] == "O" && xo[1][3] == "O") {
			v = "STOP";

		} else if (xo[1][1] == "O" && xo[2][1] == "O" && xo[3][1] == "O") {
			v = "STOP";

		} else if (xo[1][2] == "O" && xo[2][2] == "O" && xo[3][2] == "O") {
			v = "STOP";

		} else if (xo[1][3] == "O" && xo[2][3] == "O" && xo[3][3] == "O") {
			v = "STOP";

		} else if (xo[2][1] == "O" && xo[2][2] == "O" && xo[2][3] == "O") {
			v = "STOP";

		} else if (xo[3][1] == "O" && xo[3][2] == "O" && xo[3][3] == "O") {
			v = "STOP";

		} else if (xo[1][1] == "X" && xo[2][2] == "X" && xo[3][3] == "X") {
			v = "STOP";

		} else if (xo[1][3] == "X" && xo[2][2] == "X" && xo[3][1] == "X") {
			v = "STOP";
		} else if (xo[1][1] == "O" && xo[2][2] == "O" && xo[3][3] == "O") {
			v = "STOP";

		} else if (xo[1][3] == "O" && xo[2][2] == "O" && xo[3][1] == "O") {
			v = "STOP";
		}
		else {
			v = null;
		}
		return v;
	}
}
