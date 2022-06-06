public void processComposedSchema(ComposedSchema composedSchema) {
        if(composedSchema.getAllOf() != null) {
            final List<Schema> schemas = composedSchema.getAllOf();
            if (schemas != null) {
                for (Schema schema : schemas) {
                    if (schema.get$ref() != null) {
                        processReferenceSchema(schema);
                    } else {
                        processSchemaType(schema);
                    }
                }
            }
        }if(composedSchema.getOneOf() != null){
            final List<Schema> schemas = composedSchema.getOneOf();
            if (schemas != null) {
                for (Schema schema : schemas) {
                    if (schema.get$ref() != null) {
                        String oldRef = schema.get$ref();
                        processReferenceSchema(schema);
                        String newRef = schema.get$ref();
                        changeDiscriminatorMapping(composedSchema, oldRef, newRef);
                    } else {
                        processSchemaType(schema);
                    }
                }
            }
        }if(composedSchema.getAnyOf() != null){
            final List<Schema> schemas = composedSchema.getAnyOf();
            if (schemas != null) {
                for (Schema schema : schemas) {
                    if (schema.get$ref() != null) {
                        processReferenceSchema(schema);
                    } else {
                        processSchemaType(schema);
                    }
                }
            }
        }

    }
