package base;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public static Calendar cal = Calendar.getInstance();

	@Test
	public void addTest() {
		cal.set(1996, Calendar.DECEMBER, 15, 0, 0, 0);
		Date birthday = cal.getTime();
		StudentDomainModel stu = new StudentDomainModel("Anna", "Lea", "Johnson", birthday);
		System.out.println(stu);
		StudentDAL.addStudent(stu);
		assertTrue(1==1);
	}
	
	@Test
	public void deleteTest() {
		UUID stuID = UUID.randomUUID();
		StudentDAL.deleteStudent(stuID);
		System.out.println(stuID);
		assertTrue(1==1);
	}
	@Test
	public void updateTest() {
		cal.set(1995, Calendar.NOVEMBER, 14, 0, 0, 0);
		Date birthday = cal.getTime();
		StudentDomainModel stu = new StudentDomainModel("Ann", "May", "Richardson", birthday);
		System.out.println(stu);
		StudentDAL.updateStudent(stu);
	}
	@Test
	public void getTest(){
		cal.set(1995, Calendar.NOVEMBER, 15, 0, 0, 0);
		Date birthday = cal.getTime();
		UUID stuID = stuID
				System.out.println("Enter The Student's ID: ");
				int stuID = reader.nextInt();
		StudentDomainModel stuID = StudentDomainModel("Ann", "May", "Richardson", birthday);
		System.out.println(stuID);
		StudentDAL.getStudent(stuID);
	}
	
}
