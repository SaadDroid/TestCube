@Override
    protected void initStrategies(ApplicationContext context) {
        super.initStrategies(context);

        configureWebSockerHandler(context);
    }
