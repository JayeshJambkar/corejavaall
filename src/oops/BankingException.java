package oops;

import java.util.Scanner;

class MiniBalanceException extends Exception
{	
//	String msg;
	public MiniBalanceException(String msg)
	{
		super(msg);
//		this.msg=msg;
	}
//	@Override
//	public String toString() {
//		
//		return msg;
//	}
}
public class BankingException {
	static int balance=1000;

	public static void main(String[] args) throws MiniBalanceException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int amount=sc.nextInt();
		try {
			
		
		if(balance<amount)
		{
			throw new MiniBalanceException("insufficient balance! your balance is: "+balance);
		}
		else
		{
			System.out.println("plz take money: "+amount);
		}
		}
		catch(MiniBalanceException e)
		{
			System.out.println(e);
		}
	}

}