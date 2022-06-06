@Override
    public Set<String> reverseRelationTypes()
    {
        return new HashSet<>(firstParameter(Parameters.REV, emptyList()).value());
    }
