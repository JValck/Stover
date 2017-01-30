package com.setarit.stover.domain.filesystem;

import java.util.List;

public class File {
	private java.io.File file;
	private List<com.setarit.stover.domain.filesystem.File> folders;
	private List<com.setarit.stover.domain.filesystem.File> files;
	private String name;

	public File(String name, java.io.File file) {
		this.name = name;
		this.file = file;
	}	

	public String getName() {
		return name;
	}

	public java.io.File getNativeFile() {
		return file;
	}	

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if(obj instanceof File){
			File other = (File) obj;
			equals = this.getName().equals(other.getName()) && this.getNativeFile().equals(other.getNativeFile());
		}
		return equals;
	}

	public List<com.setarit.stover.domain.filesystem.File> getFolders() {
		lazyLoadFolders();
		return folders;
	}

	public int getNumerOfFolders() {
		lazyLoadFolders();
		return folders.size();
	}

	public List<com.setarit.stover.domain.filesystem.File> getFiles() {
		lazyLoadFiles();
		return files;
	}

	private void lazyLoadFolders(){
		if(folders == null){
			ChildrenProber prober = new ChildrenProber(file);
			this.folders = prober.probeFolders();
		}
	}

	private void lazyLoadFiles(){
		if(files == null){
			ChildrenProber prober = new ChildrenProber(file);
			this.files = prober.probeFiles();
		}
	}

	public int getNumberOfFiles() {
		lazyLoadFiles();
		return files.size();
	}
	
	
}