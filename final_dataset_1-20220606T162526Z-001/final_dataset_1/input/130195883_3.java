public Observable<TotalResEntity.Collect> getCollect(int page) {
        return mWanApiService.getCollect(page)
                .map(new WanHttpResultFunc<TotalResEntity.Collect>())
                .compose(RxSchedulers.<TotalResEntity.Collect>io_main());
    }
