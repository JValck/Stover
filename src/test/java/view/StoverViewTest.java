package view;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.loadui.testfx.GuiTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class StoverViewTest extends GuiTest{
	@Override
	protected Parent getRootNode() {
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("/view/StoverView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parent;
	}
	
	@Test
	public void testViewContainsBluebar() {
		Node bar = find("#bluebar");
		assertNotNull(bar);
	}
	
	@Test 
	public void testViewContainsLocationsPanel(){
		Node panel = find("#locationsPanel");
		assertNotNull(panel);
	}
}
