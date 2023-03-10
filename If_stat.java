import java.util.*;
public class If_stat
{
    	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = scan.nextInt();
		if (n%2!=0)
		{
			System.out.println("Weird");
		}
		else if (n>=2 && n<=5)
		{
			System.out.println("Not Weird");
		}
		else if (n>=6 && n<=20)
		{
			System.out.println("Weird");
		}
		else if (n>=20)
		{
			System.out.println("Not Weird");
		}
	}
}