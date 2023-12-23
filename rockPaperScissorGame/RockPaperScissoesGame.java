
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGame
{
	public static void main(String[] args) {
	    
	    Random rand = new Random();
	    Scanner sc = new Scanner(System.in);
	    int counter = 1, cw =0 , pw =0 , comp, plyr;
	    while(counter<=5)
	    {
	        System.out.println("enter the number for \nRock = 1\npaper=2\nscissors=3\n");
	        comp = rand.nextInt(4);
	        plyr = sc.nextInt();
	        System.out.println("computer = "+comp);
	        System.out.println("Player = "+plyr+"\n\n");

	        if(plyr!=comp && comp !=0)
	        {
	            if(comp == 1 && plyr == 2){
	                pw++;
	            }
	            else if(comp == 1 && plyr == 3){
	                cw++;
	            }
	            else if(comp == 2 && plyr == 1){
	                cw++;
	            }
	            else if(comp==2 && plyr==3){
	                pw++;
	            }
	            else if(comp==3 && comp==1){
	                pw++;
	            }
	            else if(comp==3 && plyr==2){
	                cw++;
	            }
	            counter++;
	        }
	        else{
	            System.out.println("Both of urs turns are same!");
	        }
	        
	    }
	      
	      if(cw>pw)
	      {
	          System.out.println("U LOST the game");
	      }
	      else{
	          System.out.println("CONGRATES, u WON");
	      }
	}
}
