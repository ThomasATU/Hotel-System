package testers;

import ie.atu.hotel.Date;

public class DateTester 
{
 public static void main(String[] args) 
 {
	Date d1 = new Date();
	System.out.println(d1);      

	d1.setDay(4);
	d1.setMonth(6);
	d1.setYear(1941);
		
	System.out.println(d1);
      
	Date d2 = new Date(28, 12, 1982);
    System.out.println(d2);
      
	if(d1.equals(d2))
	System.out.println("Date's are equal.");
	else
	System.out.println("Date's are not equal.");
   }
}
