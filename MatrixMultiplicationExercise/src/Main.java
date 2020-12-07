import java.util.Date;

	public class Main {
		public static void main(String[] args) {
			Date start = new Date();
			int[][] m1 = PrintMatrix.printMatrix(1000, 1000);
			int[][] m2 = PrintMatrix.printMatrix(1000, 1000);
			int[][] result = new int[m1.length][m2[0].length];
			CreateThreads.multiply(m1, m2, result);
			Date end = new Date();
			System.out.println("Time taken in milli seconds: " + (end.getTime() - start.getTime()));
			}
		}
