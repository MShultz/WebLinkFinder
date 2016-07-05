import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class WebTraversal implements Traversal {
	private int maxVisits;
	private URL currentPageURL;
	private ArrayList<String> visitedPages = new ArrayList<String>();
	private ArrayList<String> foundPages = new ArrayList<String>();

	public WebTraversal(String startingLink, int maxVisits) {
		this.maxVisits = maxVisits;
		foundPages.add(startingLink);
	}

	public void traverseWeb() {
		LinkFormatting formatter = new LinkFormatting();
		LinkFinder finder = new LinkFinder();
		do {
			String currentPage = foundPages.get(visitedPages.size());
			setURL(currentPage);
			finder.processPage(createInputStream(currentPage));
			addToHasVisited(currentPage);
//			System.out.println("Visited: " + currentPage);
			addToFoundList(formatter.formatLinks(finder.getLinks(),
					currentPageURL));
		} while (visitedPages.size() < maxVisits && !visitedEqualsFound());
	}

	private void addToFoundList(Iterator<String> foundLinks) {
		if (foundLinks.hasNext()) {
			do {
				String currentFoundLink = foundLinks.next();
				if (!hasFound(currentFoundLink)) {
					foundPages.add(currentFoundLink);
//					System.out.println("Found: " + currentFoundLink);
				}
			} while (foundLinks.hasNext());
		}
	}

	private boolean visitedEqualsFound() {
		boolean equals = true;
		if (visitedPages.size() == foundPages.size()) {
			for (int i = 0; i < visitedPages.size() && equals; ++i) {
				if (!visitedPages.get(i).equals(foundPages.get(i))) {
					equals = false;
				}
			}
		} else {
			equals = false;
		}
		return equals;
	}

	private InputStream createInputStream(String URL) {
		URL currentURL = null;
		InputStream stream = null;
		try {
			currentURL = new URL(URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			stream = currentURL.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream;
	}

	private boolean hasFound(String URL) {
		boolean hasFound = false;
		for (String s : foundPages) {
			if (s.equalsIgnoreCase(URL) || URL.equalsIgnoreCase(s + "/"))
				hasFound = true;
		}
		return hasFound;
	}

	public void setURL(String formatted) {
		try {
			currentPageURL = new URL(formatted);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private void addToHasVisited(String URL) {
		visitedPages.add(URL);
	}

}
