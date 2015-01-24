package edu.csupomona.cs585;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;
import edu.csupomona.cs585.shorturl.UrlResponse;

public class BigStringTableImpl implements BigStringTable {

	private ShortenUrlService urlService;
	public static int[] lines = new int[6];

	public BigStringTableImpl(ShortenUrlService urlService) {
		lines[0] = 1;
		this.urlService = urlService;
	}

	public String put(String value) {
		lines[1] = 1;
		UrlResponse response = urlService.getShortUrl(value);
		lines[2] = 1;
		return response.getId().substring(7);
	}

	public String get(String key) {
		lines[3] = 1;
		System.out.println("key: " + key);
		lines[4] = 1;
		UrlResponse response = urlService.expandShortUrl("http://"+key);
		lines[5] = 1;
		return response.getLongUrl().substring(
				7, response.getLongUrl().length() - 1);
	}

}
