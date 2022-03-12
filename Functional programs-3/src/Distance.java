import java.util.Scanner;

public class Distance {
	float distanceFormula(int a, int b) {
		 return (float)Math.sqrt(a*a+b*b);

	 }
		public static void main(String[] args) {
			Scanner inp=new Scanner(System.in);
			Distance rv=new Distance();
			System.out.println("Enter the  Value of a:");
			int x=inp.nextInt();
			System.out.println("Enter the value of b1:");
			int y=inp.nextInt();
			System.out.println("Euclidian Distnce is "+rv.distanceFormula(x,y));
		}
}
