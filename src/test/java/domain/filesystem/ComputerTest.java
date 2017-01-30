package domain.filesystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.setarit.stover.domain.filesystem.Computer;

public class ComputerTest {
	private Computer computer;
	
	@Before
	public void setUp(){
		computer = new Computer("Test PC");
	}

	@Test
	public void testGetDisksHasMinimumOneDisk() {
		assertTrue(computer.getNumberOfDisks() > 0);
	}

}
