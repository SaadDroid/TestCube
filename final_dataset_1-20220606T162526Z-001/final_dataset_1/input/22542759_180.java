@VisibleForTesting
  static Injector createInjector(CConfiguration cConf, Configuration hConf) {
    return Guice.createInjector(
      new ConfigModule(cConf, hConf),
      new ZKClientModule(),
      new DFSLocationModule(),
      new NamespaceQueryAdminModule(),
      new ZKDiscoveryModule(),
      new DataFabricModules("cdap.explore.ContextManager").getDistributedModules(),
      Modules.override(new DataSetsModules().getDistributedModules()).with(new AbstractModule() {
        @Override
        protected void configure() {
          bind(MetadataStorage.class).to(NoopMetadataStorage.class);
        }
      }),
      new ExploreClientModule(),
      new KafkaClientModule(),
      new AuditModule(),
      new AuthorizationEnforcementModule().getDistributedModules(),
      new SecureStoreClientModule(),
      new AuthenticationContextModules().getMasterModule(),
      new MessagingClientModule(),
      new AbstractModule() {
        @Override
        protected void configure() {
          bind(UGIProvider.class).to(RemoteUGIProvider.class).in(Scopes.SINGLETON);
          bind(MetricsCollectionService.class).to(NoOpMetricsCollectionService.class).in(Scopes.SINGLETON);
          // bind PrivilegesManager to a remote implementation, so it does not need to instantiate the authorizer
          bind(PrivilegesManager.class).to(RemotePrivilegesManager.class);
          bind(OwnerAdmin.class).to(DefaultOwnerAdmin.class);
        }
      }
    );
  }
