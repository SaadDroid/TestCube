@Override
    public void serialize(@NonNull Bundle state, @NonNull String key, @NonNull Character fieldValue) {
        state.putChar(key, fieldValue);
    }
