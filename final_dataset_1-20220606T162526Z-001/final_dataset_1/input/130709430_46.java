@Override
    public Object process(Object input) {
        if (input instanceof JAXBElement) {
            return input;
        }
        if (nonNull(input.getClass().getAnnotation(XmlRootElement.class))) {
            return input;
        }
        return wrap(jaxb2Marshaller, input);
    }
