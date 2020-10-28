//***************************************
//Author: Pramit Patel
//********************************* */
public class OOPig 
{
	//Array for random choosing of player  
	public static int [] playerChoice = {1,2}; 
	
	//Main Method
	public static void main(String[] args) 
	{
		PigPlayer player1; 
		PigPlayer player2; 
		
		//Initialize Classes 
		HoldAt20PigPlayer holds20 = new HoldAt20PigPlayer();
		UserPigPlayer players = new UserPigPlayer();
		
		int choosePlayer = (int)(Math.random() * playerChoice.length + 1); 
		System.out.println("You will be player# " + choosePlayer); 
		
		if(choosePlayer >= 1)
		{ 
			  player1 = players; 
			  player2 = holds20; 
		} 
		else
		{
			player1 = holds20; 
			player2 = players; 
		}
	PigGame letsPlay = new PigGame(player1, player2); 
		letsPlay.play();
	}
}
