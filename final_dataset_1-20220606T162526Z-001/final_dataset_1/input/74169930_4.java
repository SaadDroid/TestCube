public Observable<List<Article>> getPopularArticles(@Nullable final Integer amount,
                                                        @Nullable final Integer page) {
        final Single<PopularArticlesResource>
                remotePopularArticlesObservable = getPopularArticlesFromRemoteAPI(amount, page);
        final Observable<PopularArticlesResource>
                localDBPopularArticlesObservable = getPopularArticlesFromLocalDB(amount, page);
        final Observable<PopularArticlesResource> popularArticlesObservable =
                getPopularArticlesFromCombinedSources(remotePopularArticlesObservable,
                        localDBPopularArticlesObservable);
        return popularArticlesObservable
                .distinct() // Avoid emitting twice the same list of items
                .map(ArticlesDataMapper::convertPopularArticlesListToDomain); // Map data to domain
    }
