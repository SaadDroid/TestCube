public Observable<List<NonBasicProductsViewModel>> getAllNonBasicProductsViewModels(final List<String> selectedProducts) {
        return Observable.create((Observable.OnSubscribe<List<NonBasicProductsViewModel>>) subscriber -> {
            try {
                List<Product> products = productRepository.listNonBasicProducts();
                for (Product product : products) {
                    if (selectedProducts.contains(product.getCode())) {
                        continue;
                    }
                    NonBasicProductsViewModel currentModel = new NonBasicProductsViewModel(product);
                    models.add(currentModel);
                }
                subscriber.onNext(models);
                subscriber.onCompleted();
            } catch (Exception e) {
                subscriber.onError(e);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
