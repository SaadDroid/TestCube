@GET
    @Path("/me")
    @ApiOperation(value = "Get authenticated user's account",
            response = AccountDTO.class,
            authorizations = {@Authorization(value = "authorization")})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of AccountDTO"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @Produces(MediaType.APPLICATION_JSON)
    public AccountDTO getAccount()
            throws EntityNotFoundException {
        Account account = accountManager.getMyAccount();
        AccountDTO accountDTO = mapper.map(account, AccountDTO.class);
        accountDTO.setAdmin(contextManager.isCallerInRole(UserGroupMapping.ADMIN_ROLE_ID));
        accountDTO.setProviderId(authManager.getProviderId(account));
        return accountDTO;
    }
