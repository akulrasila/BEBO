import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		  
			    int c=0,a,temp;  
			    
			    Scanner sn = new Scanner(System.in);
			    System.out.println("enter the number you wanna check");
			    int n = sn.nextInt();
			    temp=n;  
			    while(n>0)  
			    {  
			    a=n%10;  
			    n=n/10;
			    c=(c*10)+a;
			    
			     
			    }
			    if(c==temp)
			    	System.out.println("no is palindrome");
			    else
			    	System.out.println("no is not a palindrome");
	}
	}
		