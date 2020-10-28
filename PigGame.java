//*****************************************
// PigGame.java
//	
//	The game of Pig is Played with Players
//*****************************************

import java.util.Scanner;

public class PigGame 
{
	//Initialize other Classes 
	Die diceTest = new Die();
	HoldAt20PigPlayer holds20 = new HoldAt20PigPlayer();
	
	//Initialize variables to be used
	private static int GOAL_SCORE = 100; 
	private PigPlayer player1; 
	private PigPlayer player2;

	//Calls Players 
	public PigGame()
	{ 
		player1 = new UserPigPlayer();
		player2 = new UserPigPlayer();
	}
	
	//Gets players 1 and 2 
	public PigGame(PigPlayer player1, PigPlayer player2)
	{
		this.player1 = player1; 
		this.player2 = player2; 
	}

	//Pig-Game 
	public void play()
	{ 
		//Initialize Scanner and die Class
		Scanner scnr = new Scanner(System.in);
		int letsRoll = diceTest.nextRoll();
		
		int myScore = 0; 
		int otherScore = 0 ; 
		int turnTotal = 0; 
		int twoTurnsTotal = 0; 
		
	// Beginning Game Loop 
	while (myScore < GOAL_SCORE && (otherScore < GOAL_SCORE))
		{
		System.out.println("Player 1 score: " + myScore);
		System.out.println("Player 2 score: " + otherScore);
		System.out.println("It is Player 1's " + "turn."); 
		
		//Player 1 Loop to roll Die 
		while (player1.isRolling(myScore, otherScore, turnTotal))
		{
			System.out.print("Roll : "); 
			System.out.print(letsRoll);
			System.out.println(); 
			
			if(letsRoll == 1)
			{
				turnTotal = 0; 
				break; 
			}
			else 
				if (letsRoll > 1)
			{
				turnTotal += letsRoll;
				continue;
			}
		}
		myScore += turnTotal; 
		System.out.println("New Score " + myScore);
		turnTotal = 0; 

		// Player Two Turn with Beginning of Loop 
		System.out.println("It is Player 2's "+ "turn." );
	
		// Player 2 loop to roll die
		while(player2.isRolling(otherScore, myScore, twoTurnsTotal))
		{
			System.out.print("Roll : "); 
			System.out.print(letsRoll);
			System.out.println(); 
			if(letsRoll > 1)
			{
				twoTurnsTotal += letsRoll;  
				continue; 
			}
			else 
				if (letsRoll == 1)
			{
				twoTurnsTotal = 0; 
				break; 
			}
		}
		
		// Requirements to end Game. 
		if (myScore >= GOAL_SCORE) 
		     System.out.println("Player 1 wins!");
		else if(otherScore >= GOAL_SCORE)
		     System.out.println("Player 2 wins!");
		}
	}
}
