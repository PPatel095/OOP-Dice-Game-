//****************************************
// Die.java  
//The die class used to create random rolls 
//*****************************************
public class Die 
{	//Initialize Array for Die values 
	private int[] die = {1,2,3,4,5,6};  
	
	public Die() 
	{ 
		for(int i = 0; i < die.length; i++)
		{	
			return; 
		}
	}
	
	//Die with integer outcomes 
	public Die(int [] outcomes)
	{
		for(int i = 0; i < die.length; i++)
			die[i] = outcomes[i];z
	}
	
	//New Die with Incremental values given min value 
	public Die(int sides, int min)
	{
		int[] faceValues = new int [6]; 
		faceValues = new int [sides]; 
		for(int i = 0; i < sides; i++)
			faceValues[i] = min + 1; 
	}
	
	//Rolls random value from 1-6
	public int nextRoll()
	{
		for(int i = 0; i < die.length; i ++);
			int nextRoll = (int)(Math.random() * die.length + 1);
			return nextRoll;
	}
}