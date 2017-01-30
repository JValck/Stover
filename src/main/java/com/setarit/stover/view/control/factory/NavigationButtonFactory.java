package com.setarit.stover.view.control.factory;

import com.setarit.stover.view.control.navigation.NavigationButton;
import com.setarit.stover.view.control.navigation.NavigationButtonImage;
import com.setarit.stover.view.control.navigation.NavigationButtonImageAndText;
import com.setarit.stover.view.control.navigation.NavigationButtonText;
import com.setarit.stover.view.control.navigation.NavigationButtonType;

public class NavigationButtonFactory {
	public static NavigationButton create(NavigationButtonType navigationButtonType){
		NavigationButton result;
		switch (navigationButtonType) {
		case WITHIMAGE:
			result = new NavigationButtonImage();
			break;
			
		case WITHIMAGE_AND_TEXT:
			result = new NavigationButtonImageAndText();
			break;
		default:
			result = new NavigationButtonText();
			break;
		}
		return result;
	}
}
