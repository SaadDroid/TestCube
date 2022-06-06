public void showLastSyncTime() {
        hideSyncProgressBarAndShowIcon();

        rnrLastSyncTime = sharedPreferenceMgr.getRnrLastSyncTime();
        stockLastSyncTime = sharedPreferenceMgr.getStockLastSyncTime();

        if (isNeverSyncSuccessful()) {
            if (hasSyncFailed()) {
                txSyncTime.setText(LMISApp.getContext().getString(R.string.initial_sync_failed));
            }
            return;
        }

        txSyncTime.setText(updateSyncTimeViewUI());

        if (sharedPreferenceMgr.isStockCardLastYearSyncError()) {
            setSyncStockCardLastYearError();
        }
    }
