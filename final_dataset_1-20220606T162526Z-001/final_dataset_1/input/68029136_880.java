@POST
    @ApiOperation(value = "Add a Resource")
    public Response addResource(@ApiParam("Add a Resource") ResourceReleaseDTO request) {
        Resource resource;
        if (StringUtils.isEmpty(request.getName())) {
            return Response.status(BAD_REQUEST).entity(new ExceptionDto("Resource name must not be empty")).build();
        }
        if (StringUtils.isEmpty(request.getReleaseName())) {
            return Response.status(BAD_REQUEST).entity(new ExceptionDto("Release name must not be empty")).build();
        }
        try {
            resource = resourceBoundary.createNewResourceByName(ForeignableOwner.getSystemOwner(), request.getName(),
                    request.getType(), request.getReleaseName());
        } catch (AMWException e) {
            return Response.status(BAD_REQUEST).entity(new ExceptionDto(e.getMessage())).build();
        }
        return Response.status(CREATED).header("Location", "/resources/" + resource.getName()).build();
    }
