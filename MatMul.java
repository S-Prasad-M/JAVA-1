import java.util.*;
public class MatMul
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int n = scan.nextInt();
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] mat3 = new int[n][n];
        System.out.println("ENTER MATRIX 1");
        for (int x = 0; x < n; x++) 
        {
            for (int y = 0; y < n; y++) 
            {
                System.out.println("Matrix A["+x+"]["+y+"]");
                mat1[x][y] = scan.nextInt();
            }
        }
        System.out.println("ENTER MATRIX 2");
        for (int x = 0; x < n; x++) 
        {
            for (int y = 0; y < n; y++) 
            {
                System.out.println("Matrix B["+x+"]["+y+"]");
                mat2[x][y] = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++)
            {    
                mat3[i][j]=0;      
                for(int k=0;k<n;k++)      
                {      
                    mat3[i][j]+=mat1[i][k]*mat2[k][j];      
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int x = 0; x < n; x++) 
        {
            for (int y = 0; y < n; y++) 
            {
                System.out.print(mat3[x][y]+"\t");
            }
            System.out.println();
        }
    }
}
