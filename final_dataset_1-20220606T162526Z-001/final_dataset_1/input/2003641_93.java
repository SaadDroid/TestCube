public OpenAPI filter(OpenAPI openAPI, OpenAPISpecFilter filter, Map<String, List<String>> params, Map<String, String> cookies, Map<String, List<String>> headers) {
        OpenAPI filteredOpenAPI = filterOpenAPI(filter, openAPI, params, cookies, headers);
        if (filteredOpenAPI == null) {
            return filteredOpenAPI;
        }

        OpenAPI clone = new OpenAPI();
        clone.info(filteredOpenAPI.getInfo());
        clone.openapi(filteredOpenAPI.getOpenapi());
        clone.setExtensions(filteredOpenAPI.getExtensions());
        clone.setExternalDocs(filteredOpenAPI.getExternalDocs());
        clone.setSecurity(filteredOpenAPI.getSecurity());
        clone.setServers(filteredOpenAPI.getServers());
        clone.tags(filteredOpenAPI.getTags() == null ? null : new ArrayList<>(openAPI.getTags()));

        final Set<String> allowedTags = new HashSet<>();
        final Set<String> filteredTags = new HashSet<>();

        Paths clonedPaths = new Paths();
        if (filteredOpenAPI.getPaths() != null) {
            for (String resourcePath : filteredOpenAPI.getPaths().keySet()) {
                PathItem pathItem = filteredOpenAPI.getPaths().get(resourcePath);

                PathItem filteredPathItem = filterPathItem(filter, pathItem, resourcePath, params, cookies, headers);

                if (filteredPathItem != null) {

                    PathItem clonedPathItem = new PathItem();
                    clonedPathItem.set$ref(filteredPathItem.get$ref());
                    clonedPathItem.setDescription(filteredPathItem.getDescription());
                    clonedPathItem.setSummary(filteredPathItem.getSummary());
                    clonedPathItem.setExtensions(filteredPathItem.getExtensions());
                    clonedPathItem.setParameters(filteredPathItem.getParameters());
                    clonedPathItem.setServers(filteredPathItem.getServers());

                    Map<PathItem.HttpMethod, Operation> ops = filteredPathItem.readOperationsMap();

                    for (Map.Entry<PathItem.HttpMethod, Operation> entry : ops.entrySet()) {
                        PathItem.HttpMethod key = entry.getKey();
                        Operation op = entry.getValue();
                        List<String> opTagsBeforeFilter = null;
                        if (op.getTags() != null) {
                            opTagsBeforeFilter = new ArrayList<>(op.getTags());
                        } else {
                            opTagsBeforeFilter = new ArrayList<>();
                        }
                        op = filterOperation(filter, op, resourcePath, key.toString(), params, cookies, headers);
                        clonedPathItem.operation(key, op);
                        if (op == null) {
                            filteredTags.addAll(opTagsBeforeFilter);
                        } else {
                            if (op.getTags() != null) {
                                opTagsBeforeFilter.removeAll(op.getTags());
                                allowedTags.addAll(op.getTags());
                            }
                            filteredTags.addAll(opTagsBeforeFilter);
                        }

                    }
                    if (!clonedPathItem.readOperations().isEmpty()) {
                        clonedPaths.addPathItem(resourcePath, clonedPathItem);
                    }
                }
            }
            clone.paths(clonedPaths);
        }

        filteredTags.removeAll(allowedTags);

        final List<Tag> tags = clone.getTags();
        if (tags != null && !filteredTags.isEmpty()) {
            for (Iterator<Tag> it = tags.iterator(); it.hasNext(); ) {
                if (filteredTags.contains(it.next().getName())) {
                    it.remove();
                }
            }
            if (clone.getTags().isEmpty()) {
                clone.setTags(null);
            }
        }

        if (filteredOpenAPI.getComponents() != null) {
            clone.components(new Components());
            clone.getComponents().setSchemas(filterComponentsSchema(filter, filteredOpenAPI.getComponents().getSchemas(), params, cookies, headers));
            clone.getComponents().setSecuritySchemes(filteredOpenAPI.getComponents().getSecuritySchemes());
            clone.getComponents().setCallbacks(filteredOpenAPI.getComponents().getCallbacks());
            clone.getComponents().setExamples(filteredOpenAPI.getComponents().getExamples());
            clone.getComponents().setExtensions(filteredOpenAPI.getComponents().getExtensions());
            clone.getComponents().setHeaders(filteredOpenAPI.getComponents().getHeaders());
            clone.getComponents().setLinks(filteredOpenAPI.getComponents().getLinks());
            clone.getComponents().setParameters(filteredOpenAPI.getComponents().getParameters());
            clone.getComponents().setRequestBodies(filteredOpenAPI.getComponents().getRequestBodies());
            clone.getComponents().setResponses(filteredOpenAPI.getComponents().getResponses());


        }

        if (filter.isRemovingUnreferencedDefinitions()) {
            clone = removeBrokenReferenceDefinitions(clone);
        }

        return clone;
    }
