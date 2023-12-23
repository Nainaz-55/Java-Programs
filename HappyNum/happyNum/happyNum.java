import java.util.*;
import java.lang.Math;
public class happyNum
{
    public static int happy(int n)
    {
        int sum=0,rem,sq;
        while(n>0)
        {
            rem = n%10;
            n=n/10;
            sq = (int)Math.pow(rem,2);
            sum = sum+sq;
        }
        return sum;
    }
	public static void main(String[] args) {
		int n, s,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		t = n;
		while(true){
		    s = happy(n);
		    if(s==1)
		    {
		        System.out.println(t+" is happy number");
		        break; //if sum reaches to 1 then it is happy nymber.
		    }
		    else{
		        n=s;
		    }
		   if(s!=1 && s!=7 && s<=9)	
		   {
		       System.out.println(t+" is UNHappy number");
		       break; // if sum reaches to 2,3,4,5,6,8,9 except 1 and 7, then it is UnHappy number.
		   }
		   }
	}
}
