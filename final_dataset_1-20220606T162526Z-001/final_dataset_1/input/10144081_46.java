@Override
    public int compare(final Object o1, final Object o2) {
        int o1Priority = getPriority(o1);
        int o2Priority = getPriority(o2);

        return o2Priority - o1Priority;
    }
