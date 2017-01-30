package com.setarit.stover.application;

import com.setarit.stover.service.StoverFacade;
import com.setarit.stover.service.StoverFacadeImpl;
import com.setarit.stover.view.StoverView;

public class ApplicationContext {
	private static ApplicationContext instance;
	
	private StoverFacade stoverFacade;
	
	private ApplicationContext(StoverView stoverView) throws Exception{
		stoverFacade = new StoverFacadeImpl(stoverView);		
	}

	public static ApplicationContext getInstance(StoverView stoverView) throws Exception {
		if(ApplicationContext.instance == null){
			ApplicationContext.instance = new ApplicationContext(stoverView);
		}
		return ApplicationContext.instance;
	}

	public StoverFacade getStoverFacade() {
		return stoverFacade;
	}	
}
