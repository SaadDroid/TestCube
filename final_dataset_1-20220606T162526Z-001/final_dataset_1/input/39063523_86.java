public Observable<Void> deleteRegimeItem(final RegimenItem item) {
        return Observable.create((Observable.OnSubscribe<Void>) subscriber -> {
            try {
                rnRForm.getRegimenItemListWrapper().remove(item);
                regimenItemRepository.deleteRegimeItem(item);
            } catch (LMISException e) {
                new LMISException(e, "MMIARequisitionPresenter.deleteRegimeItem").reportToFabric();
                subscriber.onError(e);
            }
            subscriber.onCompleted();
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
