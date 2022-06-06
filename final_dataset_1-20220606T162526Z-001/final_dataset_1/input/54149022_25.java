@GET
    @Path("members")
    @ApiOperation(value = "Get members of the authenticated user's organization",
            response = AccountDTO.class,
            responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of AccountDTOs. It can be an empty list."),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMembers()
            throws EntityNotFoundException, AccessRightException {

        Organization organization = organizationManager.getMyOrganization();
        List<Account> accounts = organization.getMembers();
        List<AccountDTO> accountsDTOs = new ArrayList<>();

        for (Account account : accounts) {
            accountsDTOs.add(mapper.map(account, AccountDTO.class));
        }

        return Response.ok(new GenericEntity<List<AccountDTO>>((List<AccountDTO>) accountsDTOs) {
        }).build();
    }
