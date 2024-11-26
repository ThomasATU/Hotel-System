package ie.atu.serializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ie.atu.hotel.Employee;

public class EmployeeSerializer 
{
	private ArrayList<Employee> employees;
	
	private final String FILENAME = "employees.bin";	
	private File employeesFile;	
	
	// Default Constructor
	public EmployeeSerializer()
	{
		// Construct EmployeeList ArrayList
		employees = new ArrayList<Employee>();

		// TODO Construct employeesFile and physically create the File
		employeesFile = new File(FILENAME);
		try {
			employeesFile.createNewFile();
			
			if (employeesFile.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/////////////////////////////////////////////////////////////
	// Method Name : add()								       //
	// Return Type : void								       //
	// Parameters : None								       //
	// Purpose : Reads one Employee record from the user       //
	//           and adds it to the ArrayList called employees //
	/////////////////////////////////////////////////////////////
	public void add()
	{ 
	    // Create an Employee object
		 Employee employee = new Employee();
 
        // TODO - Update add() so it checks if Cancel was clicked when reading Employee, it won't add to the array
        
		 
		// Read its details
		if(employee.read()==true);
		// And add it to the employees ArrayList
		employees.add(employee);	
	}

	///////////////////////////////////////////////////////
	// Method Name : list()						              //
	// Return Type : void					   	           //
	// Parameters : None						                 //
	// Purpose : Lists all Employee records in employees //
	///////////////////////////////////////////////////////		
	public void list()
	{
		String employeesToList="";

		if(!employees.isEmpty()) {
			// for every Employee object in employees
			for(Employee tmpEmployee : employees) 
			{
				// add it to employeesToList and
				employeesToList+=tmpEmployee;
				// add a newline
				employeesToList+="\n";
			}
			
			// Display employeesToList in a messageDialog
		   JOptionPane.showMessageDialog(null, employeesToList, "EMPLOYEE LIST", JOptionPane.INFORMATION_MESSAGE);	
		}
		else
			// Display "No Employees stored..." in messageDialog
		   JOptionPane.showMessageDialog(null, "No Employees to list.", "EMPLOYEE LIST", JOptionPane.INFORMATION_MESSAGE);	
	}	

	////////////////////////////////////////////////////////////////
	// Method Name : view()									              //
	// Return Type : Employee								              //
	// Parameters : None								                    //
	// Purpose : Displays the required Employee record on screen  //
	//         : And returns it, or null if not found             //   
	////////////////////////////////////////////////////////////////	
	public Employee view()
	{
	    //JOptionPane.showMessageDialog(null, "view() method must be coded!", "NOT IMPLEMENTED", JOptionPane.INFORMATION_MESSAGE);	
		
		// TODO - Write the code for view()
		Scanner kb=new Scanner(System.in);
	    System.out.println("Enter number of Employee: ");
	    int employeeToView=kb.nextInt();
	    
	    for(Employee employee:employees)
		{
			if(employee.getNumber() == employeeToView)
			{
				System.out.println(employee);
				return employee;
			}
		}

	    return null;		
	}
	
	///////////////////////////////////////////////////////////////////
	// Method Name : delete()							        	           //
	// Return Type : void								        	           //
	// Parameters : None									                    //
	// Purpose : Deletes the required Employee record from employees //
	///////////////////////////////////////////////////////////////////	
	public void delete()
	{
	    //JOptionPane.showMessageDialog(null, "delete() method must be coded!", "NOT IMPLEMENTED", JOptionPane.INFORMATION_MESSAGE);	
		
		//TODO - Write the code for delete()
		//call the view() method to find the employee that will be deleted
		Employee employeeToDelete=view();
		
		//if the employee to be deleted is =! null
		if(employeeToDelete != null)
			//delete it from the arrayList
			employees.remove(employeeToDelete);
	}

	///////////////////////////////////////////////////////////////
	// Method Name : edit()			  					                //
	// Return Type : void								    	          //
	// Parameters : None								     	             //
	// Purpose : Edits the required Employee record in employees //
	///////////////////////////////////////////////////////////////	
	public void edit()
	{
	    //JOptionPane.showMessageDialog(null, "edit() method must be coded!", "NOT IMPLEMENTED", JOptionPane.INFORMATION_MESSAGE);	
	    
		// TODO - Write the code for edit()
	    Employee employeeToEdit = view();
	    
	    if(employeeToEdit != null)
	    {
	    	//get index of employeeToEdit
	    	int index = employees.indexOf(employeeToEdit);
	    	//read in the details for it
	    	employeeToEdit.read();
	    	//set the index in employees to new employees
	    	employees.set(index, employeeToEdit);
	    }
	}
	
	// This method will serialize the employees ArrayList when called, 
	// i.e. it will write employees to a file called employees.bin
	public void serializeEmployees()
	{
		ArrayList<Employee> employee = new ArrayList<Employee>();
		 // TODO - Write the code for serializeEmployees()
		 //JOptionPane.showMessageDialog(null, "You must write the code for the serializeEmployees() method.", "NOT IMPLEMENTED", JOptionPane.INFORMATION_MESSAGE);
		 try {
			 //serialize data to a file
			 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.bin"));
			 out.writeObject(employee);
			 out.close();
		 } catch (IOException e) {
		 
		 }
	}

	// This method will deserialize the Employees ArrayList when called, 
	// i.e. it will restore the employees ArrayList from the file employees.bin
	public void deserializeEmployees()
	{
		 ObjectInputStream is=null;
		
		 try {
			 // Deserialize the ArrayList...
			 FileInputStream fileStream = new FileInputStream(employeesFile);
				
			 is = new ObjectInputStream(fileStream);
						
			 employees = (ArrayList<Employee>)is.readObject();
          
          is.close();
		}
		catch(FileNotFoundException fNFE)
		 {
			 System.out.println("Cannot open file " + employeesFile.getName() + ".");
		}
		catch(IOException ioE){
			 System.out.println("Cannot read from " + employeesFile.getName() + ".");
		}
		catch(Exception e){
			 System.out.println("Cannot read from " + employeesFile.getName() + ".");
		}
	}
}