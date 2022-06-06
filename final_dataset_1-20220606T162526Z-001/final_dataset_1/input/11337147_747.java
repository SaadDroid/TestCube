@Override
    protected void fillDeploys(final ApplicationPageItem item, final List<String> deploys) {
        addDeployer(new PageDeployer(
                factory.createPageDataStore(getEngineSession()), ApplicationPageItem.ATTRIBUTE_PAGE_ID));
        addDeployer(new ApplicationDeployer(
                factory.createApplicationDataStore(getEngineSession()), ApplicationPageItem.ATTRIBUTE_APPLICATION_ID));
        super.fillDeploys(item, deploys);
    }
