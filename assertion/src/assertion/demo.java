package assertion;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		System.out.println("enter your age.... : ");
		Scanner scanner= new Scanner(System.in);
		
		int a=scanner.nextInt();
		assert a==2:"not valid";
		
		System.out.println("your age is....: "+a);
	}

}
