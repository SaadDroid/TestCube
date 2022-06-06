public void flatten(OpenAPI openAPI) {
        this.openAPI = openAPI;

        if (openAPI.getComponents() != null) {

            if (openAPI.getComponents().getSchemas() == null) {
                openAPI.getComponents().setSchemas(new HashMap<>());
            }
        }

        // operations
        Map<String, PathItem> paths = openAPI.getPaths();
        if (openAPI.getComponents()== null){
            openAPI.setComponents(new Components());
        }
        Map<String, Schema> models = openAPI.getComponents().getSchemas();

        if (paths != null) {
            for (String pathname : paths.keySet()) {
                PathItem path = paths.get(pathname);

                for (Operation operation : path.readOperations()) {
                    RequestBody body = operation.getRequestBody();

                    if (body != null) {
                        if (body.getContent() != null) {
                            Map<String,MediaType> content = body.getContent();
                            for(String key: content.keySet()) {
                                if (content.get(key) != null) {
                                    MediaType mediaType = content.get(key);
                                    if (mediaType.getSchema() != null) {
                                        Schema model = mediaType.getSchema();
                                        if (model.getProperties() != null && model.getProperties().size() > 0) {
                                            flattenProperties(model.getProperties(), pathname);
                                            String modelName = resolveModelName(model.getTitle(), "body");
                                            mediaType.setSchema(new Schema().$ref(modelName));
                                            addGenerated(modelName, model);
                                            openAPI.getComponents().addSchemas(modelName, model);
                                        } else if (model instanceof ComposedSchema) {
                                            flattenComposedSchema(model, pathname);
                                            if (model.get$ref() == null) {
                                                String modelName = resolveModelName(model.getTitle(), "body");
                                                mediaType.setSchema(this.makeRefProperty(modelName, model));
                                                addGenerated(modelName, model);
                                                openAPI.getComponents().addSchemas(modelName, model);
                                            }
                                        } else if (model instanceof ArraySchema) {
                                            ArraySchema am = (ArraySchema) model;
                                            Schema inner = am.getItems();
                                            if (isObjectSchema(inner)) {
                                                if (inner.getProperties() != null && inner.getProperties().size() > 0) {
                                                    flattenProperties(inner.getProperties(), pathname);
                                                    String modelName = resolveModelName(inner.getTitle(), "body");
                                                    String existing = matchGenerated(inner);
                                                    if (existing != null) {
                                                        am.setItems(new Schema().$ref(existing));
                                                    } else {
                                                        am.setItems(new Schema().$ref(modelName));
                                                        addGenerated(modelName, inner);
                                                        openAPI.getComponents().addSchemas(modelName, inner);
                                                    }
                                                }else if (inner instanceof ComposedSchema && this.flattenComposedSchemas){
                                                    flattenComposedSchema(inner,key);
                                                    if (inner.get$ref() == null) {
                                                        String modelName = resolveModelName(inner.getTitle(), "inline_body_items_" + key + "_" + pathname);
                                                        am.setItems(this.makeRefProperty(modelName, inner));
                                                        addGenerated(modelName, inner);
                                                        openAPI.getComponents().addSchemas(modelName, inner);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    List<Parameter> parameters = operation.getParameters();
                    if (parameters != null){
                        for (Parameter parameter : parameters) {
                            if (parameter.getSchema() != null) {
                                Schema model = parameter.getSchema();
                                if (model.getProperties() != null) {
                                    if (model.getType() == null || "object".equals(model.getType())) {
                                        if (model.getProperties() != null && model.getProperties().size() > 0) {
                                            flattenProperties(model.getProperties(), pathname);
                                            String modelName = resolveModelName(model.getTitle(), parameter.getName());
                                            parameter.setSchema(new Schema().$ref(modelName));
                                            addGenerated(modelName, model);
                                            openAPI.getComponents().addSchemas(modelName, model);
                                        }
                                    }
                                }else if (model instanceof ComposedSchema) {
                                    String modelName = resolveModelName(model.getTitle(), parameter.getName());
                                    parameter.setSchema(new Schema().$ref(modelName));
                                    addGenerated(modelName, model);
                                    openAPI.getComponents().addSchemas(modelName, model);
                                }else if (model instanceof ArraySchema) {
                                    ArraySchema am = (ArraySchema) model;
                                    Schema inner = am.getItems();
                                    if (isObjectSchema(inner)) {
                                        if (inner.getProperties() != null && inner.getProperties().size() > 0) {
                                            flattenProperties(inner.getProperties(), pathname);
                                            String modelName = resolveModelName(inner.getTitle(), parameter.getName());
                                            String existing = matchGenerated(inner);
                                            if (existing != null) {
                                                am.setItems(new Schema().$ref(existing));
                                            } else {
                                                am.setItems(new Schema().$ref(modelName));
                                                addGenerated(modelName, am);
                                                openAPI.getComponents().addSchemas(modelName, am);
                                            }
                                        }else if (inner instanceof ComposedSchema && this.flattenComposedSchemas){
                                            flattenComposedSchema(inner, parameter.getName());
                                            if (inner.get$ref() == null) {
                                                String modelName = resolveModelName(inner.getTitle(), "inline_parameter_items_" + parameter.getName());
                                                am.setItems(this.makeRefProperty(modelName, inner));
                                                addGenerated(modelName, inner);
                                                openAPI.getComponents().addSchemas(modelName, inner);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Map<String, ApiResponse> responses = operation.getResponses();
                    if (responses != null) {
                        for (String key : responses.keySet()) {
                            ApiResponse response = responses.get(key);
                            if (response.getContent() != null) {
                                Map<String,MediaType> content = response.getContent();
                                for (String name: content.keySet()) {
                                    if (content.get(name) != null) {
                                        MediaType media = content.get(name);
                                        if (media.getSchema() != null) {
                                            Schema mediaSchema = media.getSchema();
                                            if (isObjectSchema(mediaSchema)) {
                                                if (mediaSchema.getProperties() != null && mediaSchema.getProperties().size() > 0 || mediaSchema instanceof ComposedSchema) {
                                                    String modelName = resolveModelName(mediaSchema.getTitle(), "inline_response_" + key);
                                                    String existing = matchGenerated(mediaSchema);
                                                    if (existing != null) {
                                                        media.setSchema(this.makeRefProperty(existing, mediaSchema));
                                                    } else {
                                                        media.setSchema(this.makeRefProperty(modelName, mediaSchema));
                                                        addGenerated(modelName, mediaSchema);
                                                        openAPI.getComponents().addSchemas(modelName, mediaSchema);
                                                    }
                                                }else if (mediaSchema.getAdditionalProperties() != null && !(mediaSchema.getAdditionalProperties() instanceof Boolean)) {
                                                    Schema innerProperty = (Schema) mediaSchema.getAdditionalProperties();
                                                    if (isObjectSchema(innerProperty)) {
                                                        key = "inline_response_map" + key;
                                                        flattenMapSchema(innerProperty, key, pathname, mediaSchema);
                                                    } else if (innerProperty instanceof ArraySchema) {
                                                        ArraySchema arraySchema = (ArraySchema) innerProperty;
                                                        Schema inner = arraySchema.getItems();
                                                        if (isObjectSchema(inner)) {
                                                            key = "inline_response_map_items" + key;
                                                            flattenMapSchema(inner,key,pathname,mediaSchema);
                                                        }
                                                    }
                                                }
                                            }else if (mediaSchema instanceof ArraySchema) {
                                                ArraySchema ap = (ArraySchema) mediaSchema;
                                                Schema inner = ap.getItems();
                                                if (isObjectSchema(inner)) {
                                                    flattenArraySchema(inner, key, pathname, ap);
                                                }
                                            } else if (mediaSchema.getAdditionalProperties() != null && !(mediaSchema.getAdditionalProperties() instanceof Boolean)) {
                                                Schema innerProperty = (Schema) mediaSchema.getAdditionalProperties();
                                                if (isObjectSchema(innerProperty)) {
                                                    key = "inline_response_map" + key;
                                                    flattenMapSchema(innerProperty, key, pathname, mediaSchema);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // definitions
        if (models != null) {
            List<String> modelNames = new ArrayList<String>(models.keySet());
            for (String modelName : modelNames) {
                Schema model = models.get(modelName);
                if (model.getProperties() != null) {
                    Map<String, Schema> properties = model.getProperties();
                    flattenProperties(properties, modelName);
                    fixStringModel(model);
                } else if (model instanceof ArraySchema) {
                    ArraySchema m = (ArraySchema) model;
                    Schema inner = m.getItems();
                    if (isObjectSchema(inner)) {
                        if (inner.getProperties() != null && inner.getProperties().size() > 0) {
                            String innerModelName = resolveModelName(inner.getTitle(), modelName + "_inner");
                            String existing = matchGenerated(inner);
                            if (existing == null) {
                                openAPI.getComponents().addSchemas(innerModelName, inner);
                                addGenerated(innerModelName, inner);
                                m.setItems(new Schema().$ref(innerModelName));
                            } else {
                                m.setItems(new Schema().$ref(existing));
                            }
                        }else if (inner instanceof ComposedSchema && this.flattenComposedSchemas){
                            flattenComposedSchema(inner,modelName);
                            if (inner.get$ref() == null) {
                                modelName = resolveModelName(inner.getTitle(), "inline_array_items_" + modelName);
                                m.setItems(this.makeRefProperty(modelName, inner));
                                addGenerated(modelName, inner);
                                openAPI.getComponents().addSchemas(modelName, inner);
                            }
                        }
                    }
                } else if (model instanceof ComposedSchema) {
                    ComposedSchema composedSchema = (ComposedSchema) model;
                    String inlineModelName = "";
                    List<Schema> list = null;
                    if (composedSchema.getAllOf() != null) {
                        list  = composedSchema.getAllOf();
                        inlineModelName = "AllOf";
                    }else if (composedSchema.getAnyOf() != null) {
                        list  = composedSchema.getAnyOf();
                        inlineModelName = "AnyOf";
                    }else if (composedSchema.getOneOf() != null) {
                        list  = composedSchema.getOneOf();
                        inlineModelName = "OneOf";
                    }

                    for(int i= 0; i<list.size();i++){
                        if (list.get(i).get$ref() == null){
                            Schema inline = list.get(i);
                            if (inline.getProperties()!= null){
                                flattenProperties(inline.getProperties(), modelName);
                            }
                            if (this.flattenComposedSchemas) {
                                int position = i+1;
                                inlineModelName = resolveModelName(inline.getTitle(),  modelName + inlineModelName + "_" + position);
                                list.set(i,new Schema().$ref(inlineModelName));
                                addGenerated(inlineModelName, inline);
                                openAPI.getComponents().addSchemas(inlineModelName, inline);
                            }
                        }
                    }
                }
            }
        }
    }
