import java.util.Scanner;
public class Program14 {
	
	public static void main(String[] args) {
		System.out.println("Enter the radious and height");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		double c = 2*3.14*r*(h+r);
		System.out.println("Area of the Cylinder ="+c);
	}

}
