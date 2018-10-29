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
		/**
		 * Created two new dice objects
		 * Declared an array that holds integer values, titled "value" with a size of 13
		 * Declared two variables roll1 and roll2
		 */
		DicePractice dice1 = new DicePractice();
		DicePractice dice2 = new DicePractice();
		int[] value = new int[13];
		
		int roll1;
		int roll2;
		/**
		 * The for loop loops 1000 times
		 * each time it rolls dice1 and dice2 and stores the value into the variable roll1 and roll2 respectively
		 * the integer variable sum is declared and initialized to the sum of roll1 and roll2
		 * the number at the index of "sum" in the array "value" (which starts at 0) is increased by 1 with each iteration of the loop
		 */
		for (int i = 0; i < 1000; i++)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			int sum = roll1 + roll2;
			value[sum]+=1;
		}
		/**
		 * For each value of "a", which starts at 2 to match with the possible values of "sum", the number of times the dice rolled
		 * that sum "a" is printed at the indice a
		 */
		for (int a = 2; a < 13; a++)
		{
			System.out.println("The value " + a + " was rolled " + value[a] + " times.");
		}
		

	}

}
