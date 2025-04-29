# Manhwa Recommendation Scraper

A simple Java application that scrapes manhwa recommendations from CBR.com.

## Description

This application uses JSoup to extract top manhwa recommendations from CBR's ranking article. It identifies and outputs the titles of recommended manhwa in reverse order (from highest to lowest ranked).

## Features

- Web scraping using JSoup library
- Extracts manhwa titles from CBR's recommendation list
- Displays results with ranking numbers

## Dependencies

- JSoup: Java HTML parser library for web scraping

## How It Works

The application:
1. Connects to CBR's manhwa recommendation article
2. Extracts the titles using CSS selectors
3. Prints the manhwa titles with their ranking position

## Usage

```java
// To run the web scraping function
RecommendationScrape.webScrapping();
```

## Notes

- This is for educational purposes only
- Web scraping should comply with the website's terms of service and robots.txt
- The structure of the website may change, which could affect the functionality

## Legal Disclaimer

This tool is intended for personal use and educational purposes only. Always respect the website's terms of service and be mindful of the load you place on external websites.
