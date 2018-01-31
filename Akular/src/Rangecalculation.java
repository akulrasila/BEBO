import java.util.*;
public class Rangecalculation {
	int solution(int a,int b,int k)
	{
		int i,count=0;
		for(i=a;i<b;i++)
		{
			if(i%k==0)
			{
				count++;
			}
				
		}
		return count;
	}
	
	
	public static void main(String[] args)
	{
		Rangecalculation obj=new Rangecalculation();
	 
		System.out.println("Enter the first number");
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		System.out.println("Enter the second no.");
		
		int b=sn.nextInt();
		System.out.println("Enter the no. for modulous");
		
		int k=sn.nextInt();
		int l=obj.solution(a,b,k);
		
		System.out.print("The numbers between the given range of " +a+ " and " +b+ " is " +l);
		
	}

}