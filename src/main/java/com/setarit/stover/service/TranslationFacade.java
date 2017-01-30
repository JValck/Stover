package com.setarit.stover.service;

import castle.CastleApi;
import castle.DefaultCastleApi;

public class TranslationFacade {
	private CastleApi translationApi;

	public TranslationFacade() throws Exception {
		this.translationApi = DefaultCastleApi.getInstance();
	}
	
	public String translate(String textToTranslate) throws Exception{
		return translationApi.translate(textToTranslate);
	}
}
