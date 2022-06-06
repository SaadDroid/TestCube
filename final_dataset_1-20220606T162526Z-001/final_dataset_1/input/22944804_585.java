public void deletePermissionTicket(String id) throws NotFoundException, ServerException {
        try {
            // check token is permission ticket
            readPermissionTicket(id);
            cts.delete(id);
        } catch (CoreTokenException e) {
            throw new ServerException("Could not delete token: " + id);
        }
    }
