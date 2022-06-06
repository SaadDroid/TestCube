public void populateAdditionalDrugsViewModels(List<RnrFormItem> addedDrugInVIAs, Date periodBegin) {
        List<RnrFormItem> additionalProducts = generateRnrItemsForAdditionalProducts(addedDrugInVIAs, periodBegin);
        requisitionFormItemViewModels.addAll(transformDataItemsToViewModels(additionalProducts));
    }
