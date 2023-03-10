import java.util.*;
public class UniqueinArray
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = input.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = input.nextInt();
		}
		int count = 0;
		for (int i = 0;i<n;i++)
		{
			if ((UniqueinArray.Ifthere(n,arr[i],arr)) && !(UniqueinArray.Ifthere(n,arr[i],arr1)))
			{
				arr1[count] = arr[i];
				count += 1;
			}
		}
		System.out.println("Unique Elements = "+count);
	}
	public static boolean Ifthere(int n, int data, int arr[])
	{
		boolean flag = false;
		for(int i =0; i<n; i++)
		{
			if (data == arr[i])
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
}