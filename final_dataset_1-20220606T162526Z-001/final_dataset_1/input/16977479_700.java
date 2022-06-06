@Override
    public String getQuery() {
        StringBuilder sb = removeStringBuilder();
        return sb == null ? null : topBuilder.toString() + " WHERE " + sb.toString();
    }
