package com.setarit.stover.service;

import java.util.List;

import com.setarit.stover.domain.filesystem.File;

public interface StoverFacade {

	String translate(String string) throws Exception;
	void showMainWindow();
	List<File> getAllDisks();

}
