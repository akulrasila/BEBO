import java.util.*;
public class Anagram {
	public static void main(String args[])
	{
		Scanner sn =new Scanner(System.in);
		System.out.println("enter string 1");
		String s1= sn.nextLine();
	    System.out.println("enter string 2");
	    String s2= sn.nextLine();
	    int c=s1.length();
	    int d=s2.length();
	    	if(c==d)
	    	{
	    		 char a[]= s1.toCharArray();
	    		Arrays.sort(a);
	    		String sorted=new String(a);
	    		char b[]=s2.toCharArray();
	    		Arrays.sort(b);
	    		String sorted1=new String(b);
	    		if(sorted.equals(sorted1))
	    		{
	    			System.out.println("It is an anagram");
	    		}
	    		else
	    		{
	    			System.out.println("Not an anagram");
	    		}
	    				
	    	}
	}
}