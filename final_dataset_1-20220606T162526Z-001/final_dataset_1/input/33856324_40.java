public Schema parse() throws IOException {
        SchemaProducer producer = new SchemaProducer();
        Annotations incrAnnotations = new Annotations();
        parse(producer, incrAnnotations);
        return producer.getSchema().addAnnotations(incrAnnotations);
    }
