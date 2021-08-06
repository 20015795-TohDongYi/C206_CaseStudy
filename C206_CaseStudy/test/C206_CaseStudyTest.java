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
	
	ArrayList<UserAccount> userList = new ArrayList<UserAccount>();
	ArrayList<Package> packageList = new ArrayList<Package>();
	
	public C206_CaseStudyTest() 
	{
		super();
	}
	
	
	@Before
	public void setUp() throws Exception {
		ua1 = new UserAccount("Angelika", "Customer","20006337@myrp.edu.sg", "RP123@456");
		ua2 = new UserAccount("Ji Fu", "Customer", "19022507@myrp.edu.sg", "RP765@4321");
		ua3 = new UserAccount("Fatheen", "Designer", "19006266@myrp.edu.sg", "RP12345");
		

		p1 = new Package("WP123", "whole place", "15/09/2021", "13/10/2021", 500);
		p2 = new Package("R1234", "restrooms only", "05/08/2021", "15/12/2021", 100);
		p3 = new Package("K1234", "kitchen only", "21/06/2021", "10/08/2021", 200);
		
		userList = new ArrayList<UserAccount>();
		packageList = new ArrayList<Package>();
			
	}

	

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}


	
	@Test
	public void testAddAccount() {
		
		
		
	}
	@Test
	public void testAddPackage() {
		
	}
	
	@Test
	public void testRetrieveAllAccounts() {
		
		
	}
	@Test
	public void testRetrieveAllPackage() {
		
		
		
	}

	@Test
	public void testviewAllAccounts() {
		
	

	}
	
	@Test
	public void testviewAllPackage() {
		
		
	}
	
	@Test
	public void testdeleteAccount() {
		
		
	}
	@Test
	public void testdeletePackage() {
		
		
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

