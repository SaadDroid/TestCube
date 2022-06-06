@Override
    public String getString()
    {
        if (value - value.longValue() == 0) {
            return String.valueOf(value.longValue());
        }
        else {
            return String.valueOf(value);
        }
    }
