//char to int
public class Typecasting{
   public static void main(String[] arg)
   {
	 char a = 'C';
	   int b = a;
	   System.out.println("My First Program" +b); 
 	// double to int
		double d = 65.87d;
		int e = (int) d;
		System.out.println("ans. is" +e);
   
  //float to double
       float f = 76.98f;
	   double g = f; 
       System.out.println("ans. is" +g);
	 
	//String to int
     String h = "78945";
     int i = Integer.parseInt(h);
	 System.out.println("ans. is" +i); 
	 
	// double to string
	 double j= 54.87d;
	 String k = Double.toString(j);
     System.out.println("ans. is" +k);
   }
	}
