package org.example;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;

public class CrawlerWorker {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        System.out.println(doc.title());
        System.out.println(doc.body());

        Elements links = doc.select("a[href]");
        System.out.println("Links: " + links.size());
        for (Element link : links) {
            System.out.println(link.attr("abs:href"));
        }
    }
}