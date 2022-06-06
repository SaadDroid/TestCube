static Bitmap transformResult(Request data, Bitmap result, int exifOrientation) {
    int inWidth = result.getWidth();
    int inHeight = result.getHeight();
    boolean onlyScaleDown = data.onlyScaleDown;

    int drawX = 0;
    int drawY = 0;
    int drawWidth = inWidth;
    int drawHeight = inHeight;

    Matrix matrix = new Matrix();

    if (data.needsMatrixTransform() || exifOrientation != 0) {
      int targetWidth = data.targetWidth;
      int targetHeight = data.targetHeight;

      float targetRotation = data.rotationDegrees;
      if (targetRotation != 0) {
        double cosR = Math.cos(Math.toRadians(targetRotation));
        double sinR = Math.sin(Math.toRadians(targetRotation));
        if (data.hasRotationPivot) {
          matrix.setRotate(targetRotation, data.rotationPivotX, data.rotationPivotY);
          // Recalculate dimensions after rotation around pivot point
          double x1T = data.rotationPivotX * (1.0 - cosR) + (data.rotationPivotY * sinR);
          double y1T = data.rotationPivotY * (1.0 - cosR) - (data.rotationPivotX * sinR);
          double x2T = x1T + (data.targetWidth * cosR);
          double y2T = y1T + (data.targetWidth * sinR);
          double x3T = x1T + (data.targetWidth * cosR) - (data.targetHeight * sinR);
          double y3T = y1T + (data.targetWidth * sinR) + (data.targetHeight * cosR);
          double x4T = x1T - (data.targetHeight * sinR);
          double y4T = y1T + (data.targetHeight * cosR);

          double maxX = Math.max(x4T, Math.max(x3T, Math.max(x1T, x2T)));
          double minX = Math.min(x4T, Math.min(x3T, Math.min(x1T, x2T)));
          double maxY = Math.max(y4T, Math.max(y3T, Math.max(y1T, y2T)));
          double minY = Math.min(y4T, Math.min(y3T, Math.min(y1T, y2T)));
          targetWidth = (int) Math.floor(maxX - minX);
          targetHeight  = (int) Math.floor(maxY - minY);
        } else {
          matrix.setRotate(targetRotation);
          // Recalculate dimensions after rotation (around origin)
          double x1T = 0.0;
          double y1T = 0.0;
          double x2T = (data.targetWidth * cosR);
          double y2T = (data.targetWidth * sinR);
          double x3T = (data.targetWidth * cosR) - (data.targetHeight * sinR);
          double y3T = (data.targetWidth * sinR) + (data.targetHeight * cosR);
          double x4T = -(data.targetHeight * sinR);
          double y4T = (data.targetHeight * cosR);

          double maxX = Math.max(x4T, Math.max(x3T, Math.max(x1T, x2T)));
          double minX = Math.min(x4T, Math.min(x3T, Math.min(x1T, x2T)));
          double maxY = Math.max(y4T, Math.max(y3T, Math.max(y1T, y2T)));
          double minY = Math.min(y4T, Math.min(y3T, Math.min(y1T, y2T)));
          targetWidth = (int) Math.floor(maxX - minX);
          targetHeight  = (int) Math.floor(maxY - minY);
        }
      }

      // EXIf interpretation should be done before cropping in case the dimensions need to
      // be recalculated
      if (exifOrientation != 0) {
        int exifRotation = getExifRotation(exifOrientation);
        int exifTranslation = getExifTranslation(exifOrientation);
        if (exifRotation != 0) {
          matrix.preRotate(exifRotation);
          if (exifRotation == 90 || exifRotation == 270) {
             // Recalculate dimensions after exif rotation
             int tmpHeight = targetHeight;
             targetHeight = targetWidth;
             targetWidth = tmpHeight;
          }
        }
        if (exifTranslation != 1) {
          matrix.postScale(exifTranslation, 1);
        }
      }

      if (data.centerCrop) {
        // Keep aspect ratio if one dimension is set to 0
        float widthRatio =
            targetWidth != 0 ? targetWidth / (float) inWidth : targetHeight / (float) inHeight;
        float heightRatio =
            targetHeight != 0 ? targetHeight / (float) inHeight : targetWidth / (float) inWidth;
        float scaleX, scaleY;
        if (widthRatio > heightRatio) {
          int newSize = (int) Math.ceil(inHeight * (heightRatio / widthRatio));
          if ((data.centerCropGravity & Gravity.TOP) == Gravity.TOP) {
            drawY = 0;
          } else if ((data.centerCropGravity & Gravity.BOTTOM) == Gravity.BOTTOM) {
            drawY = inHeight - newSize;
          } else {
            drawY = (inHeight - newSize) / 2;
          }
          drawHeight = newSize;
          scaleX = widthRatio;
          scaleY = targetHeight / (float) drawHeight;
        } else if (widthRatio < heightRatio) {
          int newSize = (int) Math.ceil(inWidth * (widthRatio / heightRatio));
          if ((data.centerCropGravity & Gravity.LEFT) == Gravity.LEFT) {
            drawX = 0;
          } else if ((data.centerCropGravity & Gravity.RIGHT) == Gravity.RIGHT) {
            drawX = inWidth - newSize;
          } else {
            drawX = (inWidth - newSize) / 2;
          }
          drawWidth = newSize;
          scaleX = targetWidth / (float) drawWidth;
          scaleY = heightRatio;
        } else {
          drawX = 0;
          drawWidth = inWidth;
          scaleX = scaleY = heightRatio;
        }
        if (shouldResize(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
          matrix.preScale(scaleX, scaleY);
        }
      } else if (data.centerInside) {
        // Keep aspect ratio if one dimension is set to 0
        float widthRatio =
            targetWidth != 0 ? targetWidth / (float) inWidth : targetHeight / (float) inHeight;
        float heightRatio =
            targetHeight != 0 ? targetHeight / (float) inHeight : targetWidth / (float) inWidth;
        float scale = widthRatio < heightRatio ? widthRatio : heightRatio;
        if (shouldResize(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
          matrix.preScale(scale, scale);
        }
      } else if ((targetWidth != 0 || targetHeight != 0) //
          && (targetWidth != inWidth || targetHeight != inHeight)) {
        // If an explicit target size has been specified and they do not match the results bounds,
        // pre-scale the existing matrix appropriately.
        // Keep aspect ratio if one dimension is set to 0.
        float sx =
            targetWidth != 0 ? targetWidth / (float) inWidth : targetHeight / (float) inHeight;
        float sy =
            targetHeight != 0 ? targetHeight / (float) inHeight : targetWidth / (float) inWidth;
        if (shouldResize(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
          matrix.preScale(sx, sy);
        }
      }
    }

    Bitmap newResult =
        Bitmap.createBitmap(result, drawX, drawY, drawWidth, drawHeight, matrix, true);
    if (newResult != result) {
      result.recycle();
      result = newResult;
    }

    return result;
  }
