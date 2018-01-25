import java.util.*;
class Twodarraysmall
{
public static void main(String[] args) {
			Scanner sn=new Scanner(System.in);
			System.out.println("enter no. of rows and cols");
			int n=sn.nextInt();
			int arr[][]=new int[n][n];
			System.out.println("enter the elements");
			int smallest=arr[0][0];
			int j=0;
			int i=0;
			for( i=0;i<arr.length;i++)
			{
				for( j=0;j<arr[i].length;j++)
				{
				 		arr[i][j]=sn.nextInt();
				}
			}
			for( i=0;i<arr.length;i++)
			{
				for( j=0;j<arr[i].length;j++)
				{
				 		if(smallest>arr[i][j])
				 		{
				 			smallest=arr[i][j];
				 		}	 		
				 		
		       }
		    }
			System.out.println("Smallest number is " +smallest);
	}
}