 import java.util.Scanner; 
 public class RockPaperScissors
{ 
public static void main(String[] args) 
{ 
	
	
	Scanner input = new Scanner ( System.in );
	
	
    
    System.out.printf("We are playing rock paper Scissors.\n");
    System.out.printf("1 = Rock, 2 = Paper, and 3 = Scissors. Enter one of the three numbers to play.");
    int Userplay1 = input.nextInt();
    
    
    
   if (Userplay1 == 1) 
	   System.out.println("You chose rock and I chose paper. You lose.");
   
   if (Userplay1 == 2) 
	   System.out.println("You chose paper and I chose scissor. You Lose.");
	      
   if (Userplay1 == 3) 
	   System.out.println("You chose scissors and I chose rock. You Lose.");
	   
	    
	   
   
 
      
   

}
}


