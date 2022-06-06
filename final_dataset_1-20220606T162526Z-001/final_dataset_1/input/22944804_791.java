public void create(Connection connection, Token token) throws LdapOperationFailedException {
        Entry entry = conversion.getEntry(token);
        try {
            processResult(connection.add(LDAPRequests.newAddRequest(entry)));
        } catch (LdapException e) {
            throw new LdapOperationFailedException(e.getResult());
        }
    }
