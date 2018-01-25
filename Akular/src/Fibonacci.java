import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a=0;
		int b=1;
		int n = sn.nextInt();
		System.out.println("series is "+a);
		System.out.println("series is "+b);
		
		for(int i=0; i<=n; i++) 
		{
		int x= a+b;
		a=b;
		b=x;
		System.out.println("series is "+x);
				
	}

}
	}
