@Override
    public String toString()
    {
        // TODO: This needs to be changed but it involves changing a lot of unit tests
        XWikiToStringStyle style = new XWikiToStringStyle();
        style.setSeparator("");
        ToStringBuilder builder = new ToStringBuilder(this, style);

        builder = builder.append("Typed", isTyped()).append("Type", getType());

        if (getReference() != null) {
            builder = builder.append("Reference", getReference());
        }

        if (!getBaseReferences().isEmpty()) {
            builder = builder.append("Base References", getBaseReferences());
        }

        Map<String, String> params = getParameters();
        if (!params.isEmpty()) {
            builder = builder.append("Parameters", params);
        }

        return builder.toString();
    }
