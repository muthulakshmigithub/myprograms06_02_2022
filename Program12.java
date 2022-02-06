import java.util.Scanner;
public class Program12 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the side of the square");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int a = s*s;
		System.out.println("Area of the square ="+a);
	}

}
