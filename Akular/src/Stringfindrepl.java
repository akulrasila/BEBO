
	import java.util.Scanner;

	public class Stringfindrepl {
		public static void main(String[] args) {
			
			
			Scanner ob=new Scanner(System.in);
			System.out.println("enter your sentence");
			String s= ob.nextLine();
			System.out.println("enter the word to be replaced ");
			String replace =ob.next();
			System.out.println("enter the word you want ");
			String replacewith=ob.next();
			String a[]= s.split(" ");
			for(int i=0;i<a.length;i++)
			{
			if(a[i].equals(replace))
			{
				a[i]=replacewith;
		}}
			for(int i=0;i<a.length;i++)
			{
	System.out.println(a[i]);
			}
	}
	}


