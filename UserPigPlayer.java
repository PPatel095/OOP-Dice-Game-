//**********************************************************
//UserPigPlayer.java
//
// An interface for roll and Hold decisions
//**********************************************************
import java.util.Scanner;

public class UserPigPlayer implements PigPlayer  
{ 
	Die diceTest = new Die(); 
	
	public UserPigPlayer()
	{ 
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter nothing to roll; enter anything to hold.");
	}
	
	//Boolean to decide whether to roll or hold
	public boolean isRolling(int myScore, int otherScore, int turnTotal)
	{
		Scanner scnr = new Scanner(System.in); 
		System.out.println("Turn Total: "  +  turnTotal);
		System.out.print("\t Roll/Hold?");
	
		String enterRolls = scnr.nextLine(); 
		return enterRolls.length() > 0;
	}

	
}
