package com.setarit.stover.view.control.navigation;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;

public class NavigationButtonImageAndText extends NavigationButton {

	public NavigationButtonImageAndText() {
		super();
		setImageLocation();
	}

	public NavigationButtonImageAndText(String text, Node graphic) {
		super(text, graphic);
		setImageLocation();
	}

	public NavigationButtonImageAndText(String text) {
		super(text);
		setImageLocation();
	}

	private void setImageLocation() {
		super.setContentDisplay(ContentDisplay.LEFT);		
	}

}
