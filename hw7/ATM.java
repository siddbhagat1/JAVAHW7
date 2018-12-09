package hw7;

public class ATM {
	double balance;
	int pin;
	int bank_Pin;
	static int i=0;
	public ATM()
	{
		balance=0;
		try
		{
			if(balance<1000)
			{
				throw new Insufficient_Balance();
			}
		}
		catch(Insufficient_Balance ib)
		{
			System.out.println(ib);
			System.exit(1);
		}
	}
	public ATM(double bal,int p,int bp)
	{
		try
		{
			if(bal<1000)
			{
				throw new Insufficient_Balance();
			}
		}
		catch(Insufficient_Balance ib)
		{
			System.out.println(ib);
			System.exit(1);
		}
		balance = bal;
		pin = p;
		bank_Pin = bp;
	}
	public void deposit(double amount,int p,int bp)
	{
		try {
			if(p!=pin)
			{
				throw new Wrong_Pin();
			}
		}
		catch(Wrong_Pin wp)
		{
			System.out.println(wp);
			System.exit(1);
		}
		if(bp!= bank_Pin)
		{
			i++;
		}
		try
		{
			if(i>3)
			{
				throw new Interbank_Trans_Exceed();
			}
		}
		catch(Interbank_Trans_Exceed ite)
		{
			System.out.println(ite);
			System.exit(1);
		}
		balance+=amount;
		System.out.println("Deposit Successfull");
	}
	public void withdraw(double amount,int p,int bp)
	{
		try {
			if(p!=pin)
			{
				throw new Wrong_Pin();
			}
		}
		catch(Wrong_Pin wp)
		{
			System.out.println(wp);
			System.exit(1);
		}
		try {
			if(amount>balance)
			{
				throw new Insufficient_Balance();
			}
		}
		catch(Insufficient_Balance ib)
		{
			System.out.println(ib);
			System.exit(1);
		}
		try {
			if(amount%100!=0 && amount%500!=0 && amount%2000!=0)
			{
				throw new Multiple_Exception();
			}
		}
		catch(Multiple_Exception me)
		{
			System.out.println(me);
			System.exit(1);
		}
		if(bp!= bank_Pin)
		{
			i++;
		}
		try
		{
			if(i>3)
			{
				throw new Interbank_Trans_Exceed();
			}
		}
		catch(Interbank_Trans_Exceed ite)
		{
			System.out.println(ite);
			System.exit(1);
		}
		balance-=amount;
		System.out.println("Withdrawl Successfull");
	}
	public double check_Balance(int p,int bp)
	{
		try {
			if(p!=pin)
			{
				throw new Wrong_Pin();
			}
		}
		catch(Wrong_Pin wp)
		{
			System.out.println(wp);
			System.exit(1);
		}
		if(bp!= bank_Pin)
		{
			i++;
		}
		try
		{
			if(i>3)
			{
				throw new Interbank_Trans_Exceed();
			}
		}
		catch(Interbank_Trans_Exceed ite)
		{
			System.out.println(ite);
			System.exit(1);
		}
		return balance;
	}
}
class Insufficient_Balance extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Insufficient Balance Exception");
	}
}
class Wrong_Pin extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("Wrong Pin Entered");
	}
}
class Multiple_Exception extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("User can withdraw in multiples of 100, 500, and 2000 only");
	}
}
class Interbank_Trans_Exceed extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return ("You have exceeded the Limit for Inter Bank Transactions");
	}
}

