protected Date getPreviousMovementDate(StockCard stockCard) {
        List<StockMovementItem> stockMovements = stockCard.getStockMovementItemsWrapper();
        if (stockMovements != null) {
            if (!stockMovements.isEmpty()) {
                Collections.sort(stockMovements, (item1, item2) -> item1.getMovementDate().compareTo(item2.getMovementDate()));
                return stockMovements.get(stockMovements.size() - 1).getMovementDate();
            }
        }
        return null;
    }
