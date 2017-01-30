package com.setarit.stover.view.object;

import java.util.List;

import com.setarit.stover.application.ApplicationContext;
import com.setarit.stover.domain.filesystem.File;
import com.setarit.stover.service.StoverFacade;

public class DiskPanelViewObject implements ViewObject {
	
	private StoverFacade facade;

	public DiskPanelViewObject() throws Exception{
		facade = ApplicationContext.getInstance(null).getStoverFacade();
	}

	public List<File> getAllDisks() {
		return facade.getAllDisks();
	}

}
