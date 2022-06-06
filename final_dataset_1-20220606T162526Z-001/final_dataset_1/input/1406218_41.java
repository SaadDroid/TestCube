@Override
    public boolean equals(Object object)
    {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass() != getClass()) {
            return false;
        }
        LinkState rhs = (LinkState) object;
        return new EqualsBuilder()
            .append(getResponseCode(), rhs.getResponseCode())
            .append(getLastCheckedTime(), rhs.getLastCheckedTime())
            .append(getContextData(), rhs.getContextData())
            .isEquals();
    }
