@Override
    public String[] getParameterValues(String name)
    {
        return getValueFor(name).multi();
    }
