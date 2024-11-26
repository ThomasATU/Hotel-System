package ie.atu.hotel;

import java.util.Scanner;

//Person is an abstract class
//This means we use it to inherit from ONLY
//We cannot create object from class Person
public abstract class Person 
{
	protected Name name;
	protected String phoneNumber;
	
	public Person()
	{
		name = new Name();
		phoneNumber = "";
	}
	
	//Overloaded Initialization Constructor
	//Called when object would have been created like this
	public Person(Name name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override //Overrides object toString()
	public String toString()
	{
		return name + "\t" + phoneNumber;
	}
	
	public boolean equals(Object obj)
	{
		Person pObj;
		if(obj instanceof Person)
			pObj=(Person)obj;
		else
			return false;
		
		return name.equals(pObj.name) &&
				phoneNumber.equals(pObj.phoneNumber);
	}
	
	//get() methods
		public Name getName() 
		{
			return this.name;
		}
		public String getPhoneNumber() 
		{
			return phoneNumber;
		}
		
		// set() methods
		public void setName(Name name) 
		{
			this.name=name;
		}
		public void setPhoneNumber(String phoneNumberIn) 
		{
			phoneNumber=phoneNumberIn;
		}

		// read() method
		// ==> Called by subclasses to read() a Persons details from the user, e.g.
		//      super.read();
		public boolean read() 
		{
			Scanner kb=new Scanner(System.in);
			
			System.out.print("Title:");
			this.name.setTitle(kb.nextLine());
			System.out.print("First Name:");
			this.name.setFirst(kb.nextLine());
			System.out.print("Surname:");
			this.name.setSurname(kb.nextLine());
			
			System.out.print("Phone Number:");
			this.phoneNumber=kb.nextLine();
			
			return true;
		}
}
