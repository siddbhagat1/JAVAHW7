package hw7;
import java.util.Random;
public class Lottery {
	int[] lotteryNumbers = new int[5];
	public Lottery()
	{
		Random random = new Random();
		for(int i=0;i<5;i++)
		{
			lotteryNumbers[i] = random.nextInt(10);
		}
	}
	public int compare(int[] userArray)
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(lotteryNumbers[i]==userArray[i])
			{
				count++;
			}
		}
		return count;
	} 
	public int[] get_LotteryNumbers()
	{
		return lotteryNumbers;
	}
}
