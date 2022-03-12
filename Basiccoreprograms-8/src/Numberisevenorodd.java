import java.util.Scanner;

public class Numberisevenorodd {
	void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");
		}
	}

	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	Numberisevenorodd rv=new Numberisevenorodd();
	System.out.println("Enter the Number ");
	int number=inp.nextInt();
	rv.evenOrOdd(number);

	}
}
