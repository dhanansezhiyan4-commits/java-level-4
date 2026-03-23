import java.io.*;
class prime 
{
 public static void main(String arg[])throws IOException 
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println(" prime number checking");
	System.out.println("__________________________");
	System.out.println("enter the number");
	String s1=br.readLine();
	int n=Integer.parseInt(s1);
	System.out.println("repont");
	
	int count=0;
	for(int i=2;i<=n-1;i++)
	{
	   if (n%i==0)
	{
	  count++;
	}
	
	}
	
	if (count==0)
	{
	 System.out.println("the number of "+n+"is a prime");
	}
	else
	{
	 System.out.println("the number of "+n+"is not a prime");
	}
     }
  }