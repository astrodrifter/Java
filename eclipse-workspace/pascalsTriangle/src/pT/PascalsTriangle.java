package pT;

public class PascalsTriangle {
	public static void main(String[] args) {
		
		/* length */
		int length = 11;
		
		/* 2D array of 0's */
		int rows[][] = new int[length][length];
		zeroArray(rows,length);
		
		/* print array */
		printArray(rows,length);
		
		/* Pascals triangle algorithym */
		printTriangle(rows, length);
		
	}
	/* fill array with zeros */
	static void zeroArray(int[][] arr, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				arr[i][j] = 0;
			}
		}
	}
	/* print array */
	static void printArray(int[][] arr, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				System.out.printf(" " + arr[i][j]);
			}
			System.out.printf("\n");
		}
	}
	/* Pascals Triangle algorithym */
	static void printTriangle(int[][] rows, int length) {
		
		int countDown = length - 2; // for printing white space 
		for(int i = 0; i < length; i++) {
			rows[i][0] = 1; //set first element to 1
			
			int count = countDown; // reset count to countdown
			while(count  > 0) {
				System.out.printf("   "); // print white space
				count--;
			}
			
			/* print traingle */
			for(int j = 0; j < length; j++) {
				if(i+1 == length) {
					System.exit(0);
				}
				rows[i+1][j] = rows[i][j-1]+rows[i][j];
				if(rows[i][j] != 0){
					System.out.printf("    " + rows[i][j]);
				}
			}
			
			countDown--;
		}
	}
}
