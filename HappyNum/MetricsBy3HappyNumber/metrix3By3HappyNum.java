import java.util.*;
import java.lang.Math;

public class metrix3By3HappyNum
{
	public static int happy(int num)
	{
		int sum=0,rem,sq;
        while(num>0)
        {
            rem = num%10;
            num=num/10;
            sq = (int)Math.pow(rem,2);
            sum = sum+sq;
        }
        return sum;
	}
	public static int isHappy(int num)
	{
		int s;
		while(true){
		    s = happy(num);
		    if(s==1)
		    {
				return 1;
		    }
		    else{
		        num=s;
		    }
		   if(s!=1 && s!=7 && s<=9)	
		   {
			   return 0;
		   }
		}
	}
	

		
	public static void main(String[] args)
	{
		int n,m,i,j,maxcnt=-1,rs, cs, re,ce,cnt=0,x=0,y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the metrix length, for m,n");
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] mtx = new int[n][m];
		int[][] submtx = new int[3][3];
		System.out.println("enter the metrix");
		for(i=0;i<m;i++)
		{
			for(j =0;j<n;j++)
			{
				mtx[i][j] = sc.nextInt();
			}
		}
		for(i = 0;i<m-2;i++)
		{
		    cs = i;
		    ce = i+3;
			for(j = 0;j<n-2;j++)
			{
			    rs = j;
			    re = j+3;
			    for(x=cs;x<ce;x++)
			    {
			        for(y=rs;y<re;y++)
			        {
			            //System.out.print(mtx[x][y]);
			            if(isHappy(mtx[x][y])==1)
			            {
			                cnt++;
			            }
			        }
			        //System.out.println();
			        
			    }
			    //System.out.println(cnt);
			    
				if(cnt>maxcnt)
				{
					maxcnt = cnt;
				}
				cnt = 0;
			}
			//System.out.println();
			
		}
	    //System.out.println(x);
	    //System.out.println(y);
		for(int ir=x-3;ir<x;ir++)
		{
		    for(int jr=y-3;jr<y;jr++)
		    {
		        System.out.print(mtx[ir][jr]);
		    }
		    System.out.println();
		}
		
		System.out.println(maxcnt);
	
	}
}
		
				