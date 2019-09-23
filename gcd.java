import java.util.Scanner;
public class gcd
{
	public static void main(String[] args)
	{
	    int a=0,b=0,i=1,gcd=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=1;i<=a && i<=b ;i++)
		{
		    if(a%i==0 && b%i==0)
		    {
		        gcd=i;
		    }
		    
		}
		System.out.println(gcd);
		
	}
}
