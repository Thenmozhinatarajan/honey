import java.util.Scanner;
class seventeen
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int number=0,total=0,temp=0;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if(total==num)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
