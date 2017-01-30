package domain.filesystem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.setarit.stover.domain.filesystem.File;

public class FileTest {
	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	private File file;

	private java.io.File testFile;
	
	@Before
	public void setUp() throws IOException{
		tempFolder.newFolder("subfolder1");
		testFile = tempFolder.newFile("testfile.txt");
		tempFolder.newFile("testfile2.txt");
		file = new File("Test folder", tempFolder.getRoot());		
	}
	
	@Test
	public void testGetFoldersReturnsFolders(){
		assertTrue(!file.getFolders().isEmpty());
	}
	
	@Test
	public void testGetNumberOfFoldersReturnsCorrectAmount(){
		assertEquals(1, file.getNumerOfFolders());
	}
	
	@Test
	public void testGetFilesReturnsFiles(){
		assertTrue(!file.getFiles().isEmpty());
	}
	
	@Test
	public void testGetNameReturnsDiskName(){
		assertEquals("Test folder", file.getName());
	}
	
	@Test
	public void testGetNumberOfFilesReturnsCorrectAmount(){
		assertEquals(2, file.getNumberOfFiles());
	}
	
	@Test
	public void testEqualsReturnsTrueIfSameFileObject(){
		assertTrue(file.getFiles().get(0).equals(new File("testfile.txt", testFile)));
	}
}
