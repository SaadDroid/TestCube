public Element serviceSpecificExec(Element params, ServiceContext context) throws Exception {
        GeonetContext gc = (GeonetContext) context.getHandlerContext(Geonet.CONTEXT_NAME);
        DataManager dm = gc.getBean(DataManager.class);

        String child = Util.getParam(params, Params.CHILD, "n");
        String isTemplate = Util.getParam(params, Params.TEMPLATE, "n");
        String id;
        String uuid;
        boolean haveAllRights = Boolean.valueOf(Util.getParam(params, Params.FULL_PRIVILEGES, "false"));

        SettingManager sm = gc.getBean(SettingManager.class);
        boolean generateUuid = sm.getValueAsBool(Settings.SYSTEM_METADATACREATE_GENERATE_UUID);

        // does the request contain a UUID ?
        try {
            uuid = Util.getParam(params, Params.UUID);
            // lookup ID by UUID
            id = dm.getMetadataId(uuid);
        } catch (BadInputEx x) {
            try {
                id = Util.getParam(params, Params.ID);
                uuid = dm.getMetadataUuid(id);
            }
            // request does not contain ID
            catch (BadInputEx xx) {
                // give up
                throw new Exception("Request must contain a UUID or an ID");
            }
        }


        // User assigned uuid: check if already exists
        String metadataUuid;
        if (!generateUuid) {
            metadataUuid = Util.getParam(params, "metadataUuid", "");
            if (StringUtils.isEmpty(metadataUuid)) {
                // Create a random UUID
                metadataUuid = UUID.randomUUID().toString();
            } else {
                // Check if the UUID exists
                if (StringUtils.isNotEmpty(dm.getMetadataId(metadataUuid))) {
                    throw new Exception("The metadata UUID already exists. Choose another one");
                }
            }
        } else {
            metadataUuid = UUID.randomUUID().toString();
        }


        String groupOwner = Util.getParam(params, Params.GROUP);

        // TODO : Check user can create a metadata in that group
        UserSession user = context.getUserSession();
        if (user.getProfile() != Profile.Administrator) {
            final Specifications<UserGroup> spec = where(UserGroupSpecs.hasProfile(Profile.Editor))
                .and(UserGroupSpecs.hasUserId(user.getUserIdAsInt()))
                .and(UserGroupSpecs.hasGroupId(Integer.valueOf(groupOwner)));

            final List<UserGroup> userGroups = context.getBean(UserGroupRepository.class).findAll(spec);

            if (userGroups.size() == 0) {
                throw new ServiceNotAllowedEx("Service not allowed. User needs to be Editor in group with id " + groupOwner);
            }
        }

        //--- query the data manager
        SettingManager settingManager = gc.getBean(SettingManager.class);
        String newId = dm.createMetadata(context, id, groupOwner,
            settingManager.getSiteId(), context.getUserSession().getUserIdAsInt(),
            (child.equals("n") ? null : uuid), isTemplate, haveAllRights, metadataUuid);


        dm.activateWorkflowIfConfigured(context, newId, groupOwner);


        try {
            StoreUtils.copyDataDir(context, Integer.parseInt(id), Integer.parseInt(newId), true);
        } catch (Exception e) {
            Log.warning(Geonet.DATA_MANAGER, "Error while copying metadata resources. " + e.toString() +
                ". Metadata is created but without resources from record with id:" + id);
        }

        Element response = new Element(Jeeves.Elem.RESPONSE);
        response.addContent(new Element(Geonet.Elem.JUSTCREATED).setText("true"));

        String sessionTabProperty = useEditTab ? Geonet.Session.METADATA_EDITING_TAB : Geonet.Session.METADATA_SHOW;

        // Set current tab for new editing session if defined.
        Element elCurrTab = params.getChild(Params.CURRTAB);
        if (elCurrTab != null) {
            context.getUserSession().setProperty(sessionTabProperty, elCurrTab.getText());
        }
        response.addContent(new Element(Geonet.Elem.ID).setText(newId));
        return response;
    }
