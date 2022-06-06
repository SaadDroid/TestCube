@Override
    public boolean test(AttributeStore obj) {
        for (Attribute attribute : obj.getAttributes(getTerm())) {
            if (comparator.compare((T)(attribute.getValue()), start) >= 0
                    && comparator.compare((T)(attribute.getValue()), end) <= 0) {
                return true;
            }
        }

        return false;
    }
