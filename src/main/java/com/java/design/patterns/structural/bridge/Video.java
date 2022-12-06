package com.java.design.patterns.structural.bridge;

public abstract class Video{

	protected VideoProcessor videoProcessor;
	
	public Video(VideoProcessor videoProcessor) {
		this.videoProcessor = videoProcessor;
	}

	public abstract void play(String fileName);
}
