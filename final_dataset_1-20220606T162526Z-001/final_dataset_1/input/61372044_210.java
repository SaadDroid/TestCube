@Override
    public void execute() {
        validateParams();
        CallContext.current().setEventDetails("UserName: " + getUserName() + ", FirstName :" + getFirstName() + ", LastName: " + getLastName());
        final User user =
                _accountService.createUser(getUserName(), getPassword(), getFirstName(), getLastName(), getEmail(), getTimezone(), getAccountName(), getDomainId(),
                        getUserUUID());
        if (user != null) {
            final UserResponse response = _responseGenerator.createUserResponse(user);
            response.setResponseName(getCommandName());
            this.setResponseObject(response);
        } else {
            throw new ServerApiException(ApiErrorCode.INTERNAL_ERROR, "Failed to create a user");
        }
    }
