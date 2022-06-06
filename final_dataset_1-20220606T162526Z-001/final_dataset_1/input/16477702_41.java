@SuppressWarnings("unchecked")
    public static void addIQProvider(String elementName, String namespace,
            Object provider) {
        validate(elementName, namespace);
        // First remove existing providers
        QName key = removeIQProvider(elementName, namespace);
        if (provider instanceof IqProvider) {
            iqProviders.put(key, (IqProvider<IQ>) provider);
        } else {
            throw new IllegalArgumentException("Provider must be an instance of IqProvider");
        }
    }
