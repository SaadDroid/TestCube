public boolean remove(long key1, long key2) {
        checkBiggerEqualZero(key1);
        long h = hash(key1, key2);
        return getSection(h).remove(key1, key2, ValueNotFound, ValueNotFound, (int) h);
    }
