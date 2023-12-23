import java.util.*;
import java.util.Scanner;
public class Main {
    public static void minPathSum(int[][] grid) {
        int m, n, i, j;
        m = grid.length;
        n = grid[0].length;
        //System.out.println(m+" "+n);
        for (i = 1; i < n; i++) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }
        for (j = 1; j < m; j++) {
            grid[j][0] = grid[j][0] + grid[j - 1][0];
        }
        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        i = m-1;
        j=n-1;
        System.out.print(grid[m-1][n-1]);
        while(i>=0 && j>=0)
        {
            if(i!=0 && j!=0)
            {
                if(grid[i-1][j]<grid[i][j-1])
                {
                    System.out.print("<--"+grid[i-1][j]);
                    i--;
                }
                else {
                    System.out.print("<--"+grid[i][j-1]);
                    j--;
                }
            }
            else{
                if(i==0){
                    if(grid[i][j-1]<grid[i+1][j])
                    {
                        System.out.print("<--"+grid[i][j-1]);
                        j--;
                    }
                    else{
                        System.out.print("<--"+grid[i+1][j]);
                        i++;
                    }
                }
                else{
                    if(grid[i][j+1]<grid[i-1][j])
                    {
                        System.out.print("<--"+grid[i][j+1]);
                        j++;
                    }
                    else {
                        System.out.print("<--"+grid[i-1][j]);
                        i--;
                    }
                }
            }
        }
        System.out.println("sum of minimum path is "+grid[m - 1][n - 1]);
    }
    public static void main(String[] args) {
        int i, j,m ,n;
        System.out.println("enter the size for m,n\n");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n= sc.nextInt();
        int grid[][]=new int[n][m];
        System.out.println("enter the metrix\n");
        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        minPathSum(grid);
    }
}