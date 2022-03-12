import java.util.Scanner;
public class twodarray {
	public static void main(String[] args) {
		twodarray rv=new twodarray();
		System.out.println("Enter the Number of rows");
		int row=inp.nextInt();
		System.out.println("Enter the Number of Column");
		int column=inp.nextInt();
		rv.Array2D(row,column);
		}
	static Scanner inp=new Scanner(System.in);
	void Array2D(int row, int column) {

	    int[][] integerArray=new int[row][column];
	      for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				integerArray[i][j]=inp.nextInt();
			}
		}
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(" "+integerArray[i][j]);
					}
				System.out.println();
			}
		}
}
