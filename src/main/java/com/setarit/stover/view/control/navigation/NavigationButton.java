package com.setarit.stover.view.control.navigation;

import javafx.scene.Node;
import javafx.scene.control.Button;

/**
 * Abstract parent class for the navigation buttons
 * @author Setarit
 *
 */
public abstract class NavigationButton extends Button {

	public NavigationButton() {
		super();
		setStoverStyle();
	}

	public NavigationButton(String text, Node graphic) {
		super(text, graphic);
		setStoverStyle();
	}

	public NavigationButton(String text) {
		super(text);
		setStoverStyle();
	}
	
	private void setStoverStyle(){
		super.getStyleClass().add("navigationButton");
	}

}