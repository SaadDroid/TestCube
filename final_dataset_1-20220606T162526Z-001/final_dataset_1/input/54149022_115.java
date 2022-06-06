@GET
    @ApiOperation(value = "Get product-baseline by id",
            response = ProductBaselineDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of ProductBaselineDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Path("{ciId}/baselines/{baselineId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductBaselineDTO getProductBaseline(
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") String workspaceId,
            @ApiParam(required = true, value = "Configuration item id") @PathParam("ciId") String ciId,
            @ApiParam(required = true, value = "Baseline id") @PathParam("baselineId") int baselineId)
            throws EntityNotFoundException, UserNotActiveException, AccessRightException, WorkspaceNotEnabledException {

        ProductBaseline productBaseline = productBaselineService.getBaseline(baselineId);
        ProductBaselineDTO productBaselineDTO = mapper.map(productBaseline, ProductBaselineDTO.class);
        productBaselineDTO.setPathToPathLinks(getPathToPathLinksForGivenBaseline(productBaseline));
        productBaselineDTO.setConfigurationItemId(productBaseline.getConfigurationItem().getId());
        productBaselineDTO.setConfigurationItemLatestRevision(productBaseline.getConfigurationItem().getDesignItem().getLastRevision().getVersion());

        ConfigurationItemKey ciKey = productBaseline.getConfigurationItem().getKey();

        List<LightPartLinkListDTO> substitutesParts = new ArrayList<>();
        List<LightPartLinkListDTO> optionalParts = new ArrayList<>();

        for (String path : productBaseline.getSubstituteLinks()) {
            LightPartLinkListDTO lightPartLinkListDTO = new LightPartLinkListDTO();
            for (PartLink partLink : productService.decodePath(ciKey, path)) {
                lightPartLinkListDTO.getPartLinks().add(new LightPartLinkDTO(partLink.getComponent().getNumber(), partLink.getComponent().getName(),partLink.getReferenceDescription(),partLink.getFullId()));
            }
            substitutesParts.add(lightPartLinkListDTO);
        }
        for (String path : productBaseline.getOptionalUsageLinks()) {
            LightPartLinkListDTO lightPartLinkListDTO = new LightPartLinkListDTO();
            for (PartLink partLink : productService.decodePath(ciKey, path)) {
                lightPartLinkListDTO.getPartLinks().add(new LightPartLinkDTO(partLink.getComponent().getNumber(), partLink.getComponent().getName(),partLink.getReferenceDescription(),partLink.getFullId()));
            }
            optionalParts.add(lightPartLinkListDTO);
        }

        productBaselineDTO.setSubstitutesParts(substitutesParts);
        productBaselineDTO.setOptionalsParts(optionalParts);

        return productBaselineDTO;
    }
