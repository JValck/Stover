package com.setarit.stover.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StoverView {

	private Stage primaryStage;
	private BorderPane rootLayout;

	public StoverView(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
	}

	public void loadStoverRootLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(StoverView.class.getResource("/view/StoverView.fxml"));
		this.rootLayout = (BorderPane) loader.load();            
	}

	public void initStageProperties(){
		Scene scene = setStoverRootLayoutAsCurrentScene();
		addStylesheetsToScene(scene);
		primaryStage.getIcons().add(new Image(StoverView.class.getResourceAsStream("/view/images/stover.png")));		
		primaryStage.setTitle("Stover");		
	}

	private void addStylesheetsToScene(Scene scene) {
		scene.getStylesheets().add(StoverView.class.getResource("/view/css/stover.css").toString());
	}

	private Scene setStoverRootLayoutAsCurrentScene() {
		Scene scene = new Scene(rootLayout);		
		primaryStage.setScene(scene);
		return scene;
	}

	public void show() {
		primaryStage.show();
	}



}
