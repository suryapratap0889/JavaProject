package reverseString;

//Class Declaration
public class ReverseStrings {
	
//Main Method
		public static void main(String[] args) {
// This line declares a String variable named str and initializes it with the value "abcdef". This is the string that we want to reverse.
			String str = "abcdef";
//			This line declares an empty String variable named result, which will hold the reversed string. It's initially empty because we'll append characters to it later.
			String result = "";
//			This line declares a char variable named ch, which will be used to store individual characters from the original string during the iteration.

			char ch;
	
//			This line starts a for loop that iterates over each character in the original string str. The loop starts with i equal to 0 and continues until i is less than the length of the string str.
			for (int i=0; i<str.length(); i++) {
//		This line retrieves the character at index i from the original string str using the charAt() method and assigns it to the variable ch.		
			ch = str.charAt(i);
//			This line concatenates the character ch with the current value of result. Since we want to reverse the string, we prepend each character to the existing reversed string.
			result = ch + result;
			
			}
//			This line prints the reversed string result to the console, preceded by the message "Print Reversed String : "
			System.out.println("Print Reversred Sting : " + result);

			
			
			
			
	}


}
