@PUT
    @Path("/" + MappingOptionListContainer.MAPPINGID)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Consumes("multipart/mixed")
    @ApiOperation(value = "Update a mapping.", httpMethod = "PUT", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK (Response containing a String message)"),
            @ApiResponse(code = 400, message = "InvalidArgumentsException"),
            @ApiResponse(code = 404, message = "DoesNotExistException"),
            @ApiResponse(code = 406, message = "MissingArgumentsException"),
            @ApiResponse(code = 409, message = "AlreadyExistsException"),
            @ApiResponse(code = 500, message = "InternalServerErrorException")
    })
    public Response updateMapping(@ApiParam(value = "Id of mapping", required = true) @PathParam("mappingId") String mappingId,
            MultiPart multiPart) throws MissingArgumentsException, InternalServerErrorException, AlreadyExistsException, DoesNotExistException, InvalidArgumentsException {

        MetadataTransformation mapping;
        
        mapping = getMapping(mappingId);
        oldMappingId = mapping.getId();

        createMapping(multiPart);
        oldMappingId = "";

        return Response.status(200).entity(new Result("Mapping with id " + mappingId + " updated!")).build();
    }
