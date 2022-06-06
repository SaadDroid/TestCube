public static LifecycleComponentStack buildBookieServer(BookieConfiguration conf) throws Exception {

        final ComponentInfoPublisher componentInfoPublisher = new ComponentInfoPublisher();

        final Supplier<BookieServiceInfo> bookieServiceInfoProvider =
                () -> buildBookieServiceInfo(componentInfoPublisher);
        LifecycleComponentStack.Builder serverBuilder = LifecycleComponentStack
                .newBuilder()
                .withComponentInfoPublisher(componentInfoPublisher)
                .withName("bookie-server");

        // 1. build stats provider
        StatsProviderService statsProviderService =
            new StatsProviderService(conf);
        StatsLogger rootStatsLogger = statsProviderService.getStatsProvider().getStatsLogger("");
        serverBuilder.addComponent(statsProviderService);
        log.info("Load lifecycle component : {}", StatsProviderService.class.getName());

        // 2. build bookie server
        BookieService bookieService =
            new BookieService(conf, rootStatsLogger, bookieServiceInfoProvider);

        serverBuilder.addComponent(bookieService);
        log.info("Load lifecycle component : {}", BookieService.class.getName());

        if (conf.getServerConf().isLocalScrubEnabled()) {
            serverBuilder.addComponent(
                    new ScrubberService(
                            rootStatsLogger.scope(ScrubberStats.SCOPE),
                    conf, bookieService.getServer().getBookie().getLedgerStorage()));
        }

        // 3. build auto recovery
        if (conf.getServerConf().isAutoRecoveryDaemonEnabled()) {
            AutoRecoveryService autoRecoveryService =
                new AutoRecoveryService(conf, rootStatsLogger.scope(REPLICATION_SCOPE));

            serverBuilder.addComponent(autoRecoveryService);
            log.info("Load lifecycle component : {}", AutoRecoveryService.class.getName());
        }

        // 4. build http service
        if (conf.getServerConf().isHttpServerEnabled()) {
            BKHttpServiceProvider provider = new BKHttpServiceProvider.Builder()
                .setBookieServer(bookieService.getServer())
                .setServerConfiguration(conf.getServerConf())
                .setStatsProvider(statsProviderService.getStatsProvider())
                .build();
            HttpService httpService =
                new HttpService(provider, conf, rootStatsLogger);
            serverBuilder.addComponent(httpService);
            log.info("Load lifecycle component : {}", HttpService.class.getName());
        }

        // 5. build extra services
        String[] extraComponents = conf.getServerConf().getExtraServerComponents();
        if (null != extraComponents) {
            try {
                List<ServerLifecycleComponent> components = loadServerComponents(
                    extraComponents,
                    conf,
                    rootStatsLogger);
                for (ServerLifecycleComponent component : components) {
                    serverBuilder.addComponent(component);
                    log.info("Load lifecycle component : {}", component.getClass().getName());
                }
            } catch (Exception e) {
                if (conf.getServerConf().getIgnoreExtraServerComponentsStartupFailures()) {
                    log.info("Failed to load extra components '{}' - {}. Continuing without those components.",
                        StringUtils.join(extraComponents), e.getMessage());
                } else {
                    throw e;
                }
            }
        }

        return serverBuilder.build();
    }
