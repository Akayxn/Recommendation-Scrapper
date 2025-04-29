package org.recommendationscrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class RecommendationScrape {
    static final  String url = "https://www.cbr.com/top-manhwa-recommendations-ranked/";

    public static void webScrapping(){
        try{
            final Document document = Jsoup.connect(url).get();
            Elements manhwaEntries = document.select("div.w-display-card-content.regular.article-block h5.display-card-title ");
            int TotalManhwas = manhwaEntries.size();
            for(Element entry : manhwaEntries){
                String manhwaTitle = entry.select("h5.display-card-title ").text();
                System.out.println(TotalManhwas+ ". " + manhwaTitle);
                TotalManhwas--;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
