@Override
    public Single<User> update(String id, User updateUser) {
        try {
            // prepare context
            AuthenticationContext authenticationContext = new SimpleAuthenticationContext();
            TemplateEngine templateEngine = authenticationContext.getTemplateEngine();
            ((DefaultUser) updateUser).setId(id);
            templateEngine.getTemplateContext().setVariable(USER_CONTEXT_KEY, updateUser);

            // prepare request
            final HttpUsersResourceConfiguration usersResourceConfiguration = configuration.getUsersResource();
            final HttpResourceConfiguration updateResourceConfiguration = usersResourceConfiguration.getPaths().getUpdateResource();
            final String updateUserURI = usersResourceConfiguration.getBaseURL() + updateResourceConfiguration.getBaseURL();
            final HttpMethod updateUserHttpMethod = HttpMethod.valueOf(updateResourceConfiguration.getHttpMethod().toString());
            final List<HttpHeader> updateUserHttpHeaders = updateResourceConfiguration.getHttpHeaders();
            final String updateUserBody = updateResourceConfiguration.getHttpBody();
            final Single<HttpResponse<Buffer>> requestHandler = processRequest(templateEngine, updateUserURI, updateUserHttpMethod, updateUserHttpHeaders, updateUserBody);

            return requestHandler
                    .map(httpResponse -> {
                        final List<HttpResponseErrorCondition> errorConditions = updateResourceConfiguration.getHttpResponseErrorConditions();
                        Map<String, Object> userAttributes = processResponse(templateEngine, errorConditions, httpResponse);
                        return convert(updateUser.getUsername(), userAttributes);
                    })
                    .onErrorResumeNext(ex -> {
                        if (ex instanceof AbstractManagementException) {
                            return Single.error(ex);
                        }
                        LOGGER.error("An error has occurred while updating user {} from the remote HTTP identity provider", updateUser.getUsername(), ex);
                        return Single.error(new TechnicalManagementException("An error has occurred while updating user from the remote HTTP identity provider", ex));
                    });
        } catch (Exception ex) {
            LOGGER.error("An error has occurred while updating the user {}", updateUser.getUsername(), ex);
            return Single.error(new TechnicalManagementException("An error has occurred while updating the user", ex));
        }
    }
