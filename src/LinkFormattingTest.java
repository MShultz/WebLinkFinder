import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;


public class LinkFormattingTest {

	
	@Test
	public void test() {
		/*
		LinkFormatting lf = new LinkFormatting();
		assertTrue(lf.hasHost("https://www.google.com"));
		assertTrue(lf.hasHost("www.google.com"));
		assertFalse(lf.hasHost("/academics"));
		
		assertTrue(lf.hasProtocol("http://www.google.com"));
		assertTrue(lf.hasProtocol("https://mail.student.neumont.edu"));
		assertFalse(lf.hasProtocol("www.google.com"));
		assertFalse(lf.hasProtocol("www.neumont.edu"));
		
		
		assertTrue(lf.hasForwardslash("/academics"));
		assertTrue(lf.hasForwardslash("/degree/index.html"));
		assertFalse(lf.hasForwardslash("www.google.com"));
		assertFalse(lf.hasForwardslash("www.neumont.edu"));
			
	*/
		
		/*Extra test for FormatLinks method!
		 
		LinkFormatting lf = new LinkFormatting();
		ArrayList<String> test = new ArrayList<String>();
		Iterator<String> formatted = null;
		test.add("www.google.com");
		test.add("/academics");
		test.add("/degrees.html");
		test.add("http://www.IDK.com");
		test.add("http://www.wee.com/brah");
		try {
			URL testURL = new URL("https://www.reddit.com");
			formatted = lf.formatLinks(test.iterator(), testURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		do{
			System.out.println("Link: " + formatted.next());
		}while(formatted.hasNext());
		*/
	}

}
