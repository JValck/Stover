package view.object;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.setarit.stover.view.object.DiskPanelViewObject;

public class DiskPanelViewObjectTest {
	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	private DiskPanelViewObject diskPanelViewObject;
	
	@Before
	public void setUp() throws Exception{
		this.diskPanelViewObject = new DiskPanelViewObject();
	}

	@Test
	public void testGetAllDisksReturnsDisks() {
		assertTrue(diskPanelViewObject.getAllDisks().size() > 0);
	}

}
