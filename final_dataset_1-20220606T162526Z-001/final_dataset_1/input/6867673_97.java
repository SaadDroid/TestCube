public void addDefaultHeader(final String name, final String value) {
        Validate.notEmpty(name, "header name cannot be empty");
        Validate.notNull(value, "header value cannot be null, use an empty string instead");
        this.checkConfigurable();
        this.defaultHeaders.put(name, value);
    }
