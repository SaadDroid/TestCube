public String toAbsoluteURI()
    {
        return buildAnchoredURI(defaultSecurity.promote());
    }
