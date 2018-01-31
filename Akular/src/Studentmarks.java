		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		public class Studentmarks {
		int getdata(int m1,int m2,int m3)
		{
			int sum=m1+m2+m3;
			return sum;
		}
		void details(int rollno,String name)
		{
			System.out.println("Roll Number is - "+rollno+ "  Name is - "+name);
		}
		void percentage(int sum)
		{
			System.out.println(+sum);
			int d=(sum*100)/300;
			System.out.println("Percentage is "+d);
		}
			public static void main(String[] args) throws IOException {
				
				Studentmarks obj=new Studentmarks(); //new Studentmarks() is the constructor means that the new Studentmarks() is the reference to the class bubble
				
				InputStreamReader r1= new InputStreamReader(System.in);
				BufferedReader br1=new BufferedReader(r1);
				System.out.println("Enter the roll Number and name");
				int rollno=Integer.parseInt(br1.readLine());
			  String name=br1.readLine();
			 obj.details(rollno, name);                        //calling the details(rollno., name)
			 System.out.println("Enter marks of 3 subjects");
			 int m1=Integer.parseInt(br1.readLine());
			int m2=Integer.parseInt(br1.readLine());
			int m3=Integer.parseInt(br1.readLine());
				int s=obj.getdata(m1,m2,m3);
				
				obj.percentage(s);
				
				
				
				
			}

		}