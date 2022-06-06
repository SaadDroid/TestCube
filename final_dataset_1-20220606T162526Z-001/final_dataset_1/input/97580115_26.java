@NonNull
    public static SizeSelector minWidth(final int width) {
        return withFilter(new Filter() {
            @Override
            public boolean accepts(@NonNull Size size) {
                return size.getWidth() >= width;
            }
        });
    }
