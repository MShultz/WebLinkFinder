import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;


public class LinkFormattingTest {

	
	@Test
	public void test() {
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
		
		
		
	}

}
