import java.util.*;
public class Switchcase {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the Alphabets");
		
	char c=sn.next().charAt(0);
	
	   switch (c)
	{
	   case 'a':
	  
		   System.out.println("A vowel ");
		   break;
	   
	   case 'e':
	   
		   System.out.println("A vowel ");
		   break;
	   
	   case 'i':
	   
		   System.out.println("A vowel ");
		   break;
		   
	   
	   case 'o':
	   
	  System.out.println("A vowel ");
		   break;
	   
	   case 'u':
	   
		   System.out.println("A vowel ");
		   break;
	   
	   default : 
	   
		   System.out.println("a consonant");
	   }
	}
}