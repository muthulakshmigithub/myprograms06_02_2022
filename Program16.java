import java.util.Scanner;
public class Program16 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the radious of the two circles");
		Scanner sc = new Scanner(System.in);
		 int r1 = sc.nextInt();
		 int r2 = sc.nextInt();
		 
			double c=(3.14*r1*r1)-(3.14*r2*r2);
			
			System.out.println("The space between the circles ="+c);
	}

}
