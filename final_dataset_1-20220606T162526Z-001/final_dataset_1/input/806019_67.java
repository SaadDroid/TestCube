@Override
    public Long getLong()
    {
        if (value.isEmpty()) {
            return (long) 0;
        }
        return Long.valueOf(value);
    }
