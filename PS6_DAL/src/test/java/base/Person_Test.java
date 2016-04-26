import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import domain.StudentDomainModel;

public class Person_Test {

	private Object perID;

	@Before
	public void setUp() throws Exception {
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@After
	public void tearDown() throws Exception {
	}

	public static Calendar cal = Calendar.getInstance();

	@Test
	public void addTest() {
		cal.set(1996, Calendar.DECEMBER, 15, 0, 0, 0);
		Date birthday = cal.getTime();
		UUID perID = UUID.randomUUID();
		PersonDomainModel per = new PersonDomainModel("Anna", "Johnson", "Orchard Road", 19717, "Newark", perID, birthday);
		System.out.println(per);
		PersonDAL.addPerson(per);
		assertTrue(1==1);
	}
	@Test
	public void deleteTest() {
		UUID perID;
		PersonDAL.deletePerson(perID);
		System.out.println(perID);
		assertTrue(1==1);
	}
	@Test
	public void updateTest() {
		cal.set(1995, Calendar.NOVEMBER, 15, 0, 0, 0);
		Date birthday = cal.getTime();
		PersonDomainModel per = PersonDomainModel("Ann", "Johnson", "Apple Road", 19717, "Newark", perID, birthday);
		System.out.println(perID);
		PersonDAL.updatePerson(per);
	}
	@Test
	public void getTest() {
		cal.set(1995, Calendar.NOVEMBER, 15, 0, 0, 0);
		Date birthday = cal.getTime();
		UUID perID = perID
				System.out.println("Enter The Person's ID: ");
				int perID = reader.nextInt();
		PersonDomainModel per = PersonDomainModel("Ann", "Johnson", "Apple Road", 19717, "Newark", perID, birthday);
		PersonDAL.getPerson(perID);
	}
}
