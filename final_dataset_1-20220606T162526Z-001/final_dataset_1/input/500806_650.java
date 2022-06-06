@Override
    public Producer createProducer() {
        if (camelProducer == null) {
            camelProducer = new CamelProducer(getProducerName(), getEndpointConfiguration());
        }

        return camelProducer;
    }
