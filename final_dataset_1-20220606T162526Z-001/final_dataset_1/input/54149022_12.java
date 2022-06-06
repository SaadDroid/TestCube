@DELETE
    @ApiOperation(value = "Delete marker",
            response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successful deletion of LayerDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Path("{layerId}/markers/{markerId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteMarker(
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") String workspaceId,
            @ApiParam(required = true, value = "Configuration item id") @PathParam("ciId") String ciId,
            @ApiParam(required = true, value = "Layer id") @PathParam("layerId") int layerId,
            @ApiParam(required = true, value = "Marker id") @PathParam("markerId") int markerId)
            throws EntityNotFoundException, AccessRightException, UserNotActiveException, WorkspaceNotEnabledException {

        productService.deleteMarker(layerId, markerId);
        return Response.noContent().build();
    }
