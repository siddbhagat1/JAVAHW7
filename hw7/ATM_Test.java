package hw7;
import java.util.Scanner;
public class ATM_Test {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double bal;
		System.out.println("Enter the initial Balance here: ");
		bal = in.nextDouble();
		int p;
		System.out.println("Enter the ATM Pin here: ");
		p = in.nextInt();
		int bp=1;
		ATM a1 = new ATM(bal,p,bp);
		while(true) {
		System.out.println("Enter from the following: ");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check_Balance");
		System.out.println("4.exit");
		int option = in.nextInt();
		long start_Time = System.currentTimeMillis();
		long stop_Time=0;
		long time_Elapsed;
		switch(option)
		{
		case 1:
		{
			double amount;
			System.out.println("Enter the Amount to be Withdrawn ");
			amount = in.nextDouble();
			try {
				if(amount<0)
				{
					in.close();
					throw new Invalid_Amount();
				}
			}
			catch(Invalid_Amount ia)
			{
				System.out.println(ia);
				System.exit(1);
			}
			System.out.println("Enter your pin here: ");
			p = in.nextInt();
			a1.withdraw(amount, p, bp );
			stop_Time = System.currentTimeMillis();
			time_Elapsed = stop_Time - start_Time;
			try {
				if(time_Elapsed>300000)
				{
					in.close();
					throw new Time_Out();
				}
			}
			catch(Time_Out to)
			{
				System.out.println(to);
				System.exit(1);
			}
			break;
		}
		case 2:
		{
			double amount;
			System.out.println("Enter the Amount to be Deposited ");
			amount = in.nextDouble();
			try {
				if(amount<0)
				{
					in.close();
					throw new Invalid_Amount();
				}
			}
			catch(Invalid_Amount ia)
			{
				System.out.println(ia);
				System.exit(1);
			}
			System.out.println("Enter your pin here: ");
			p = in.nextInt();
			a1.deposit(amount, p, bp);
			stop_Time = System.currentTimeMillis();
			time_Elapsed = stop_Time - start_Time;
			try {
				if(time_Elapsed>300000)
				{
					in.close();
					throw new Time_Out();
				}
			}
			catch(Time_Out to)
			{
				System.out.println(to);
				System.exit(1);
			}
			break;
		}
		case 3:
		{
			System.out.println("Enter your pin here: ");
			p = in.nextInt();
			System.out.println(a1.check_Balance(p, bp));
			stop_Time = System.currentTimeMillis();
			time_Elapsed = stop_Time - start_Time;
			try {
				if(time_Elapsed>300000)
				{
					in.close();
					throw new Time_Out();
				}
			}
			catch(Time_Out to)
			{
				System.out.println(to);
				System.exit(1);
			}
			break;
		}
		case 4:
		{
			System.out.println("Thank You");
			in.close();
			System.exit(1);
		}
		default:
		{
			try
			{
				in.close();
				throw new Invalid_Option();
			}
			catch(Invalid_Option io)
			{
				System.out.println(io);
				System.exit(1);
			}
		}
		}
		}
		//in.close();
	}
}
class Invalid_Option extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Entered Option is An Invalid Option");
	}
}
class Invalid_Amount extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return("Entered Amount cannot be Negative");
	}
}
class Time_Out extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Session Timed Out");
	}
}

