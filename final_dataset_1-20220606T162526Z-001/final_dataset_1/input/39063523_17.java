public void filterViewModels(final String keyword) {
        filterViewModelsByProductFullName(keyword);
        removeHeaders();
        addHeaders(checkIfNonBasicProductsExists());
    }
