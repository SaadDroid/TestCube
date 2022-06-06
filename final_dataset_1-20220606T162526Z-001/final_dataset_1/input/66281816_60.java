public void save(@NonNull final String id, @NonNull final TiPresenter presenter) {
        if (id == null) {
            throw new IllegalStateException("id must be non-null");
        }
        if (presenter == null) {
            throw new IllegalStateException("presenter must be non-null");
        }

        // overriding a presenter is not allowed, use remove before saving a presenter
        if (mStore.get(id) != null) {
            throw new IllegalStateException("There is already a presenter saved with id "
                    + id + " " + presenter);
        }

        // saving a presenter twice with a different id is not supported
        for (final Map.Entry<String, TiPresenter> entry : mStore.entrySet()) {
            if (entry.getValue().equals(presenter)) {
                throw new IllegalStateException("Presenter is already saved with different id '"
                        + entry.getKey() + "' " + presenter);
            }
        }

        TiLog.d(TAG, "save " + id + " " + presenter);
        mStore.put(id, presenter);
    }
