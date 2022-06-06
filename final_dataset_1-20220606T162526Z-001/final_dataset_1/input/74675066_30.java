@GET
    @Path("{role}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get a system role",
            notes = "There is no particular permission needed. User must be authenticated.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "System role successfully fetched", response = Role.class),
            @ApiResponse(code = 500, message = "Internal server error")})
    public void get(
            @PathParam("role") String role,
            @Suspended final AsyncResponse response) {

        // No permission needed to read system role.
        roleService.findById(ReferenceType.PLATFORM, Platform.DEFAULT, role)
                .map(this::convert)
                .subscribe(response::resume, response::resume);
    }
