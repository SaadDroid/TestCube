@Path("/batchjobResources/{app}")
    @Produces("application/json")
    @GET
    @ApiOperation(value = "Get batch job resources", notes = "Returns the consumed resources for this app")
    public List<BatchResourceDTO> getBatchJobResources(
            @ApiParam(value = "return resources for this app") @PathParam("app") String app)
            throws ValidationException {
        if (app == null || app.isEmpty()) {
            throw new ValidationException("App must not be empty");
        }
        List<String> apps = new ArrayList<>();
        apps.add(app);
        List<BatchResourceDTO> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (ResourceEntity re : resourceLocator.getBatchJobConsumedResources(apps)) {
            for (ConsumedResourceRelationEntity r : re.getConsumedMasterRelations()) {
                mapResourceDTO(list, set, r.getSlaveResource().getResourceType().getId(),
                        r.getSlaveResource().getName(), true);
            }
        }
        set.clear();
        for (ResourceEntity re : resourceLocator.getBatchJobProvidedResources(apps)) {
            for (ProvidedResourceRelationEntity r : re.getProvidedMasterRelations()) {
                mapResourceDTO(list, set, r.getSlaveResource().getResourceType().getId(),
                        r.getSlaveResource().getName(), false);
            }
        }
        return list;
    }
