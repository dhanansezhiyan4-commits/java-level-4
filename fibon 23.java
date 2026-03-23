import java.io.*;

class fibon

{
 public static void main (String args[])throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("Fibonacci series");
	System.out.println("________________");
	System.out.println("enter the number");
	String s1=br.readLine();
	int n=Integer.parseInt(s1);
	System.out.println("report");
	int a = -1;
	int b =  -1;
	int c = -1;
	for (int i=1;i<=n;i++)
	{
	  c = a+b;
	System.out.println(c + ",");
	 a = b;
	 b = c;
      }
   }
}