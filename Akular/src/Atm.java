
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("ATM : ALL TIME MONEY");
		System.out.println("enter the pin");
        int var=sn.nextInt();
        
        int pin=2345;
        if(var==pin)
        {
        	System.out.println("ACCESS GRANTED");
        	System.out.println("PRESS 1 FOR BALANCE ENQUIRY!");
        	System.out.println("PRESS 2 FOR Withdrawl");
        	System.out.println("PRESS 3 FOR diposit");
        	System.out.println("PRESS 4 FOR exit");
        	int va=sn.nextInt();
        	for(int b=0;b<=4;b++)
        	{
        	switch (va)
        	{
        	case 1:
        		System.out.println("yOUR balance is:2cr");
        	case 2:
        		System.out.println("enter amount to withdraw");
        		int v=sn.nextInt();
        		System.out.println("Amount withdrawn, collect the cash!!");
        	case 3:
        		System.out.println("enter amount to deposit");
        		int v2=sn.nextInt();
        		System.out.println("Amount deposited successfully!!");
        	case 4:
        		System.out.println("EXIT");
        	break;
        	}
        	}
        }
        
        else
        {
		System.out.println("GET LOST");
        }
             
		
	}
}