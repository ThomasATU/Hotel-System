package ie.atu.hotel;

public class Name 
{
	String title, first, surname; //the title, first name, and last name
	
	public Name()
	{
		title = null;
		first = null;
		surname = null;
	}
	
	public Name(String t, String f, String s)
	{
		title = t;
		first = f;
		surname = s;
	}
	
	public String toString()
	{
		return title + "/" + first + "/" + surname;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==first)
		{
			return true;
		}
		
		if(obj==surname)
		{
			return true;
		}
		
		if(obj==title)
		{
			return true;
		}
		
		return false;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public void setFirst(String first)
	{
		this.first = first;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	  public boolean isFemale()
	  {
		  if(title.equalsIgnoreCase("Miss") || 
			 title.equalsIgnoreCase("Ms") || 
			 title.equalsIgnoreCase("Mrs")) 
			    return true;
		   else
			    return false;
	   }
}
