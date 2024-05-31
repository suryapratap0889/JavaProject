package PrepForAutomation;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int firstNum =0, SecondNum=1;
		int nextnum;
		
		for(int i=0; i<=n; i++) {
			System.out.print(firstNum+ ", ");
			
			nextnum = firstNum + SecondNum;
			firstNum = SecondNum;
			SecondNum = nextnum;
		}

	}

}
//        OUTPUT=======0,1,1,2,3,5,8,13,21,34,55