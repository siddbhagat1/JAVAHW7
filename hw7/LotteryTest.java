package hw7;
import java.util.Scanner;
public class LotteryTest {
	public static void main(String[] args)
	{
		int[] userArray = new int[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number for the User Array here: ");
			userArray[i] =  in.nextInt();
		}
		Lottery l = new Lottery();
		int[] lotteryNumbers = new int[5]; 
		int count = l.compare(userArray);
		lotteryNumbers = l.get_LotteryNumbers();
		for(int access : lotteryNumbers)
		{
			System.out.println(access);
		}
		System.out.println("Number of Digits that Match with the Lottery Numbers are "+ count);
		if(count == 5)
		{
			System.out.println("You are A Grand Prize Winner");
		}
		in.close();
	}
}



