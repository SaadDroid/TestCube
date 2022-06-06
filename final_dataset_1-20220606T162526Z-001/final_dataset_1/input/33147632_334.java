static boolean isVariantSupported(VideoInfo.Variant variant) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP &&
                CONTENT_TYPE_HLS.equals(variant.contentType)) {
            return true;
        } else if (CONTENT_TYPE_MP4.equals(variant.contentType)) {
            return true;
        }

        return false;
    }
