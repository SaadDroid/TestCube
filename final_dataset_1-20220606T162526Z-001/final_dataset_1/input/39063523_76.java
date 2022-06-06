public Observable<List<InventoryViewModel>> loadEmergencyProducts() {
        return Observable.create((Observable.OnSubscribe<List<InventoryViewModel>>) subscriber -> {
            try {
                ImmutableList<InventoryViewModel> inventoryViewModels = from(stockRepository.listEmergencyStockCards()).transform(stockCard -> InventoryViewModel.buildEmergencyModel(stockCard)).toList();
                subscriber.onNext(inventoryViewModels);
                subscriber.onCompleted();
            } catch (LMISException e) {
                new LMISException(e, "ProductPresenter.loadEmergencyProducts").reportToFabric();
                subscriber.onError(e);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
