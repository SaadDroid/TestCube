public List<NewsItem> transform(Collection<NewsEntity> newsEntities) {
    List<NewsItem> newsItems = new ArrayList<>();

    NewsItem newsItem;
    for (NewsEntity newsEntity : newsEntities) {
      newsItem = transform(newsEntity);
      if (newsItem != null) {
        newsItems.add(newsItem);
      }
    }

    return newsItems;
  }
