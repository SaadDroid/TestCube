public Single<List<FileContainer>> asList() {
        this.subject.subscribe(this.itemsObserver);
        this.size = this.files.size();
        this.remains = this.size;
        Observable<FileContainer> observable = Observable
                .fromIterable(this.files)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());

        if (ORDER == DownloadStrategy.FLAG_PARALLEL)
            observable = parallelDownloading(observable);
        else if (ORDER == DownloadStrategy.FLAG_SEQUENTIAL)
            observable = sequentialDownloading(observable);

        return observable.toList();
    }
