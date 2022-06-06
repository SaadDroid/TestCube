@Override
    public Response insert(RESTInputGroup userGroup) throws NotFoundRestEx, InternalErrorRestEx, ConflictRestEx {

        // check that no group with same name exists
        boolean exists;
        try {
            userGroupAdminService.get(userGroup.getName());
            exists = true;
        } catch (NotFoundServiceEx ex) {
            // well, ok, usergroup does not exist
            exists = false;
        } catch (Exception ex) {
            // something went wrong
            LOGGER.error(ex.getMessage(), ex);
            throw new InternalErrorRestEx(ex.getMessage());
        }

        if(exists)
            throw new ConflictRestEx("Role '"+userGroup.getName()+"' already exists");

        // ok: insert it
        try {
            ShortGroup insert = new ShortGroup();
            insert.setEnabled(userGroup.isEnabled());
            insert.setExtId(userGroup.getExtId());
            insert.setName(userGroup.getName());

            Long id = userGroupAdminService.insert(insert);
            return Response.status(Status.CREATED).tag(id.toString()).entity(id).build();

        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            throw new InternalErrorRestEx(ex.getMessage());
        }
    }
