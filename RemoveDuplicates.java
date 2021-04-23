package week1.day1.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="We learn java basics as part of java sessions in java week1";
		int Count=0;
	String textArray[] = text.split(" ");  
    for(int i = 0; i < textArray.length; i++) { 
    	for (int j = i+1; j < textArray.length -1; j++) {
    		if (textArray[i].equalsIgnoreCase(textArray[j]))
    		{
    			textArray[j]="";
    		}
    		
    	     System.out.print(textArray[i]+"");
    		
    }
	}
}
}




