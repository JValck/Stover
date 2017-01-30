package com.setarit.stover.controller;

import com.setarit.stover.application.ApplicationContext;
import com.setarit.stover.view.StoverView;
import javafx.stage.Stage;

/**
 * Creates and shows the Stover window
 * @author Setarit
 *
 */
public class BootController {	
	private ApplicationContext context;

	public BootController(Stage primaryStage) throws Exception{
		StoverView stoverView = initializeStoverView(primaryStage);
		initializeStoverView(primaryStage);
		context = ApplicationContext.getInstance(stoverView);		
	}

	private StoverView initializeStoverView(Stage primaryStage) throws Exception {
		StoverView stoverView = new StoverView(primaryStage);
		stoverView.loadStoverRootLayout();
		stoverView.initStageProperties();
		return stoverView;
	}
	
	public void run() {
		context.getStoverFacade().showMainWindow();
	}
}
