@Override
    public boolean hasNext()
        throws IOException, CollectionException
    {
        if (instanceIterator.hasNext()) {
            return true;
        }
        else {
            return lexeltIterator.hasNext();
        }
    }
