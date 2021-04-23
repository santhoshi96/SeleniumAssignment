package week1.day1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String value = "madam";
          String rev = "";
          char[] charArray = value.toCharArray();
  		for (int i = charArray.length-1; i >= 0; i--) {
  			rev = rev + charArray[i];
  		}
  	    if(value.equals(rev)) {
  		    System.out.println("palindrome");
  			
          
	}
  	    else {
  	    	System.out.println("not palindrome");
  	    }
	}

}
