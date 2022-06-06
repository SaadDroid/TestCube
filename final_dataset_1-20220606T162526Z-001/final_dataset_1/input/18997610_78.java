public String processRefToExternalSchema(String $ref, RefFormat refFormat) {
        String renamedRef = cache.getRenamedRef($ref);
        if(renamedRef != null) {
            return renamedRef;
        }

        final Schema schema = cache.loadRef($ref, refFormat, Schema.class);

        if(schema == null) {
            // stop!  There's a problem.  retain the original ref
            LOGGER.warn("unable to load model reference from `" + $ref + "`.  It may not be available " +
                    "or the reference isn't a valid model schema");
            return $ref;
        }
        String newRef;

        if (openAPI.getComponents() == null) {
            openAPI.setComponents(new Components());
        }
        Map<String, Schema> schemas = openAPI.getComponents().getSchemas();

        if (schemas == null) {
            schemas = new LinkedHashMap<>();
        }

        final String possiblyConflictingDefinitionName = computeDefinitionName($ref);
        String tryName = null;
        Schema existingModel = schemas.get(possiblyConflictingDefinitionName);

        if (existingModel != null) {
            LOGGER.warn("A model for " + existingModel + " already exists");
            if(existingModel.get$ref() != null) {
                // use the new model
                existingModel = null;
            }else{
                if (!schema.equals(existingModel)){
                    //We add a number at the end of the definition name
                    int i = 2;
                    for (String name : schemas.keySet()) {
                        if (name.equals(possiblyConflictingDefinitionName)) {
                            tryName = possiblyConflictingDefinitionName + "_" + i;
                            existingModel = schemas.get(tryName);
                            i++;
                        }
                    }
                }
            }
        }
        if (StringUtils.isNotBlank(tryName)){
            newRef = tryName;
        }else{
            newRef = possiblyConflictingDefinitionName;
        }
        cache.putRenamedRef($ref, newRef);

        if(existingModel == null) {
            // don't overwrite existing model reference
            openAPI.getComponents().addSchemas(newRef, schema);
            cache.addReferencedKey(newRef);

            String file = $ref.split("#/")[0];
            if (schema.get$ref() != null) {
                RefFormat ref = computeRefFormat(schema.get$ref());
                if (isAnExternalRefFormat(ref)) {
                    schema.set$ref(processRefToExternalSchema(schema.get$ref(), ref));
                } else {
                    processRefToExternalSchema(file + schema.get$ref(), RefFormat.RELATIVE);
                }
            }


            if(schema instanceof ComposedSchema){
                ComposedSchema composedSchema = (ComposedSchema) schema;
                if (composedSchema.getAllOf() != null){
                    for(Schema item : composedSchema.getAllOf()){
                        if (item.get$ref() != null){
                            processRefSchema(item,file);
                        } else if (item.getProperties() != null) {
                            processProperties(item.getProperties(), file);
                        }
                    }

                }if (composedSchema.getOneOf() != null){
                    for(Schema item : composedSchema.getOneOf()){
                        if (item.get$ref() != null){
                            if (item.get$ref() != null){
                                processRefSchema(item,file);
                            }
                        }
                    }
                }if (composedSchema.getAnyOf() != null){
                    for(Schema item : composedSchema.getAnyOf()){
                        if (item.get$ref() != null){
                            if (item.get$ref() != null){
                                processRefSchema(item,file);
                            }
                        }
                    }

                }
            }
            //Loop the properties and recursively call this method;
            Map<String, Schema> subProps = schema.getProperties();

            processProperties(subProps,file);

            processDiscriminator(schema.getDiscriminator(),file);

            if(schema.getAdditionalProperties() != null && schema.getAdditionalProperties() instanceof Schema){
                Schema additionalProperty = (Schema) schema.getAdditionalProperties();
                if (additionalProperty.get$ref() != null) {
                    processRefSchema(additionalProperty, file);
                } else if (additionalProperty instanceof ArraySchema) {
                    ArraySchema arrayProp = (ArraySchema) additionalProperty;
                    if (arrayProp.getItems() != null && arrayProp.getItems().get$ref() != null &&
                            StringUtils.isNotBlank(arrayProp.get$ref())) {
                        processRefSchema(arrayProp.getItems(), file);
                    }
                } else if (additionalProperty.getAdditionalProperties() != null && additionalProperty.getAdditionalProperties() instanceof Schema) {
                    Schema mapProp =  (Schema) additionalProperty.getAdditionalProperties();
                    if (mapProp.get$ref() != null) {
                        processRefSchema(mapProp, file);
                    } else if (mapProp.getAdditionalProperties() instanceof ArraySchema &&
                                ((ArraySchema) mapProp).getItems() != null &&
                                    ((ArraySchema) mapProp).getItems().get$ref() != null
                                    && StringUtils.isNotBlank(((ArraySchema) mapProp).getItems().get$ref()))  {
                        processRefSchema(((ArraySchema) mapProp).getItems(), file);
                    }
                }

            }
            if (schema instanceof ArraySchema && ((ArraySchema) schema).getItems() != null) {
                ArraySchema arraySchema = (ArraySchema) schema;
                if (StringUtils.isNotBlank(arraySchema.getItems().get$ref())) {
                    processRefSchema(((ArraySchema) schema).getItems(), file);
                } else {
                    processProperties(arraySchema.getItems().getProperties() ,file);
                }
            }
        }

        return newRef;
    }
