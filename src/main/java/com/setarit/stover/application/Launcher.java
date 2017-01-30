package com.setarit.stover.application;

import com.setarit.stover.controller.BootController;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

	@Override
	public void start(Stage primaryStage) {
		try{
			BootController bootController = new BootController(primaryStage);
			bootController.run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
