@Override
    public int compareTo(@NonNull Size another) {
        return mWidth * mHeight - another.mWidth * another.mHeight;
    }
