public static MutableBitMap ofStream(InputStream input) {
        MutableRoaringBitmap another = new MutableRoaringBitmap();
        DataInputStream dis = new DataInputStream(input);
        try {
            another.deserialize(dis);
            return of(another);
        } catch (IOException e) {
            SwiftLoggers.getLogger().error(e);
            return of();
        } finally {
            IoUtil.close(dis);
        }
    }
