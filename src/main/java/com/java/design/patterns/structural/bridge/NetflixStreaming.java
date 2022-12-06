/**
 * 
 */
package com.java.design.patterns.structural.bridge;

/**
 * @author balajisoundarrajan
 *
 */
public class NetflixStreaming extends Video{

	/**
	 * 
	 */
	public NetflixStreaming(VideoProcessor processor) {
		super(processor);
	}

	@Override
	public void play(String str) {
		videoProcessor.process(str);
	}


}
