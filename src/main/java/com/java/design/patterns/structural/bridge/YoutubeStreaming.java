/**
 * 
 */
package com.java.design.patterns.structural.bridge;

/**
 * @author balajisoundarrajan
 *
 */
public class YoutubeStreaming extends Video {


	public YoutubeStreaming(VideoProcessor videoProcessor) {
		super(videoProcessor);
	}

	@Override
	public void play(String str) {
		videoProcessor.process(str);
	}

}
