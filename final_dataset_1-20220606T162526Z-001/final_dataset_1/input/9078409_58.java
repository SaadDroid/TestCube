@Override
    public boolean test(AttributeStore obj) {
        for (Attribute attribute : obj.getAttributes(getTerm())) {
            if (getComparator().compare((T)(attribute.getValue()), getValue()) == 0)
                return true;
        }
        return false;
    }
