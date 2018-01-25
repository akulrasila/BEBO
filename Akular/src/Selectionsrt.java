import java.util.*;
public class Selectionsrt {
public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	
		int n,temp=0;
		
		System.out.print("Enter the size of an array:");
		n = sn.nextInt();
		int a[] = new int[n];
		System.out.print("Please Enter array elements:");
		for(int i= 0; i<n; i++) 
			a[i]= sn.nextInt();
		
		for(int i= 0; i<n-1; i++) 
		{
			int index = i;
			for(int j=i+1; j<n; j++) 
			{
				if(a[j]<a[index]) {
					index=j;
				}
			}
				   
					temp = a[index];
					a[index] = a[i];
					a[i] = temp;
		}

						for(int m:a) {
            System.out.print(m+" ");
				} 
		
			 
			}
}