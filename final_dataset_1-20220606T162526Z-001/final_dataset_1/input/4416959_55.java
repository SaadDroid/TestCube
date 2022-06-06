boolean beginRender(MarkupWriter writer)
    {
        if (formSupport == null)
        {
            throw new RuntimeException("The Hidden component must be enclosed by a Form component.");
        }

        controlName = formSupport.allocateControlName(resources.getId());

        clientId = null;

        formSupport.store(this, new ProcessSubmission(controlName));

        Object toEncode = value == null ? nulls.replaceToClient() : value;

        String encoded = toEncode == null ? "" : encoder.toClient(toEncode);

        hiddenInputElement = writer.element("input", "type", "hidden", "name", controlName, "value", encoded);

        resources.renderInformalParameters(writer);

        writer.end();

        return false;
    }
