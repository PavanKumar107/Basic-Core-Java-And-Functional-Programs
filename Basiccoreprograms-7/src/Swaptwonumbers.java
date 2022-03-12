import java.util.Scanner;

public class Swaptwonumbers {
	void swapNumber(int num1 , int num2) {
		num1=num1+num2;
		num2=num1-num2;	
		num1=num1-num2;
		System.out.println("The number after Swap is 1= "+num1+ ",  number 2 is "+num2);

	}

	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in) ;
	Swaptwonumbers rv=new Swaptwonumbers();
	System.out.println("Enter First Number");
	int num1=inp.nextInt();
	System.out.println("Enter Secound Number");
	int num2=inp.nextInt();
	System.out.println("Number Before Swap is 1= "+num1+ ",  number 2 is "+num2);

	rv.swapNumber(num1, num2);

}
}
