import java.util.Scanner;
class evenpgm1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>=0)
		{
			if(n%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("invalid");
		}
		
	}
}
