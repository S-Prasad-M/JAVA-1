import java.util.*;
import java.lang.Math;
public class SumofSeries
{
    	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			int sum = (a+b);
			for(int j=1;j<n;j++)
			{
				sum += (Math.pow(2,j)*b);
				System.out.println(sum);
			}
		}
	}
}