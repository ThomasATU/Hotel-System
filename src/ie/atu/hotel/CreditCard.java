package ie.atu.hotel;

import java.util.Scanner;

public class CreditCard 
{
	private long number;
	private Date expiryDate;
	private int securityCode;
	
	//Initialization constructor
	//Called when a CreditCard object is created like this ==>
	//CreditCard bensCard=new CreditCard(1111222233334444,new Date(31,12,2025),999);
	public CreditCard(long number, Date expiry, int secCode) 
	 {   
	  this.number = number;
	  this.expiryDate = expiry;
	  this.securityCode = secCode;
	 }
	
	//toString() method
	//==> called when a String of the class is used, e.g.
	//- System.out.print(joesCard);
	//or System.out.print(bensCard);
	@Override
	public String toString()
	{
		return "Card Number: " + number;
	}
	
	//equals() method
	//==> Called when comparing an object with another object, e.g. -
	//if(bensCard.equals(new CreditCard(1111222233334444,new Date(31,12,2025),999))	
	@Override
	public boolean equals(Object obj)
	{
		CreditCard ccObject;
		if (obj instanceof CreditCard)
			ccObject = (CreditCard) obj;
		else
			return false;
		
		return this.number==ccObject.number;
	}
	
	public long getNumber()
	{
		return number;
	}
	
	public Date getExpiryDate()
	{
		return expiryDate;
	}
	
	public int getSecurityCode()
	{
		return securityCode;
	}
	
	
	//read()s a CreditCards details from the user
	//using Scanner
	public void read()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("CREDIT CARD DETAILS");
		System.out.println("Card Number:");
		number=kb.nextLong();
		System.out.println("Expiry Date:");
		int d=kb.nextInt();
		int m=kb.nextInt();
		int y=kb.nextInt();
		//expiryDate=new Date(d,m,y);
		System.out.println("Security Code:");
		//securityCode=kb.nextInt();
	}
}
