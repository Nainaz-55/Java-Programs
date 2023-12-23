import java.util.Scanner;
import java.util.*;

public class GemStones {
    public static int uniquedig(double rlmd)
    {
        int rlmid = (int)rlmd;
        String str = Integer.toString(rlmid);
        int i,j,len,c=0;
        len = str.length();
        char[] ch = str.toCharArray();
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++) {
                if (ch[i] == ch[j]) {
                    c++;
                }
                if (c > 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void gemstones(int num, int rlm) {
        int i, len, j, tmprlm,unqdig, gems=0, totalgems=0;
        double rlmid;
        String temp;
        tmprlm = rlm;
        rlmid = rlm;
        for (i = 0; i < num; i++) {
           // gemstone[i] = 0;
            temp = Integer.toString(rlm);
            len = temp.length();
            rlmid = rlmid * Math.pow(10, len);
            for (j = 0; j < rlm; j++) {
                rlmid++;
                unqdig = uniquedig(rlmid);
                //system.out.println(unqid);
                if(unqdig==1){
                    gems++;
                    //System.out.println(rlmid);

                }
            }
            //System.out.println(gems);
            rlmid = (tmprlm++);
            rlm = rlm + tmprlm;
            totalgems = gems + totalgems;
            gems =0;
            //System.out.println(rlm);

        }

        System.out.println("total number of gems = " + totalgems);
    }

    public static void main(String[] args) {
        int inp1, inp2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of realms and intial realm");
        inp1 = sc.nextInt();
        inp2 = sc.nextInt();
        gemstones(inp1, inp2);
    }
}