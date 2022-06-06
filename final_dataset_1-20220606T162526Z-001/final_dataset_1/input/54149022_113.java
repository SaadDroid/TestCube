@POST
    @ApiOperation(value = "Create a new product-baseline",
            response = ProductBaselineDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of ProductBaselineDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ProductBaselineDTO createProductBaseline(
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") String workspaceId,
            @ApiParam(required = true, value = "Product baseline to create") ProductBaselineCreationDTO productBaselineDTO,
            @ApiParam(required = false, value = "Dry run flag") @QueryParam("dryRun") boolean dryRun)
            throws UserNotActiveException, EntityNotFoundException, NotAllowedException, AccessRightException,
            PartRevisionNotReleasedException, EntityConstraintException, CreationException,
            EntityAlreadyExistsException, WorkspaceNotEnabledException {

        String ciId = productBaselineDTO.getConfigurationItemId();
        ConfigurationItemKey ciKey = new ConfigurationItemKey(workspaceId, ciId);
        String description = productBaselineDTO.getDescription();
        String name = productBaselineDTO.getName();
        ProductBaselineType type = productBaselineDTO.getType();

        List<BaselinedPartDTO> baselinedPartsDTO = productBaselineDTO.getBaselinedParts();
        List<PartIterationKey> partIterationKeys = baselinedPartsDTO.stream()
                .map(part -> new PartIterationKey(workspaceId, part.getNumber(), part.getVersion(), part.getIteration())).collect(Collectors.toList());

        ProductBaseline baseline = productBaselineService.createBaseline(ciKey, name, type, description, partIterationKeys,
                productBaselineDTO.getSubstituteLinks(), productBaselineDTO.getOptionalUsageLinks(),
                productBaselineDTO.getEffectiveDate(), productBaselineDTO.getEffectiveSerialNumber(), productBaselineDTO.getEffectiveLotId(), dryRun);

        ProductBaselineDTO dto = mapper.map(baseline, ProductBaselineDTO.class);

        dto.setConfigurationItemLatestRevision(baseline.getConfigurationItem().getDesignItem().getLastRevision().getVersion());

        if(!dryRun) {
            dto.setHasObsoletePartRevisions(!productBaselineService.getObsoletePartRevisionsInBaseline(workspaceId, baseline.getId()).isEmpty());
        }

        return dto;
    }
