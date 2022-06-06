static boolean isVideoType(MediaEntity mediaEntity) {
        return VIDEO_TYPE.equals(mediaEntity.type) || GIF_TYPE.equals(mediaEntity.type);
    }
