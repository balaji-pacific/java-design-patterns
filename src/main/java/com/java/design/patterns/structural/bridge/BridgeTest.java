/**
 * 
 */
package com.java.design.patterns.structural.bridge;

/**
 * @author balajisoundarrajan
 *
 */
public class BridgeTest {

	/**
	 * 
	 */
	public BridgeTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Video youtubeVideo = new YoutubeStreaming(new EightKVideo());
		youtubeVideo.play("AyyappanSongs.mp4");
		
		
		Video netFlixVideo = new NetflixStreaming(new FourKVideo());
		netFlixVideo.play("AyyappanSongs.mp3");

	}

}
