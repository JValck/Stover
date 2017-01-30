package domain.filesystem;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.setarit.stover.domain.filesystem.ChildrenProber;

public class ChildrenProberTest {
	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();

	private ChildrenProber prober;
	private File folderA;
	private File fileA;
	private File fileB;

	@Before
	public void setUp() throws IOException{
		folderA = tempFolder.newFolder("subfolder1");
		fileA = tempFolder.newFile("testfile.txt");
		fileB = tempFolder.newFile("testfile2.txt");
		prober = new ChildrenProber(tempFolder.getRoot());	
	}

	@Test
	public void testProbeFoldersReturnsAllTheFolders(){
		assertTrue(prober.probeFolders().size() == 1);
	}

	@Test
	public void testProbeFilesReturnsAllTheFiles(){
		assertTrue(prober.probeFiles().size() == 2);
	}

	@Test
	public void testProbeFilesContainsCorrectFiles(){
		assertTrue(
				prober.probeFiles().contains(new com.setarit.stover.domain.filesystem.File("testfile.txt", fileA))
				&& prober.probeFiles().contains(new com.setarit.stover.domain.filesystem.File("testfile2.txt", fileB))
		);
	}
	
	@Test
	public void testProbeFoldersContainsCorrectFolders(){
		assertTrue(
				prober.probeFolders().contains(new com.setarit.stover.domain.filesystem.File("subfolder1", folderA))
		);
	}
	
	@Test
	public void testProbeFilesDoesNotContainFolders(){
		assertFalse(prober.probeFiles().contains(new com.setarit.stover.domain.filesystem.File("subfolder1", folderA)));
	}
	
	@Test
	public void testProbeFoldersDoesNotContainFiles(){
		assertFalse(
				prober.probeFolders().contains(new com.setarit.stover.domain.filesystem.File("testfile.txt", fileA))
				&& prober.probeFolders().contains(new com.setarit.stover.domain.filesystem.File("testfile2.txt", fileB))
		);
	}
}
