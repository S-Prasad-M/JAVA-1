import java.util.*;
public class Prime
{
    	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		for (int i = 0; i<=n; i++)
		{
			if (i%n==0)
			count++;
		}
		if (count == 2)
		System.out.println("prime");
		else
		System.out.println("not prime");
	}
}