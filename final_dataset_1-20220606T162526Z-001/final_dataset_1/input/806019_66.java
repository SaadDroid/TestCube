@Override
    public Double getDouble()
    {
        if (value.isEmpty()) {
            return (double) 0;
        }
        return Double.valueOf(value);
    }
