import java.util.Scanner;
class alp
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z')
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
