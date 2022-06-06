@GET
    @ApiOperation(value = "Download part template file",
            response = File.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Download success"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Path("/{fileName}")
    @Compress
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response downloadPartTemplateFile(
            @Context Request request,
            @ApiParam(required = false, value = "Range") @HeaderParam("Range") String range,
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") final String workspaceId,
            @ApiParam(required = true, value = "Template id") @PathParam("templateId") final String templateId,
            @ApiParam(required = true, value = "File name") @PathParam("fileName") final String fileName)
            throws EntityNotFoundException, UserNotActiveException, AccessRightException, NotAllowedException,
            PreconditionFailedException, RequestedRangeNotSatisfiableException, WorkspaceNotEnabledException {


        String fullName = workspaceId + "/part-templates/" + templateId + "/" + fileName;
        BinaryResource binaryResource = productService.getTemplateBinaryResource(fullName);
        BinaryResourceDownloadMeta binaryResourceDownloadMeta = new BinaryResourceDownloadMeta(binaryResource);

        // Check cache precondition
        Response.ResponseBuilder rb = request.evaluatePreconditions(binaryResourceDownloadMeta.getLastModified(), binaryResourceDownloadMeta.getETag());
        if (rb != null) {
            return rb.build();
        }

        InputStream binaryContentInputStream = null;

        // set to false because templates are never historized.
        boolean isToBeCached = false;

        try {
            binaryContentInputStream = storageManager.getBinaryResourceInputStream(binaryResource);
            return BinaryResourceDownloadResponseBuilder.prepareResponse(binaryContentInputStream, binaryResourceDownloadMeta, range, isToBeCached);
        } catch (StorageException e) {
            Streams.close(binaryContentInputStream);
            return BinaryResourceDownloadResponseBuilder.downloadError(e, fullName);
        }

    }
