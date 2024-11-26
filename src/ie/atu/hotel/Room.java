/**
 * Class: Software Implementation
 * Date: 15/10/2024
 * Name: Thomas Tobin @L00176379
 */
package ie.atu.hotel;
import java.text.DecimalFormat;
import ie.atu.hotel.Name;
import ie.atu.hotel.Guest;
import ie.atu.hotel.Date;
import ie.atu.hotel.Person;
import ie.atu.hotel.Employee;
import ie.atu.hotel.Reservable; //Importing necessary classes

import javax.swing.JOptionPane;

public class Room 
{
	private int roomNumber; //Room has a number, type, price, and allocation
	private String roomType;
	private double pricePerNight;
	private boolean allocated;
	
	//Initialization Constructor
	public Room(int roomNumber, String roomType, double pricePerNight, boolean allocated)
	{
	 this.roomNumber=roomNumber;
	 this.roomType=roomType;
	 this.pricePerNight=pricePerNight;
     this.allocated=false;
	}

	@Override
	public String toString() 
	{
	 DecimalFormat df=new DecimalFormat("#.00");
	 return roomNumber + " " + roomType + " ROOM @ €" + df.format(pricePerNight) + " per night " + (allocated ? "BOOKED" : "FREE");
	}
	
	//Change RoomBasic to Room
	@Override
	public boolean equals(Object obj)
	{
	 Room rObject;
	 if (obj instanceof Room)
	  rObject = (Room)obj;
	 
	 else
	  return false;
	 
	 return this.roomNumber == (rObject.roomNumber);
	}

	//set() and get() methods
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber=roomNumber;
	}
	public void setRoomType(String roomType)
	{
		this.roomType=roomType;
	}
	public void setPricePerNight(double pricePerNight)
	{
		this.pricePerNight=pricePerNight;
	}
	public void setAllocated(boolean allocated) 
	{
		this.allocated=allocated;
	}
	public int getNumber() 
	{
		return roomNumber;
	}
	public String getRoomType() 
	{
		return roomType;
	}
	public double getPricePerNight() 
	{
		return pricePerNight;
	}
	public boolean getAllocated() 
	{
		return allocated;
	}
	
	//Reserve a room
	public void reserve()
	{
		allocated = true;
		System.out.println("Room " + roomNumber + " is reserved");
	}
	
	//Cancel a reservation
	public void cancel()
	{
		allocated = false;
		System.out.println("Room " + roomNumber + " is available");
	}
	
	public static void main(String [] args)
	{
		try
		{
			String numberAsString = JOptionPane.showInputDialog("Please enter price as a number equal to or greater than €100.00: ", null);
			double number = Integer.parseInt(numberAsString);
			JOptionPane.showMessageDialog(null, "Number entered is: " + number);
			
		}
		
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "A number number equal to or greater than €100.00 is required!");
		}
		System.out.println("Continue with the rest of the program...");
	}
}
