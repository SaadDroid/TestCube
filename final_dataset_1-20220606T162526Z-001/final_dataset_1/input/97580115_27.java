@SuppressWarnings("WeakerAccess")
    @NonNull
    public static SizeSelector maxHeight(final int height) {
        return withFilter(new Filter() {
            @Override
            public boolean accepts(@NonNull Size size) {
                return size.getHeight() <= height;
            }
        });
    }
