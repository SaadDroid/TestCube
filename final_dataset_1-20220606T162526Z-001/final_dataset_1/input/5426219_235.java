@Override
    public Iterator<T> iterator() {
        return inputStream == null ? Collections.emptyIterator() : new ObjectInputStreamIterator();
    }
