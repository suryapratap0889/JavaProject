package array;

public class ReverseString1 {

	public static void reverStr(char[] str) {
		int l=0;
        int r=str.length-1;
        
        while(l<r) {
            if(!Character.isAlphabetic(str[l])){
                l++;
            } else if(Character.isAlphabetic(str[r])){
                r++;
            }
            else {
                char temp = str[r];
                str[r]=str[l];
                str[l]=temp;
                l++;
                r--;
            }
        }
    }
     public static void main(String[] args){
         
       
        String str = "I#Lo$ve%In&di*a";
        
    char[] chararr = str.toCharArray();
        reverStr(chararr);
        String rev = new String(chararr);
        System.out.println(rev);
        }
	}
