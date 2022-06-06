@DELETE
    @ApiOperation(value = "Delete tag subscription of given user group",
            response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successful deletion of TagSubscriptionDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Path("{groupId}/tag-subscriptions/{tagName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUserGroupSubscription(
            @ApiParam(required = true, value = "Workspace id") @PathParam("workspaceId") String workspaceId,
            @ApiParam(required = true, value = "Group id id") @PathParam("groupId") String groupId,
            @ApiParam(required = true, value = "Tag name") @PathParam("tagName") String tagName)
            throws EntityNotFoundException, UserNotActiveException, AccessRightException, WorkspaceNotEnabledException {

        notificationManager.removeTagUserGroupSubscription(workspaceId, groupId, tagName);
        return Response.noContent().build();
    }
