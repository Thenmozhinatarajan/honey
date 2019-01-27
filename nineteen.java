import java.util.Scanner;
class nineteen
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int sum=1,i=1;
		int n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}
}
