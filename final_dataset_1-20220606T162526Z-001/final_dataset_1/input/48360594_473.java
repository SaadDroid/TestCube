public static Schema cleanSchema(Schema schema, List<String> propsToAvoid) {
        if (schema != null) {
            switch (schema.getType()) {
            case RECORD:
                List<Schema.Field> fields = new ArrayList<>();
                for (Schema.Field field : schema.getFields()) {
                    Schema fieldSchema = cleanSchema(field.schema(), propsToAvoid);
                    fields.add(new Schema.Field(field.name(), fieldSchema, field.doc(), field.defaultVal()));
                }
                Schema recordSchema = Schema.createRecord(schema.getName(), schema.getDoc(), schema.getNamespace(),
                        schema.isError(), fields);
                addPropsToSchema(recordSchema, schema.getObjectProps(), propsToAvoid);
                return recordSchema;
            case MAP:
                Schema mapSchema = Schema.createMap(cleanSchema(schema.getValueType(), propsToAvoid));
                addPropsToSchema(mapSchema, schema.getObjectProps(), propsToAvoid);
                return mapSchema;
            case ARRAY:
                Schema arraySchema = Schema.createArray(cleanSchema(schema.getElementType(), propsToAvoid));
                addPropsToSchema(arraySchema, schema.getObjectProps(), propsToAvoid);
                return arraySchema;
            case UNION:
                List<Schema> types = new ArrayList<>();
                for (Schema unionType : schema.getTypes()) {
                    Schema unionTypeSchema = cleanSchema(unionType, propsToAvoid);
                    types.add(unionTypeSchema);
                }
                Schema unionSchema = Schema.createUnion(types);
                addPropsToSchema(unionSchema, schema.getObjectProps(), propsToAvoid);
                return unionSchema;
            case ENUM:
                Schema enumSchema = Schema.createEnum(schema.getName(), schema.getDoc(), schema.getNamespace(),
                        schema.getEnumSymbols());
                addPropsToSchema(enumSchema, schema.getObjectProps(), propsToAvoid);
                return enumSchema;
            case FIXED:
                Schema fixedSchema = Schema.createFixed(schema.getName(), schema.getDoc(), schema.getNamespace(),
                        schema.getFixedSize());
                addPropsToSchema(fixedSchema, schema.getObjectProps(), propsToAvoid);
                return fixedSchema;
            case INT:
            case LONG:
            case FLOAT:
            case BYTES:
            case STRING:
            case BOOLEAN:
            case DOUBLE:
            case NULL:
                Schema primitiveSchema = Schema.create(schema.getType());
                addPropsToSchema(primitiveSchema, schema.getObjectProps(), propsToAvoid);
                return primitiveSchema;

            }
        }
        return null;
    }
