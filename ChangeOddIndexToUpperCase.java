package week1.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
	
		for (int i = 0; i < test.length(); i++) {
			char ch =	test.charAt(i);
			if(i % 2 !=0) {
				
				System.out.print(Character.toLowerCase(ch));
			}else if (i % 2 ==0) {
				System.out.print(Character.toUpperCase(ch));
			}
			
		}

		
	}

}
