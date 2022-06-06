@Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Set<Attribute<? super T, ?>> getAttributes() {
        return (Set) attributeSet;
    }
