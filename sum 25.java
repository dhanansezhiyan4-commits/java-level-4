import java.io.*;

class sum

{
 public static void main (String args[])throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("sum the number ");
	System.out.println("________________");
	System.out.println("enter the number");
	String s1=br.readLine();
	int n=Integer.parseInt(s1);
	System.out.println("report");
	int sum=0;
	for(int i=1;i<=n;i++)
	{
	 System.out.println("+"+i);
	  sum=sum +i;
	}
	System.out.println("="+ sum);
     }
   }