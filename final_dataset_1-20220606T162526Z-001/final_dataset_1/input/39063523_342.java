public void populate(final StockMovementViewModel model) {
        txMovementDate.setText(model.getMovementDate());
        etDocumentNo.setText(model.getDocumentNo());
        etReceived.setText(model.getReceived());
        etNegativeAdjustment.setText(model.getNegativeAdjustment());
        etPositiveAdjustment.setText(model.getPositiveAdjustment());
        etIssued.setText(model.getIssued());
        etRequested.setText(model.getRequested());
        txStockExistence.setText(model.getStockExistence());
        txReason.setText(model.getReason().getDescription());
        txSignature.setText(model.getSignature());

        setItemViewTextColor(model);
    }
