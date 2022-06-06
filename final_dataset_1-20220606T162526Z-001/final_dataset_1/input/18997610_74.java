public void processSchema(Schema schema) {
        if (schema == null) {
            return;
        }
        if (schema.get$ref() != null) {
            processReferenceSchema(schema);
        } else {
            processSchemaType(schema);
        }

    }
