@Override
    public I_ITEM apply(final Iterable<I_ITEM> items) {
        if (nonNull(items) && nonNull(operator)) {
            return StreamSupport.stream(items.spliterator(), false)
                    .onClose(() -> CloseableUtil.close(items))
                    .reduce(operator)
                    .orElse(null);
        }

        return null;
    }
