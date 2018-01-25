import java.util.*;
public class Smallestlargearray {

	 public static void main(String[] args) {
   System.out.println("enter array size");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int arr[]= new int[n];
   int i,temp,j=0;
   for(i=0;i<n;i++)
   {
	   arr[i]=sn.nextInt();
   }
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
					{
					temp=arr[i];
					arr[i]=arr[j];
				   arr[j]=temp;
					}
			}
		}
		System.out.println("smallest no. is" +arr[0]);
		System.out.println("largest no. is " +arr[j-1]);
    
	} 
}
	