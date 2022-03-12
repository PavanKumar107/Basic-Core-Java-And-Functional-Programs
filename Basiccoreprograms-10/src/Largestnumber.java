import java.util.Scanner;

public class Largestnumber {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Largestnumber rv=new Largestnumber();
		System.out.println("Enter First Number");
		int num1=inp.nextInt();
		System.out.println("Enter Secound Number");
		int num2=inp.nextInt();
		System.out.println("Enter Third Number");
		int num3=inp.nextInt();
		rv.Largest(num1,num2,num3);
	}
	void Largest(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println("Largest Number is "+num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Largest Number is "+num2);
		}
		else {
			System.out.println("Largest Number is "+num3);
		}
	}
}
