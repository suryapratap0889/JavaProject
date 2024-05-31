package palindrome;

import java.util.Scanner;



public class PalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		
		int orig_num= num;
		
		int rev = 0;
		
		while (num != 0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if (orig_num==rev) {
		System.out.println(orig_num+ "    Palindrome Number");
		} else {
			System.out.println(orig_num+ "    It's not a Palindrome Number");
		}

	}

}
