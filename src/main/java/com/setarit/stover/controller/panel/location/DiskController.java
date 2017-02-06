package com.setarit.stover.controller.panel.location;

import com.setarit.stover.domain.filesystem.File;
import com.setarit.stover.view.object.DiskPanelViewObject;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class DiskController {
	@FXML private VBox diskPanel;
	@FXML private VBox disks;
	private DiskPanelViewObject viewObject;
	
	public DiskController() throws Exception{
		viewObject = new DiskPanelViewObject();
	}
	
	@FXML
    public void initialize() {
		for(File disk:viewObject.getAllDisks()){
			Button button = createDiskButton(disk);
			disks.getChildren().add(button);
		}
	}

	private Button createDiskButton(File disk) {
		ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/view/images/disk.png")));
		imageView.setFitWidth(30);
		imageView.setPreserveRatio(true);
		Button button = new Button(disk.getName(), imageView);
		button.setMaxWidth(Double.MAX_VALUE);
		button.setAlignment(Pos.CENTER_LEFT);
		return button;
	}
	
}
