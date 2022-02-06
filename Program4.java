import java.util.Scanner;
public class Program4 {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the two number");
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		double l = sc.nextDouble();
		if(a==l) {
			System.out.println("Same");
			
		}
		
		else
			System.out.println("Diffrent");
	}

}
