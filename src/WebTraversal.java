import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class WebTraversal implements Traversal {
	private int maxVisits;
	private ArrayList<String> visitedPages = new ArrayList<String>();
	private ArrayList<String> foundPages = new ArrayList<String>();

	public WebTraversal(String startingLink, int maxVisits) {
		this.maxVisits = maxVisits;
		foundPages.add(startingLink);
	}

	public void traverseWeb() {

	}

	private void addToLists(Iterator<String> foundLinks) {

	}

	private InputStream CreateInputStream(String URL) {
		return null;
	}

	private boolean hasVisited() {
		return false;
	}

	private boolean hasFound() {
		return false;
	}


	public void setURL(String formatted) {
		
	}

}
