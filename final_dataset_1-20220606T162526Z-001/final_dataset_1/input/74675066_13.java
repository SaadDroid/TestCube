@Override
    public boolean upgrade() {

        try {
            // This call create default organization with :
            // - default roles
            // - default entry point
            Organization organization = organizationService.createDefault().blockingGet();

            // No existing organization, finish the following set up :
            // - retrieve information from the old admin domain
            // - migrate all existing users permissions to default ORGANIZATION_OWNER
            if (organization != null) {
                logger.info("Default organization successfully created");

                // check if old domain admin exists
                Domain adminDomain = domainService.findById(ADMIN_DOMAIN).blockingGet();
                if (adminDomain != null) {
                    // update organization identities
                    PatchOrganization patchOrganization = new PatchOrganization();
                    patchOrganization.setIdentities(adminDomain.getIdentities() != null ? new ArrayList<>(adminDomain.getIdentities()) : null);
                    organizationService.update(organization.getId(), patchOrganization,null).blockingGet();

                    // Must grant owner power to all existing users to be iso-functional with v2 where all users could do everything.
                    Role organizationOwnerRole = roleService.findDefaultRole(Organization.DEFAULT, DefaultRole.ORGANIZATION_OWNER, ReferenceType.ORGANIZATION).blockingGet();
                    Page<User> userPage;
                    int page = 0;
                    do {
                        userPage = userService.findAll(ReferenceType.ORGANIZATION, Organization.DEFAULT, page, PAGE_SIZE).blockingGet();
                        // membership helper create membership only if
                        userPage.getData().forEach(user -> membershipHelper.setRole(user, organizationOwnerRole));
                        page++;
                    } while (userPage.getData().size() == PAGE_SIZE);

                    // then delete the domain
                    domainService.delete(ADMIN_DOMAIN).blockingGet();
                } else {
                    // Need to create an inline provider and an admin user for this newly created default organization.
                    IdentityProvider inlineProvider = createInlineProvider();
                    User adminUser = createAdminUser(inlineProvider);
                    membershipHelper.setOrganizationPrimaryOwnerRole(adminUser);
                }
            } else {
                logger.info("One or more organizations already exist. Check if default organization is up to date");

                // If default organization exist (and only if), need to check that inline idp and default admin user has 'admin' role.
                organization = organizationService.findById(Organization.DEFAULT).blockingGet();

                if (organization != null) {
                    final List<String> identities = organization.getIdentities();

                    IdentityProvider inlineIdp = identityProviderService.findAll(ReferenceType.ORGANIZATION, Organization.DEFAULT)
                            .flattenAsFlowable(identityProviders -> identityProviders)
                            .filter(identityProvider -> identityProvider.getType().equals("inline-am-idp")
                                    && !identityProvider.isExternal()
                                    && identities.contains(identityProvider.getId()))
                            .firstElement().blockingGet();

                    // If inline idp doesn't exist or is not enabled, it is probably an administrator choice. So do not go further.
                    if (inlineIdp != null) {
                        // If inline idp doesn't have "admin" user in its configuration, it is probably an administrator choice. So do not go further.
                        if (inlineIdp.getConfiguration().contains(",\"username\":\"" + ADMIN_USERNAME + "\",") && inlineIdp.getRoleMapper().isEmpty()) {

                            // Check the user admin exists.
                            User adminUser = userService.findByUsernameAndSource(ReferenceType.ORGANIZATION, Organization.DEFAULT, ADMIN_USERNAME, inlineIdp.getId()).blockingGet();

                            if (adminUser == null) {
                                // Create the admin user with organization primary owner role on the default organization.
                                adminUser = createAdminUser(inlineIdp);
                                membershipHelper.setOrganizationPrimaryOwnerRole(adminUser);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("An error occurred trying to initialize default organization", e);
            return false;
        }

        return true;
    }
