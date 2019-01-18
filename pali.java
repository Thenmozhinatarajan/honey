import java.io.*;
import java.util.Scanner;
class pali
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int temp=n;
	float r=0;
	float rev=0;
	while(temp!=0)
	{
		r=temp%10;
		rev=(rev*10)+r;
		temp=temp/10;
	}
	if(rev==n)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	
	}
}
