@Override
    public boolean handleResource(ResourceResponse resource) {
        // By default we will keep going until we reach the end offset of this page...
        boolean needMore = currentOffset < endOffset - 1;
        if (currentOffset >= startOffset && currentOffset < endOffset) {
            // ...but allow the downstream handle to terminate early
            needMore = delegate.handleResource(resource) && needMore;
        }
        currentOffset++;
        return needMore;
    }
