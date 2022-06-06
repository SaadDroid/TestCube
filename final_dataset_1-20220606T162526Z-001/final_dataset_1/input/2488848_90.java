@Override
    public String toString() {
        ((StringBuilder) appendable).insert(0, prefixesString.toString());
        prefixesString.setLength(0);
        return appendable.toString();
    }
