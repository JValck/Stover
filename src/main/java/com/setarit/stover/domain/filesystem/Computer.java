package com.setarit.stover.domain.filesystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

public class Computer {
	private List<com.setarit.stover.domain.filesystem.File> disks;
	private FileSystemView fileSystemView;
	private String name;

	public Computer(String name) {
		this.name = name;
		fileSystemView = FileSystemView.getFileSystemView();
		probeForDisks();		
	}

	public Computer() {
		fileSystemView = FileSystemView.getFileSystemView();
		probeForDisks();	
	}

	private void probeForDisks() {		
		File[] roots = File.listRoots();
		disks = new ArrayList<com.setarit.stover.domain.filesystem.File>(roots.length);
		for(File root: roots){
			disks.add(new com.setarit.stover.domain.filesystem.File(fileSystemView.getSystemDisplayName(root), root));
		}
	}

	public int getNumberOfDisks() {		
		return disks.size();
	}

	public String getName() {
		return name;
	}

	public List<com.setarit.stover.domain.filesystem.File> getDisks() {
		return disks;
	}
	
	
	
}
