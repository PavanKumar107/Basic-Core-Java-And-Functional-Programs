import java.util.Scanner;

public class Windchill {
	float  formulaWindChill(float temperatue , float WindSpeed) {
		float ab=(float)Math.pow(temperatue,0.16);
		return (float)(35.74 + 0.6215*temperatue + (0.4275*temperatue-35.75)*ab);

	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Windchill rv=new Windchill();
		System.out.println("Enter the value of Temperature: ");
		int temperature=inp.nextInt();
		System.out.println("Enter the value of Wind Speed: ");
int windSpeed=inp.nextInt();
		if(temperature<50 && windSpeed < 120 && windSpeed >3) {
			System.out.println("WindChill is "+rv.formulaWindChill(temperature, windSpeed));
		}
		else {
			System.out.println(" Enter Temerature value less the 50 And Wind Speed value Between 3 to 120");
		}

	}

}
