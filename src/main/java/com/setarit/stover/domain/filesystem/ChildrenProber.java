package com.setarit.stover.domain.filesystem;

import java.util.ArrayList;
import java.util.List;

public class ChildrenProber {
	
	private java.io.File fileToProbe;

	public ChildrenProber(java.io.File nativeFile) {
		this.fileToProbe = nativeFile;
	}

	/**
	 * Probes the native file object for subfiles
	 * @return A list of files within the native file object
	 */
	public List<File> probeFiles() {
		java.io.File[] nativeFiles = fileToProbe.listFiles(java.io.File::isFile);
		List<File> files;
		if(nativeFiles != null){
			files = new ArrayList<>(nativeFiles.length);
			for(java.io.File file: nativeFiles){
				files.add(new com.setarit.stover.domain.filesystem.File(file.getName(), file));
			}
		}else{
			files = new ArrayList<>(0);
		}
		return files;
	}

	/**
	 * Probes the native file object for subfolders
	 * @return A list of folders within the native file object
	 */
	public List<File> probeFolders() {
		java.io.File[] directories = fileToProbe.listFiles(java.io.File::isDirectory);
		List<File> folders;
		if(directories != null){
			folders = new ArrayList<>(directories.length);
			for(java.io.File folder: directories){
				folders.add(new com.setarit.stover.domain.filesystem.File(folder.getName(), folder));
			}
		}else{
			folders = new ArrayList<>(0);
		}
		return folders;
	}
}
