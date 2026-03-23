import java.io.*;
class Amstrong
{
 public static void main(String arg[])throws IOException 
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println(" amstrong number");
	System.out.println("__________________________");
	System.out.println("enter the number");
	String s1=br.readLine();
	int n=Integer.parseInt(s1);
	System.out.println("repont");
	int sum=0;
	int num=1;
	int r;
	while (n>0)
	{
	 r=n%10;
	 n=n/10;
	sum=sum + (r*r*r);
	}
	if(num==sum)
	{
	System.out.println(num +"is an amstrong number");
	}
	else
	{
	System.out.println(num +"is  not a amstrong number");
	}
     }
  }