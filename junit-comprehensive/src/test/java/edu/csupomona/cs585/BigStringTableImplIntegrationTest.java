package edu.csupomona.cs585;

import org.junit.Assert;
import org.junit.Test;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;

public class BigStringTableImplIntegrationTest {

	@Test
	public void testPutAndGet() {
		ShortenUrlService url = new ShortenUrlServiceImpl();
		BigStringTable table = new BigStringTableImpl(url);

		String key = table.put("test_string_abc");
		System.out.println("the key is: " + key);

		Assert.assertNotNull(key);

		String value = table.get(key);
		Assert.assertEquals("test_string_abc", value);
	}
}
