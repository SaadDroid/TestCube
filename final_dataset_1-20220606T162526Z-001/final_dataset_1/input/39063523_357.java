public void populate(final StockMovementViewModel model, StockCard stockCard) {
        removeTextChangeListeners(model, stockCard.calculateSOHFromLots());

        disableLine();
        hideUnderline();

        txMovementDate.setText(model.getMovementDate());
        etDocumentNo.setText(model.getDocumentNo());
        etReceived.setText(model.getReceived());
        etNegativeAdjustment.setText(model.getNegativeAdjustment());
        etPositiveAdjustment.setText(model.getPositiveAdjustment());
        etIssued.setText(model.getIssued());
        etRequested.setText(model.getRequested());
        txStockExistence.setText(model.getStockExistence());
        txSignature.setText(model.getSignature());
        if (model.getReason() != null) {
            txReason.setText(model.getReason().getDescription());
        } else {
            txReason.setText(StringUtils.EMPTY);
        }

        setItemViewTextColor(model);

        if (model.isDraft()) {
            setInitialDraftStyle(model);
        } else {
            itemView.setBackgroundColor(Color.TRANSPARENT);
        }

        addClickListeners(model, getPreviousMovementDate(stockCard));

        addTextChangedListeners(model, stockCard.calculateSOHFromLots());
    }
