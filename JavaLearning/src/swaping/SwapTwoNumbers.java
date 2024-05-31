package swaping;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter any two numbers");
		
		Scanner ref = new Scanner(System.in);
		
		a=ref.nextInt(); //a=100
		b=ref.nextInt(); //b=200
		System.out.println("Before Swapping "+a+" "+b);
		
		a=a+b; 
		b=a-b; 
		a=a-b; 
		System.out.println("After Swapping " +a+" " +b);
	}

}
