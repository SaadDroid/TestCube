@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        getGroupValueHandler(getClass()).appendToString(this, str);
        return str.toString();
    }
