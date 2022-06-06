@PUT
    @ApiOperation(value = "Update or create tag subscription of user",
            response = TagSubscriptionDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful retrieval of created/updated TagSubscriptionDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Path("{login}/tag-subscriptions/{tagName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUserSubscription(
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") String workspaceId,
            @ApiParam(required = true, value = "User login") @PathParam("login") String login,
            @ApiParam(required = true, value = "Tag name") @PathParam("tagName") String tagName,
            @ApiParam(required = true, value = "Tag subscription to update or create") TagSubscriptionDTO subDTO)
            throws EntityNotFoundException, AccessRightException, UserNotActiveException, WorkspaceNotEnabledException {

        notificationManager.createOrUpdateTagUserSubscription(workspaceId,
                login,
                tagName,
                subDTO.isOnIterationChange(),
                subDTO.isOnStateChange());
        subDTO.setTag(tagName);

        return Tools.prepareCreatedResponse(tagName, subDTO);
    }
