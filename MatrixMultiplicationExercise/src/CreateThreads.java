import java.util.ArrayList;
import java.util.List;

	public class CreateThreads {
		public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
			List<Thread> threads = new ArrayList<>();
			int rows1 = matrix1.length;
			for (int i = 0; i < rows1; i++) {
				MultiplyMatrices task = new MultiplyMatrices(result, matrix1, matrix2, i);
			    Thread thread = new Thread(task);
			    thread.start();
			    threads.add(thread);
			    if (threads.size() % 10 == 0) {
				   try {
					   thread.join();
					   } catch (InterruptedException e) {
						   e.printStackTrace();
						   }
				   }
			   threads.clear();
			   }
			}
		}
	
	