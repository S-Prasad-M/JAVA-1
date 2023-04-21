import java.util.*;
public class Solution 
{
    static int[][] data = new int[6][6];
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        for (int x = 0; x < 6; x++) 
        {
            for (int y = 0; y < 6; y++) 
            {
                data[x][y] = scan.nextInt();
            }
        }
        int count = 0;
        int sum[] = new int[36];
        for (int x = 1; x < 5; x++) 
        {
            for (int y = 1; y < 5; y++) 
            {
                if (Hoursum(x,y) != 0)
                {
                    sum[count] = Hoursum(x,y);
                    count++;
                }
            }
        }
        int max = sum[0];
        for (int i = 1; i < 36; i++)
            if (sum[i] > max)
                max = sum[i];
        System.out.println(max);
    }
    
    static int Hoursum(int x, int y) 
    {
        int sum = 0;
        sum += data[x-1][y-1];
        sum += data[x-1][y];
        sum += data[x-1][y+1];
        
        sum += data[x][y];
        
        sum += data[x+1][y-1];
        sum += data[x+1][y];
        sum += data[x+1][y+1];
        return sum;
    }
}
