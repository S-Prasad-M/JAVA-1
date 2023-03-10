import java.util.*;
public class StringSort
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String arr[] = new String[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}