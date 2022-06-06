public void delete(List<Long> userIds) {
        try {
            identityAPI.deleteUsers(userIds);
        } catch (DeletionException e) {
            throw new APIException(new _("Error when deleting users"), e);
        }
    }
