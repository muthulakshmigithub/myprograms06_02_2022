import java.util.Scanner;
public class Program3 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the two number");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		long l = sc.nextLong();
		if(a==l) {
			System.out.println("Same");
			
		}
		
		else
			System.out.println("Diffrent");
	}

}
