public void setStockCard(long stockCardId) throws LMISException {
        this.stockCard = stockRepository.queryStockCardById(stockCardId);
        updateMenus();

        view.updateExpiryDateViewGroup();
    }
