package edu.csupomona.cs585;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;
import edu.csupomona.cs585.shorturl.UrlResponse;


public class BigStringTableImplTest {

	@Test
	public void testPutAndGet() {
		ShortenUrlService url = mock(ShortenUrlService.class);

		UrlResponse urlResponse = new UrlResponse();
		urlResponse.setId("https://google.com/dfher");
		urlResponse.setLongUrl("http://test_string_abc/");

		when(url.getShortUrl("test_string_abc")).thenReturn(urlResponse);
		when(url.expandShortUrl("http://google.com/dfher")).thenReturn(urlResponse);

		BigStringTable table = new BigStringTableImpl(url);

		String key = table.put("test_string_abc");
		System.out.println("the key is: " + key);

		Assert.assertNotNull(key);
		Assert.assertEquals("google.com/dfher", key);

		String value = table.get(key);
		Assert.assertEquals("test_string_abc", value);
	}

}
