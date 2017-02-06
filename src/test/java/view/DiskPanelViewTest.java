package view;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.setarit.stover.view.object.DiskPanelViewObject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class DiskPanelViewTest extends GuiTest{	

	@Override
	protected Parent getRootNode() {
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("/view/DiskPanel.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parent;
	}

	@Test
	public void testLocationDiskPanelContainsCorrectAmountOfDisks() throws Exception {
		VBox node = find("#disks");
		int disksInView = node.getChildren().size();
		DiskPanelViewObject viewObject = new DiskPanelViewObject();
		int disksInComputer = viewObject.getAllDisks().size();
		assertEquals(disksInComputer, disksInView);
	}
}
