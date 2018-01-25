import java.util.Scanner;

public class Largesmall1darr {

	public static void main(String[] args) {
		int n,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Please Enter array elements:");
		for(int i= 0; i<n; i++) 
			a[i]= sc.nextInt();
		
		for(int i= 0; i<n; i++) 
		{
			for(int j=i+1; j<n; j++) 
			{
				if(a[i]>a[j])
				   {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}
			}System.out.println("smallest  number is "+a[0]);
		}
}