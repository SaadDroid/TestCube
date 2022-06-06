@Override
    public ApplicationItem add(final ApplicationItem item) {

        try {
            final Page homePageDef = pageAPI.getPageByName(CUSTOMPAGE_HOME);

            final ApplicationCreator creator = converter.toApplicationCreator(item);

            final Application application = applicationAPI.createApplication(creator);
            final ApplicationPage appHomePage = applicationAPI.createApplicationPage(application.getId(), homePageDef.getId(), "home");
            applicationAPI.setApplicationHomePage(application.getId(), appHomePage.getId());
            return converter.toApplicationItem(application);
        }catch (final Exception e) {
            throw new APIException(e);
        }
    }
