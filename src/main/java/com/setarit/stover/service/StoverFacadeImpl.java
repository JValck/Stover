package com.setarit.stover.service;

import java.util.List;

import com.setarit.stover.domain.filesystem.Computer;
import com.setarit.stover.domain.filesystem.File;
import com.setarit.stover.view.StoverView;

public class StoverFacadeImpl implements StoverFacade {
	private StoverView mainView;
	private TranslationFacade translationFacade;
	private Computer computer;
	
	public StoverFacadeImpl(StoverView mainView) throws Exception {
		this.mainView = mainView;
		this.translationFacade = new TranslationFacade();
		this.computer = new Computer();
	}

	public String translate(String textToTranslate) throws Exception {
		return translationFacade.translate(textToTranslate);
	}

	public void showMainWindow() {
		mainView.show();
	}

	@Override
	public List<File> getAllDisks() {		
		return computer.getDisks();
	}

	@Override
	public StoverView getMainView() {
		return mainView;
	}

	
}
