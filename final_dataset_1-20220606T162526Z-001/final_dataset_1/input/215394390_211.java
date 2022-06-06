public static Schema inferSchema(MongoClient client, TableName table, int numObjToSample)
    {
        MongoDatabase db = client.getDatabase(table.getSchemaName());
        int docCount = 0;
        int fieldCount = 0;
        try (MongoCursor<Document> docs = db.getCollection(table.getTableName()).find().batchSize(numObjToSample)
                .maxScan(numObjToSample).limit(numObjToSample).iterator()) {
            if (!docs.hasNext()) {
                return SchemaBuilder.newBuilder().build();
            }
            SchemaBuilder schemaBuilder = SchemaBuilder.newBuilder();

            while (docs.hasNext()) {
                docCount++;
                Document doc = docs.next();
                for (String key : doc.keySet()) {
                    fieldCount++;
                    Field newField = getArrowField(key, doc.get(key));
                    Types.MinorType newType = Types.getMinorTypeForArrowType(newField.getType());
                    Field curField = schemaBuilder.getField(key);
                    Types.MinorType curType = (curField != null) ? Types.getMinorTypeForArrowType(curField.getType()) : null;

                    if (curField == null) {
                        schemaBuilder.addField(newField);
                    }
                    else if (newType != curType) {
                        //TODO: currently we resolve fields with mixed types by defaulting to VARCHAR. This is _not_ ideal
                        logger.warn("inferSchema: Encountered a mixed-type field[{}] {} vs {}, defaulting to String.",
                                key, curType, newType);
                        schemaBuilder.addStringField(key);
                    }
                    else if (curType == Types.MinorType.LIST) {
                        schemaBuilder.addField(mergeListField(key, curField, newField));
                    }
                    else if (curType == Types.MinorType.STRUCT) {
                        schemaBuilder.addField(mergeStructField(key, curField, newField));
                    }
                }
            }

            Schema schema = schemaBuilder.build();
            if (schema.getFields().isEmpty()) {
                throw new RuntimeException("No columns found after scanning " + fieldCount + " values across " +
                        docCount + " documents. Please ensure the collection is not empty and contains at least 1 supported column type.");
            }
            return schema;
        }
        finally {
            logger.info("inferSchema: Evaluated {} field values across {} documents.", fieldCount, docCount);
        }
    }
