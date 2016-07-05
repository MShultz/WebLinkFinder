import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;




public class Main {

	public static void main(String[] args) {
		WebTraversal traverse = new WebTraversal("http://www.neumont.edu", 25);
		traverse.traverseWeb();
		
		
		
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
