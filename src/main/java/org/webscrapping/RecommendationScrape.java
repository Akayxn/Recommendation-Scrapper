package org.webscrapping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class RecommendationScrape {
    static final  String url = "https://www.cbr.com/top-manhwa-recommendations-ranked/";

    public static void webScrapping(){
        try{
            final Document document = Jsoup.connect(url).get();
            System.out.println(document.outerHtml());
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
