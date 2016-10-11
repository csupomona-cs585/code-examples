package edu.csupomona.cs585;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.UrlResponse;

public class BigStringTableImpl implements BigStringTable {

	private ShortenUrlService urlService;

	public BigStringTableImpl(ShortenUrlService urlService) {
		this.urlService = urlService;
	}

	public String put(String value) {
		UrlResponse response = urlService.getShortUrl(value);
		return response.getId().substring(8);
	}

	public String get(String key) {
		String para = "http://" + key;
		System.out.println(para);
		UrlResponse response = urlService.expandShortUrl(para);
		return response.getLongUrl().substring(
				7, response.getLongUrl().length() - 1);
	}

}
