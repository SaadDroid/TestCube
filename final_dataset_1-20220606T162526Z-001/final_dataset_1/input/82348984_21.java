@Override
    public void serialize(@NonNull Bundle state, @NonNull String key, @NonNull SizeF fieldValue) {
        state.putSizeF(key, fieldValue);
    }
