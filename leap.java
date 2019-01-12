import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%400==0||n%4==0)
		{
			System.out.println("yes");
		}
		else if(n%100==0)
		{
				System.out.println("no");
		}
		else
		{
				System.out.println("no");
		}
	}
}
