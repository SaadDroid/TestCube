@Override
    public ResourceReference parse(String rawReference)
    {
        ResourceReference reference = this.defaultResourceReferenceParser.parse(rawReference);
        if (reference.getType().equals(ResourceType.UNKNOWN)) {
            reference = this.untypedImageReferenceParser.parse(rawReference);
        }
        return reference;
    }
