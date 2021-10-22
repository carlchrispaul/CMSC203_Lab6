import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook gradeB1, gradeB2;
	
	@BeforeEach
	void setUp() throws Exception {
		//two GradeBook objects
		gradeB1 = new GradeBook(5);
		gradeB2 = new GradeBook(5);
		
		//calling the addScore method
		//gradeB1
		gradeB1.addScore(10);
		gradeB1.addScore(30);
		gradeB1.addScore(50);
		gradeB1.addScore(70);
		gradeB1.addScore(90);
		
		//gradeB2
		gradeB2.addScore(20);
		gradeB2.addScore(40);
		gradeB2.addScore(60);
		gradeB2.addScore(80);
	}

	@AfterEach
	void tearDown() throws Exception {
		//set to null
		gradeB1 = null;
		gradeB2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradeB1.toString().equals("10.0 30.0 50.0 70.0 90.0"));
		assertTrue(gradeB2.toString().equals("20.0 40.0 60.0 80.0"));
		assertEquals(gradeB1.getScoreSize(), 5);
		assertEquals(gradeB2.getScoreSize(), 4);
	}

	@Test
	void testSum() {
		assertEquals(gradeB1.sum(), 250);
		assertEquals(gradeB2.sum(), 200);
	}

	@Test
	void testMinimum() {
		assertEquals(gradeB1.minimum(), 10);
		assertEquals(gradeB2.minimum(), 20);
	}

	@Test
	void testFinalScore() {
		assertEquals(gradeB1.finalScore(), 240);
		assertEquals(gradeB2.finalScore(), 180);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(gradeB1.getScoreSize(), 5);
		assertEquals(gradeB2.getScoreSize(), 4);
	}

	@Test
	void testToString() {
		assertTrue(gradeB1.toString().equals("10.0 30.0 50.0 70.0 90.0"));
		assertTrue(gradeB2.toString().equals("20.0 40.0 60.0 80.0"));
	}
}
