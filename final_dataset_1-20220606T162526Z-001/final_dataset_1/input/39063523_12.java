void initOrArchiveBackStockCards() {
        defaultViewModelList.clear();
        defaultViewModelList.addAll(inventoryViewModelList);
        for (InventoryViewModel inventoryViewModel : defaultViewModelList) {
            if (inventoryViewModel.isChecked()) {
                initOrArchiveBackStockCard(inventoryViewModel);
            }
        }
    }
