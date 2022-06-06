@Override
    protected PageItem convertEngineToConsoleItem(final Page item) {
        if (item != null) {
            return new PageItemConverter().convert(item);
        }
        return null;
    }
