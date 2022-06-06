@GET
    @Path("{uuid}/documents")
    @ApiOperation(value = "Get shared document from resource token",
            response = DocumentRevisionDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of DocumentRevisionDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDocumentWithSharedEntity(
            @ApiParam(required = false, value = "Password for resource") @HeaderParam("password") String password,
            @ApiParam(required = true, value = "Resource token") @PathParam("uuid") String uuid)
            throws SharedEntityNotFoundException {

        SharedEntity sharedEntity = shareManager.findSharedEntityForGivenUUID(uuid);

        // check if expire - delete it - send 404
        if (sharedEntity.getExpireDate() != null && sharedEntity.getExpireDate().getTime() < new Date().getTime()) {
            shareManager.deleteSharedEntityIfExpired(sharedEntity);
            return createExpiredEntityResponse();
        }

        if (!checkPasswordAccess(sharedEntity.getPassword(), password)) {
            return createPasswordProtectedResponse();
        }

        String sharedEntityToken = JWTokenFactory.createSharedEntityToken(authConfig.getJWTKey(), sharedEntity);
        DocumentRevision documentRevision = ((SharedDocument) sharedEntity).getDocumentRevision();
        return Response.ok().header("shared-entity-token", sharedEntityToken).entity(mapper.map(documentRevision, DocumentRevisionDTO.class)).build();
    }
