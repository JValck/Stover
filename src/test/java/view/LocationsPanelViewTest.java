package view;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class LocationsPanelViewTest extends GuiTest{

	@Override
	protected Parent getRootNode() {
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("/view/LocationsPanel.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parent;
	}
	
	@Test
	public void testViewContainsLocationDiskPanel(){
		Node panel = find("#diskPanel");
		assertNotNull(panel);
	}
	
	@Test
	public void testViewContainsLocationTagPanel(){
		Node panel = find("#locationTagPanel");
		assertNotNull(panel);
	}

}
