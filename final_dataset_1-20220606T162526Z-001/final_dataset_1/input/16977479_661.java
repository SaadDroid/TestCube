@Override
    public boolean isMet(T pojo) {
        for (SearchCondition<T> sc : scts) {
            if (!sc.isMet(pojo)) {
                return false;
            }
        }
        return true;
    }
