@POST
    @ApiOperation(value = "Upload part template files",
            response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "upload", paramType = "formData", dataType = "file", required = true)
    })
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Upload success"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadPartTemplateFiles(
            @Context HttpServletRequest request,
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") final String workspaceId,
            @ApiParam(required = true, value = "Template id") @PathParam("templateId") final String templateId)
            throws EntityNotFoundException, EntityAlreadyExistsException, UserNotActiveException, AccessRightException,
            NotAllowedException, CreationException, WorkspaceNotEnabledException {

        try {
            BinaryResource binaryResource;
            String fileName = null;
            long length;
            PartMasterTemplateKey templatePK = new PartMasterTemplateKey(workspaceId, templateId);
            Collection<Part> formParts = request.getParts();

            for (Part formPart : formParts) {
                fileName = Normalizer.normalize(formPart.getSubmittedFileName(), Normalizer.Form.NFC);
                // Init the binary resource with a null length
                binaryResource = productService.saveFileInTemplate(templatePK, fileName, 0);
                OutputStream outputStream = storageManager.getBinaryResourceOutputStream(binaryResource);
                length = BinaryResourceUpload.uploadBinary(outputStream, formPart);
                productService.saveFileInTemplate(templatePK, fileName, length);
            }

            if (fileName == null) {
                return Response.status(Response.Status.BAD_REQUEST).build();
            }

            if (formParts.size() == 1) {
                return BinaryResourceUpload.tryToRespondCreated(request.getRequestURI() + URLEncoder.encode(fileName, "UTF-8"));
            }
            return Response.noContent().build();

        } catch (IOException | ServletException | StorageException e) {
            return BinaryResourceUpload.uploadError(e);
        }
    }
