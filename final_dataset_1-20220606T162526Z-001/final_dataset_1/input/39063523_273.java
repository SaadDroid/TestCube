protected void updateDeactivateProductNotifyList(Product product) throws LMISException {
        Product existingProduct = productRepository.getByCode(product.getCode());

        if (existingProduct == null) {
            return;
        }

        if (product.isActive() == existingProduct.isActive()) {
            return;
        }
        if (product.isActive()) {
            sharedPreferenceMgr.removeShowUpdateBannerTextWhenReactiveProduct(existingProduct.getPrimaryName());
            return;
        }

        StockCard stockCard = stockRepository.queryStockCardByProductId(existingProduct.getId());
        if (stockCard == null) {
            return;
        }

        if (stockCard.getProduct().isArchived()) {
            return;
        }

        if (stockCard.getStockOnHand() == 0) {
            sharedPreferenceMgr.setIsNeedShowProductsUpdateBanner(true, product.getPrimaryName());
        }
    }
