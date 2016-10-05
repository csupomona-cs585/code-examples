package edu.cpp.inclass.image;

public class ImageDownloadManager {

	private byte[] buffer; // = new byte[1024];

	private int counter;

	public void downloadImage(Image image) {
		byte[] downloadedData = image.getImageData();
		if (downloadedData != null) {
			buffer = new byte[Math.min(1024, downloadedData.length)];
			for(int i = 0; i < Math.min(1024, downloadedData.length); i++) {
				buffer[i] = downloadedData[i];
			}		
			counter++;
		} else {
			throw new RuntimeException("The image was not downloaded correctly.");
		}
	}

	public byte[] getLatestDownloadedImageData() {
		return buffer;
	}

	public int getCounter() {
		return counter;
	}	

}
