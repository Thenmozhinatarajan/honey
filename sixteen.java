import java.util.Scanner;
class sixteen
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		while(num1<num2)
		{
			boolean flag = false;
        	for(int i = 2; i <= num1/2; ++i)
        	{
            if(num1 % i == 0)
            	{
                	flag = true;
                	break;
            	}
        	}

        if (!flag)
            System.out.println(num1);
        
        ++num1;
		}
	}
		
}
