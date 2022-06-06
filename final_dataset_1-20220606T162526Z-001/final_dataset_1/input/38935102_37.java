@Nullable
  public synchronized Image getImage(final double scale) {
    if (Double.compare(this.currentScaleFactor, scale) != 0) {
      this.scaledCachedImage = null;
    }

    if (this.scaledCachedImage == null) {
      this.scaledCachedImage = Utils.scaleImage(this.baseImage, this.baseScaleX, this.baseScaleY, scale);
      this.currentScaleFactor = scale;
    }
    return this.scaledCachedImage;
  }
