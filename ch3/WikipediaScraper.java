package ntou.cs.java2025;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class WikipediaScraper {

    public static void main(String[] args) {
        try {
            String bookName = "The_Mythical_Man-Month";
            String url = "https://en.wikipedia.org/wiki/" + bookName;

            Document doc = Jsoup.connect(url).get();

            // Extract the book title
            Element titleElem = doc.select("#firstHeading").first();
            String title = titleElem != null ? titleElem.text() : "N/A";
            System.out.println("\nTitle: " + title);

            // Extract the author
            Element authorElem = doc.select(".infobox-data a").first();
            String author = authorElem != null ? authorElem.text() : "N/A";
            System.out.println("Author: " + author);

            // Extract the publisher
            Element infoBoxElem = doc.select(".infobox.vcard").first();
            Element publisherElem = infoBoxElem != null ? infoBoxElem.select("th:contains(Publisher)").first() : null;
            String publisher = (publisherElem != null && publisherElem.nextElementSibling() != null) ? 
                               publisherElem.nextElementSibling().text() : "N/A";
            System.out.println("Publisher: " + publisher);

            // Extract the publication date
            Element pubDateElem = infoBoxElem != null ? infoBoxElem.select("th:contains(Published), th:contains(Publication date)").first() : null;
            String publicationDate = (pubDateElem != null && pubDateElem.nextElementSibling() != null) ? 
                                     pubDateElem.nextElementSibling().text() : "N/A";
            System.out.println("Publication Date: " + publicationDate);

            // Extract the plot summary
            Element plotElem = doc.select("p").first(); // 通常第一個 `<p>` 標籤是簡介
            String plotSummary = plotElem != null ? plotElem.text() : "N/A";
            System.out.println("Plot Summary: " + plotSummary);

        } catch (IOException | NullPointerException exception) {
            System.out.println("\nSomething cannot be fetched.");
        }
    }
}
/*
編譯：javac -d . -cp jsoup-1.19.1.jar WikipediaScraper.java
執行：java -cp .:jsoup-1.19.1.jar ntou.cs.java2025.WikipediaScraper 
 */