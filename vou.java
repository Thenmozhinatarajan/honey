import java.util.Scanner;
class vou
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
