import java.util.Scanner;
class thirteen
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
		
	}
}
