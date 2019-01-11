import java.util.Scanner;
class firstpgm
{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in); 
  
        int a = in.nextInt(); 
        if(a>0)
        {
        	System.out.println("Positive");
        }
        else if(a<0)
        {
        	System.out.println("Negative");
        }
        else
        {
        	System.out.println("Zero");
        }
        
		
	}
}
