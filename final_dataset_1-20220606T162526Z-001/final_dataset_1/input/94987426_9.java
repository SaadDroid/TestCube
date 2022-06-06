@Decision(value=PROCESSABLE, method="PUT")
    public boolean userProcessableInPut(PasswordCredentialUpdateRequest updateRequest, RestContext context, EntityManager em) {
        return findUserByAccount(updateRequest.getAccount(), em)
                .map(user -> {
                    context.putValue(user);
                    return user;
                })
                .filter(user -> user.getPasswordCredential() != null)
                .filter(user ->
                        Arrays.equals(user.getPasswordCredential().getPassword(),
                                PasswordUtils.pbkdf2(updateRequest.getOldPassword(), user.getPasswordCredential().getSalt(), 100))
                )
                .isPresent();
    }
