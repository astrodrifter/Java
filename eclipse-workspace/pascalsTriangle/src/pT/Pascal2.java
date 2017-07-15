package pT;

public class Pascal2 {

	public static void main(String[] args) {
		int maxRows = 11;
		int r, num;
		for (int i = 0; i <= maxRows; i++) {
		    num = 1;
		    r = i + 1;
		    //pre-spacing
		    for (int j = maxRows - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int col = 0; col <= i; col++) {
		        if (col > 0) {
		            num = num * (r - col) / col;
		        }
		        System.out.print(num + " ");
		    }
		    System.out.println();
		}
	}

}
