import java.util.Random;

public class PrintMatrix {
	public static int[][] printMatrix(int rows, int columns) {
		int[][] result = new int[rows][columns];
		Random random = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = random.nextInt(100) * 10;
				}
			}
		return result;
		}
	public static void print(int[][] matrix) {
		System.out.println();
		int rows = matrix.length;
		int columns = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
				}
			System.out.println();
			}
         }
	}
