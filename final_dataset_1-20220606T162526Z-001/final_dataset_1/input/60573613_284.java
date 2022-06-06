public boolean misfireIfNecessary(final List<Integer> items) {
        if (hasRunningItems(items)) {
            setMisfire(items);
            return true;
        }
        return false;
    }
