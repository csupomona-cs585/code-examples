package edu.csupomona.cs585.dummy;

public class ImageDownloaderManager {

	private int counter = 0;
	
	public byte[] downloadImage(Image image) {
		// go to download
		counter++;		
		return image.getImageData();
	}
	
	public int getTotalDownloads() {
		return counter;
	}
}
