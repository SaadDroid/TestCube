@Override
    public void endLink(ResourceReference reference, boolean freestanding, Map<String, String> parameters)
    {
        if (getEmptyBlockState().isCurrentContainerBlockEmpty()) {
            ResourceType resourceType = reference.getType();
            if ((ResourceType.DOCUMENT.equals(resourceType) || ResourceType.SPACE.equals(resourceType)
                || ResourceType.PAGE.equals(resourceType)) && this.linkLabelGenerator != null) {
                getPrinter().print(this.linkLabelGenerator.generate(reference));
            } else {
                getPrinter().print(reference.getReference());
            }
        }
    }
