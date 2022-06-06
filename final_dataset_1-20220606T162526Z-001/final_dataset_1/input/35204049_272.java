public void createResource(Request request)
            throws InvalidPayloadException, ResourceAlreadyExistsException, ResourceNotFoundException  {

        TermPath termPath = (TermPath) request.getQueryProperties().remove("termPath");
        String qualifiedTermName = termPath.getFullyQualifiedName();
        request.getQueryProperties().put("name", qualifiedTermName);
        resourceDefinition.validateCreatePayload(request);

        // get taxonomy
        Request taxonomyRequest = new InstanceRequest(
                Collections.<String, Object>singletonMap("name", termPath.getTaxonomyName()));
        taxonomyRequest.addAdditionalSelectProperties(Collections.singleton("id"));
        Result taxonomyResult = getTaxonomyResourceProvider().getResourceById(taxonomyRequest);
        Map<String, Object> taxonomyPropertyMap = taxonomyResult.getPropertyMaps().iterator().next();

        // ensure that parent exists if not a root level term
        if (! termPath.getPath().equals("/")) {
            Map<String, Object> parentProperties = new HashMap<>(request.getQueryProperties());
            parentProperties.put("termPath", termPath.getParent());
            getResourceById(new InstanceRequest(parentProperties));
        }

        typeSystem.createTraitType(resourceDefinition, qualifiedTermName,
                request.<String>getProperty("description"));

        typeSystem.createTraitInstance(String.valueOf(taxonomyPropertyMap.get("id")),
                qualifiedTermName, request.getQueryProperties());
    }
