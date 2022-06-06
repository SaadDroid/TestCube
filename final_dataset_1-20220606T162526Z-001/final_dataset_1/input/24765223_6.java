@Override
    public Response insert(RESTInputUser user) throws BadRequestRestEx, NotFoundRestEx, InternalErrorRestEx, ConflictRestEx {


        boolean exists;
        // check that no user with same name exists
        try {
            userAdminService.get(user.getName());
            exists = true;
        } catch (NotFoundServiceEx ex) {
            // well, ok, user does not exist
            exists = false;
        } catch (Exception ex) {
            // something went wrong
            LOGGER.error(ex.getMessage(), ex);
            throw new InternalErrorRestEx(ex.getMessage());
        }

        if ( exists ) {
            throw new ConflictRestEx("User '" + user.getName() + "' already exists");
        }


        try {
            Set<UserGroup> groups = new HashSet<UserGroup>();
            // resolve groups
            List<IdName> inputGroups = user.getGroups();
            if ( inputGroups == null || inputGroups.isEmpty() ) {
//                throw new BadRequestRestEx("Can't insert user without group");
                LOGGER.warn("No groups defined for user " + user.getName());
            } else {
                for (IdName identifier : inputGroups) {
                    if ( identifier == null ) {
                        throw new BadRequestRestEx("Bad group identifier");
                    }
                    UserGroup group = getUserGroup(identifier);
                    groups.add(group);
                }
            }

            GSUser u = new GSUser();
            u.setGroups(groups);
            u.setExtId(user.getExtId());
            u.setName(user.getName());
            u.setPassword(user.getPassword());
            u.setEnabled(user.isEnabled());
            u.setAdmin(user.isAdmin());
            u.setFullName(user.getFullName());
            u.setEmailAddress(user.getEmailAddress());

            Long ret = userAdminService.insert(u);

            return Response.status(Status.CREATED).tag(ret.toString()).entity(ret).build();

        } catch (GeoFenceRestEx ex) {
            // already handled
            throw ex;
        } catch (NotFoundServiceEx ex) {
            LOGGER.warn("Problems inserting user: " + ex.getMessage(), ex);
            throw new NotFoundRestEx(ex.getMessage());
        } catch (BadRequestServiceEx ex) {
            LOGGER.warn("Problems inserting user: " + ex.getMessage(), ex);
            throw new BadRequestRestEx(ex.getMessage());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            throw new InternalErrorRestEx(ex.getMessage());
        }
    }
