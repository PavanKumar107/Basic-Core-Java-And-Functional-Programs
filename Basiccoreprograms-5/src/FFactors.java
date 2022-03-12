import java.util.Scanner;

public class FFactors {
	void factor(int num) {
		int fac;

		 for (int i = 2; i <= num; i++) {

	            while (num % i == 0) {
	                System.out.print(i + " ");
	                num = num / i;
	            }
	        }
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		FFactors rv=new FFactors();
		System.out.println("Enter the Number Whose Factors you need");
		int num=inp.nextInt();
		rv.factor(num);

	}


}
