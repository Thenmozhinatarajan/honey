import java.util.Scanner;
class fifteen
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		{
			for(int i=num1+1;i<=num2;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
