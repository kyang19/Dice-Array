/**
 * 
 * @author kimyang
 * Dice Array Project
 * Period 6
 */
public class DiceArray 
{

	public static void main(String[] args) 
	{
		DicePractice dice1 = new DicePractice();
		DicePractice dice2 = new DicePractice();
		int[] value = new int[13];
		
		int roll1;
		int roll2;
		
		for (int i = 0; i < 1000; i++)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			int sum = roll1 + roll2;
			value[sum]+=1;
		}
		
		for (int a = 2; a < 13; a++)
		{
			System.out.println("The value " + a + " was rolled " + value[a] + " times.");
		}
		

	}

}
