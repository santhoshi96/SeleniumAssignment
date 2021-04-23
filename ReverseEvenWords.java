package week1.day1.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split("");
		for (int i = 0; i < split.length; i++) {
			if (i % 2 ==0) {
				for (int j = split.length-1; j >= 0; j--) {
					System.out.print(split[j]);
						
				}
				char[] chars = split[i].toCharArray();}
				else if (i%2 !=0) {
					System.out.println(split[i]);
				}
				{
					System.out.println("");
				}
		}
			
				
			
		}
	

}

