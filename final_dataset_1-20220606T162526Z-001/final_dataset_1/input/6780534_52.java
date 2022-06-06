@Override public Observable<List<NewsItem>> buildUseCaseObservable(boolean forceUpdate) {
    Observable<List<NewsItem>> coursesObs = coursesRepository.courses(forceUpdate)
        .flatMap(domainCourses -> Observable.defer(() -> Observable.from(domainCourses)
            .flatMap(domainCourse -> mRepository.newsForRange(domainCourse.getCourseId(),
                forceUpdate))));

    return Observable.zip(mRepository.newsList(forceUpdate), coursesObs, (news, courses) -> {
      ArrayList<NewsItem> newsItems = new ArrayList<>(news.size() + courses.size());
      newsItems.addAll(news);
      newsItems.addAll(courses);

      return newsItems;
    })
        .flatMap(newsItems -> Observable.from(newsItems)
            .distinct()
            .toList());
  }
