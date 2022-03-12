import java.util.Scanner;

public class powerof2 {
		void power(int num){
			int pow;
			for(int i=1;i<=num;i++) {
				pow=(int)Math.pow(2, i);
				System.out.println("2 power "+i+" is "+pow);
			}

		}
		public static void main(String[] args) {
			Scanner inp=new Scanner(System.in);
			powerof2 rv=new powerof2();
			System.out.println("Enter a Number :-");
			int num=inp.nextInt();
			if(num<32 && num>0)
			rv.power(num);
	}

}
