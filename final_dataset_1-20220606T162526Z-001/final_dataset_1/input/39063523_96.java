public Observable<Object> doInventory(final String sign) {
        return Observable.create(subscriber -> {
            try {
                List<StockMovementItem> newestEachMovementItems = movementRepository.queryEachStockCardNewestMovement();
                Date now = new Date();
                for (InventoryViewModel viewModel : inventoryViewModelList) {
                    viewModel.setSignature(sign);
                    StockCard stockCard = viewModel.getStockCard();

                    stockCard.setStockOnHand(viewModel.getLotListQuantityTotalAmount());

                    if (stockCard.getStockOnHand() == 0) {
                        stockCard.setExpireDates("");
                    }
                    if (!hasInversionDateBetweenMovementAndDB(newestEachMovementItems, now)) {
                        stockRepository.addStockMovementAndUpdateStockCard(calculateAdjustment(viewModel, stockCard));
                    } else {
                        throw new LMISException(LMISApp.getContext().getString(R.string.msg_invalid_stock_movement));
                    }
                }
                inventoryRepository.clearDraft();
                sharedPreferenceMgr.setLatestPhysicInventoryTime(DateUtil.formatDate(new Date(), DateUtil.DATE_TIME_FORMAT));
                saveInventoryDate();

                subscriber.onNext(null);
                subscriber.onCompleted();
            } catch (LMISException e) {
                subscriber.onError(e);
                new LMISException(e, "doInventory").reportToFabric();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
