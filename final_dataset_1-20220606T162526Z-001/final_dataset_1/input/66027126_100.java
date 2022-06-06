@Override
    public Set<String> relationTypes()
    {
        return new HashSet<>(firstParameter(Parameters.REL, emptyList()).value());
    }
