package edu.csupomona.cs585;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		ShortenUrlService urlService = new ShortenUrlServiceImpl();
		BigStringTable table = new BigStringTableImpl(urlService);

		String key = table.put("CS585-Software-Validation");
		System.out.println(key);
		System.out.println(table.get(key));
	}

}
