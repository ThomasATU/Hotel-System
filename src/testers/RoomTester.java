package testers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import ie.atu.hotel.Room;
import ie.atu.hotel.Reservable;
import ie.atu.hotel.Employee;
import ie.atu.hotel.Guest;
import ie.atu.hotel.Person;

public class RoomTester
{
 public static void main(String[] args) 
 {
	 Room r1 = new Room (1, "Double Rooms", 160.00, true);
	 Room r2 = new Room (2, "Double Rooms", 160.00, true);
	 Room r3 = new Room (3, "Double Rooms", 160.00, true);
	 Room r4 = new Room (4, "Double Rooms", 160.00, true);
	 Room r5 = new Room (5, "Double Rooms", 160.00, true);
	 Room r6 = new Room (6, "King Rooms", 185.00, true);
	 Room r7 = new Room (7, "King Rooms", 185.00, true);
	 Room r8 = new Room (8, "King Rooms", 185.00, true);
	 Room r9 = new Room (9, "King Rooms", 185.00, true);
	 Room r10 = new Room (10, "King Rooms", 185.00, true);
	 Room r11 = new Room (11, "Family Rooms", 160.00, true);
	 Room r12 = new Room (12, "Family Rooms", 160.00, true);
	 Room r13 = new Room (13, "Family Rooms", 160.00, true);
	 
	//Create an ArrayList of Room called rooms
	ArrayList<Room> rooms = new ArrayList<Room>();
	//Add all 13 rooms to Room
	rooms.add(r1);
	rooms.add(r2);
	rooms.add(r3);
	rooms.add(r4);
	rooms.add(r5);
	rooms.add(r6);
	rooms.add(r7);
	rooms.add(r8);
	rooms.add(r9);
	rooms.add(r10);
	rooms.add(r11);
	rooms.add(r12);
	rooms.add(r13);
	
	//Display all the Rooms in room
	System.out.println("LIST OF ROOMS");
	for(Room room:rooms)
		System.out.println(room);
	
	//rooms.reserve(r1); //Reserve a room (v)
	//ArrayList<Guest> peopleInHotel = new ArrayList<>(); //Polymorphic (vii)
 }
}
