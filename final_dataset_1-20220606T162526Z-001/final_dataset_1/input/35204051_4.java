public void loadAllAnnouncement(int pageNumber) {
        checkViewAttached();
        compositeDisposable.add(mDataManager.getAllAnnouncement(
                getAnnouncementQueryOptions(pageNumber))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Announcements>() {

                    @Override
                    public void onNext(Announcements announcements) {
                        if (announcements.getAnnouncement() != null) {
                            getMvpView().showAllAnnouncement(announcements);
                        } else {
                            getMvpView().showSnackBar(R.string.no_more_announcement_available);
                            getMvpView().removeLoadMoreProgressBar();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        getMvpView().showProgressbar(false);
                        getMvpView().showSnackBar(R.string.failed_to_fetch_announcement);
                    }

                    @Override
                    public void onComplete() {
                        getMvpView().showProgressbar(false);
                    }
                }));
    }
