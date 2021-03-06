import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private UserAccount ua1;
	private UserAccount ua2;
	private UserAccount ua3;
	private Package p1;
	private Package p2;
	private Package p3;
	
	private Appointment apt1;
	private Appointment apt2;
	
	ArrayList<UserAccount> userList = new ArrayList<UserAccount>();
	ArrayList<Package> packageList = new ArrayList<Package>();
	ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	public C206_CaseStudyTest() 
	{
		super();
	}
	
	
	@Before
	public void setUp() throws Exception {
		ua1 = new UserAccount("Angelika", "Customer","20006337@myrp.edu.sg", "RP123@456");
		ua2 = new UserAccount("Ji Fu", "Customer", "19022507@myrp.edu.sg", "RP765@4321");
		ua3 = new UserAccount("Fatheen", "Designer", "19006266@myrp.edu.sg", "RP12345");
		

		p1 = new Package("W0123", "whole place", "15/09/2021", "13/10/2021", 500);
		p2 = new Package("R1234", "restrooms only", "05/08/2021", "15/12/2021", 100);
		p3 = new Package("K1234", "kitchen only", "21/06/2021", "10/08/2021", 200);
		
		apt1 = new Appointment("Wick", "18-8-2020", "11.59", "Fatheen", "Woodlands");
		apt2 = new Appointment("Rogers", "20-8-2020", "15:30", "Fatheen", "Jurong");
		
		userList = new ArrayList<UserAccount>();
		packageList = new ArrayList<Package>();
		appointmentList = new ArrayList<Appointment>();
			
	}

	

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}


	
	@Test
	public void testAddAccount() {
		assertNotNull("Test if there is a UserAccount arraylist", userList);
		
		C206_CaseStudy.addUser(userList, ua1);
		assertEquals("Check that UserAccount arraylist size is 1", 1, userList.size());
		assertSame("Check that UserAccount is added", ua1, userList.get(0));
		
		C206_CaseStudy.addUser(userList, ua2);
		assertEquals("Check that UserAccount arraylist size is 2", 2, userList.size());
		assertSame("Check that UserAccount is added", ua2, userList.get(1));
	}
		
		
	
	@Test
	public void testAddPackage() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is a package arraylist", packageList);
		
		C206_CaseStudy.addPackage(packageList, p1);
		assertEquals("Check that Package arraylist size is 1", 1, packageList.size());
		assertSame("Check that Package is added", p1, packageList.get(0));
		
		
		C206_CaseStudy.addPackage(packageList, p2);
		assertEquals("Check that Package arraylist size is 2", 2, packageList.size());
		assertSame("Check that Package is added", p2, packageList.get(1));
	}
	
	
	@Test
	public void testRetrieveAllAccounts() {
		assertNotNull("Test if there is valid UserAccount arraylist to retrieve item", userList);
		
		//test if the list of Accounts retrieved from the SourceCentre is empty - boundary
		String allUsers= C206_CaseStudy.retrieveAllAccounts(userList);
		String testOutput = "";
		assertEquals("Check that viewAllAccounts", testOutput, allUsers);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPackage(packageList, p1);
		C206_CaseStudy.addPackage(packageList, p2);
		assertEquals("Test that Package arraylist size is 2", 2, packageList.size());
		
		//test if the expected output string same as the list of accounts retrieved from the SourceCentre	
		allUsers= C206_CaseStudy.retrieveAllAccounts(userList);
		testOutput = String.format("%-15s %-30s %-20s %-20s \n","Angelika", "Customer","20006337@myrp.edu.sg", "RP123@456");
		testOutput += String.format("%-15s %-30s %-20s %-20s \n","Ji Fu", "Customer", "19022507@myrp.edu.sg", "RP765@4321");
	
		//assertEquals("Test that ViewAllAccounts", testOutput, allUsers);
		
	}
	@Test
	public void testRetrieveAllPackage() {
		assertNotNull("Test if there is valid Package arraylist to retrieve item", packageList);
		
		//test if the list of Package retrieved from the SourceCentre is empty - boundary
		String allpackage= C206_CaseStudy.retrieveAllPackage(packageList);
		String testOutput = "";
		assertEquals("Check that ViewAllPackagelist", testOutput, allpackage);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPackage(packageList, p1);
		C206_CaseStudy.addPackage(packageList, p2);
		assertEquals("Test that Package arraylist size is 2", 2, packageList.size());
		
		//test if the expected output string same as the list of package retrieved from the SourceCentre	
		allpackage= C206_CaseStudy.retrieveAllPackage(packageList);
		testOutput = String.format("%-15s %-30s %-20s %-20s $%-10d\n","W0123", "whole place", "15/09/2021", "13/10/2021", 500);
		testOutput += String.format("%-15s %-30s %-20s %-20s $%-10d\n","R1234", "restrooms only", "05/08/2021", "15/12/2021", 100);
	
		assertEquals("Test that ViewAllPackagelist", testOutput, allpackage);
		
		
		
	}

	@Test
	public void testviewAllAccounts() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is a useraccount arraylist", userList);
		
		//test if the list of UserAccount retrieved from the Main is empty - boundary
		String allUser= C206_CaseStudy.retrieveAllAccounts(userList);
		String testOutput = "";
		assertEquals("Test that the retrieved Accounts list is empty?", testOutput, allUser);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addUser(userList, ua1);
		C206_CaseStudy.addUser(userList, ua2);
				
		//test if the expected output string same as the list of accounts retrieved from the SourceCentre	
		C206_CaseStudy.viewAllAccounts(userList);
		allUser= C206_CaseStudy.retrieveAllAccounts(userList);
		testOutput = String.format("%-15s %-30s %-20s %-20s \n","Angelika", "Customer","20006337@myrp.edu.sg", "RP123@456");
		testOutput += String.format("%-15s %-30s %-20s %-20s \n","Ji Fu", "Customer", "19022507@myrp.edu.sg", "RP765@4321");
		//assertEquals("Test that package has been added", testOutput, allUser);	
		
	

	}
	
	@Test
	public void testviewAllPackage() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is a package arraylist", packageList);
		
		//test if the list of Package retrieved from the Main is empty - boundary
		String allPackage= C206_CaseStudy.retrieveAllPackage(packageList);
		String testOutput = "";
		assertEquals("Test that the retrieved Package list is empty?", testOutput, allPackage);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPackage(packageList, p1);
		C206_CaseStudy.addPackage(packageList, p2);
		
		//test if the expected output string same as the list of package retrieved from the SourceCentre	
		C206_CaseStudy.viewAllPackage(packageList);
		allPackage= C206_CaseStudy.retrieveAllPackage(packageList);
		testOutput = String.format("%-15s %-30s %-20s %-20s $%-10d\n","W0123", "whole place", "15/09/2021", "13/10/2021", 500);
		testOutput += String.format("%-15s %-30s %-20s %-20s $%-10d\n","R1234", "restrooms only", "05/08/2021", "15/12/2021", 100);
		assertEquals("Test that package has been added", testOutput, allPackage);
		
		
	}
	
	@Test
	public void testdeleteAccount() {
		assertNotNull("Test if there is a UserAccount arraylist", userList);
		
		C206_CaseStudy.addUser(userList, ua1);
		assertEquals("Check that UserAccount arraylist size is 1", 1, userList.size());
		assertSame("Check that UserAccount is deleted", ua1, userList.get(0));
		
		String name = ua1.getName();
		C206_CaseStudy.deleteAccount(userList,name);

		assertEquals("Check that UserAccount arraylist size is 0", 0, userList.size());
		
		
	}
	@Test
	public void testdeletePackage() {
		
		assertNotNull("Test if there is a package arraylist", packageList);
		
		C206_CaseStudy.addPackage(packageList, p1);
		assertEquals("Check that Package arraylist size is 1", 1, packageList.size());
		assertSame("Check that Package is added", p1, packageList.get(0));
		
		String code = p1.getCode();
		C206_CaseStudy.deletePackage(packageList,code);

		assertEquals("Check that Package arraylist size is 0", 0, packageList.size());
		
		
	}
	
	@Test
	public void viewAppointmentTest() {
		// Test if appointmentList has been added before
		assertNotNull("Test if there is valid Appointment arraylist to retrieve", appointmentList);

		// Test if the list of Appointment retrieved from the C206_CaseStudy is empty
		String allAppt = C206_CaseStudy.viewAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Check that viewing of appintmentment is empty", testOutput, allAppt);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, apt1);
		C206_CaseStudy.addAppointment(appointmentList, apt2);
		assertEquals("Test that the Appointment arraylist size is 2", 2, appointmentList.size());
//
//		// test if the expected output same as the list if appointment retrieved
//		allAppt = C206_CaseStudy.viewAllAppointment(appointmentList);
//		testOutput = String.format("%-10s %-15s %-15s %-15s %15s\n", "Wick", "18-8-2021", "11.59", "Fatheen",
//				"Woodlands");
//		testOutput += String.format("%-10s %-15s %-15s %-15s %15s\n", "Rogers", "20-8-2021", "15:30", "Fatheen", "Jurong");
//
//		assertEquals("Test that the Appointment output has the above test outputs", testOutput, allAppt);
	}
	
	@After
	public void tearDown() throws Exception {
		ua1 = null;
		ua2 = null;
		ua3 = null;
		p1= null;
		p2= null;
		p3 = null;
		userList = null;
		packageList = null;

	}
	

}

