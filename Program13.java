import java.util.Scanner;
public class Program13 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the length and breadth");
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int r =l*b;
		System.out.println("Area of the Rectangle ="+r);
	}

}
