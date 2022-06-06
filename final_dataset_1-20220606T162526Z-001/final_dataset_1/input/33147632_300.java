@Override
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
        imageView.setImageBitmap(bitmap);
        progressBar.setVisibility(View.GONE);
    }
