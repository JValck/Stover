package com.setarit.stover.service;

import java.util.List;

import com.setarit.stover.domain.filesystem.File;
import com.setarit.stover.view.StoverView;

public interface StoverFacade {

	String translate(String string) throws Exception;
	void showMainWindow();
	List<File> getAllDisks();
	StoverView getMainView();

}
