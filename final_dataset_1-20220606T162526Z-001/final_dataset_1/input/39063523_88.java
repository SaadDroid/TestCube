@NonNull
    protected Subscriber<List<SelectInventoryViewModel>> getSubscriber() {
        return new Subscriber<List<SelectInventoryViewModel>>() {
            @Override
            public void onCompleted() {
                view.loaded();
            }

            @Override
            public void onError(Throwable e) {
                view.loaded();
                ToastUtil.show(R.string.loading_inventory_list_failed);
            }

            @Override
            public void onNext(List<SelectInventoryViewModel> inventories) {
                view.refreshDate(inventories);
            }
        };
    }
