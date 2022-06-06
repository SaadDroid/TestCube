@NonNull
    @SuppressWarnings("WeakerAccess")
    public static SizeSelector maxArea(final int area) {
        return withFilter(new Filter() {
            @Override
            public boolean accepts(@NonNull Size size) {
                return size.getHeight() * size.getWidth() <= area;
            }
        });
    }
