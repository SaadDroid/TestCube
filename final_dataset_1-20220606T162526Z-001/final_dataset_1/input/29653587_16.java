@Override
    public void onPerformSync(Account account, Bundle extras, String authority,
                              ContentProviderClient provider, SyncResult syncResult) {
        createSyncDelegate().performSync(new SyncDelegate.Job(extras));
    }
