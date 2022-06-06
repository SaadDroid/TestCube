@GET
    @Path("/workspaces")
    @ApiOperation(value = "Get workspaces where authenticated user is active",
            response = WorkspaceDTO.class,
            responseContainer = "List",
            authorizations = {@Authorization(value = "authorization")})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of Workspaces. It can be an empty list."),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWorkspaces() {
        Workspace[] workspaces = userManager.getWorkspacesWhereCallerIsActive();

        List<WorkspaceDTO> workspaceDTOs = new ArrayList<>();
        for (Workspace workspace : workspaces) {
            workspaceDTOs.add(mapper.map(workspace, WorkspaceDTO.class));
        }

        return Response.ok(new GenericEntity<List<WorkspaceDTO>>((List<WorkspaceDTO>) workspaceDTOs) {
        }).build();
    }
