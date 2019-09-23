import java.util.Scanner;
class Amol
{
	public static void main(String[] args)
	{
		
	    for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
		System.out.println("\n");
		//j=j+1;
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
		System.out.println("\n");
		//j=j+1;
		}
		
	}
}