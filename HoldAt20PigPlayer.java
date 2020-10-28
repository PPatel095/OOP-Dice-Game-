//********************************************************************
// HoldAt20PigPlayer.java 
//
// Holding at 20 & returning values if score is less than Goal Score 
//*********************************************************************
public class HoldAt20PigPlayer implements PigPlayer
{
	public HoldAt20PigPlayer()
	{
	}
	
	//Returns whether or not player rolls.; 
	public boolean isRolling(int myScore, int otherScore, int turnTotal)
	{     
		return ((turnTotal < 20 && (myScore + turnTotal) < 100));
		}

}
