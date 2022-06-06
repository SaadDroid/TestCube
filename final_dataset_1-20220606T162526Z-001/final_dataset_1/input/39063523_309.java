private void loadData() {
        if (isFromSelectEmergencyPage()) {
            presenter.loadEmergencyData(emergencyStockCards, new Date(LMISApp.getInstance().getCurrentTimeMillis()));
        } else {
            presenter.loadData(formId, periodEndDate);
        }
    }
