protected ResourceBalancerService(String serviceName,
                                    int partitionCount,
                                    ZKClient zkClient,
                                    DiscoveryService discoveryService,
                                    final DiscoveryServiceClient discoveryServiceClient) {
    this.serviceName = serviceName;
    this.partitionCount = partitionCount;
    this.discoveryService = discoveryService;

    final ZKClient zk = ZKClients.namespace(zkClient, "/" + serviceName);

    this.election =
      new LeaderElection(zk, serviceName, new ElectionHandler() {
        private ResourceCoordinator coordinator;

        @Override
        public void leader() {
          coordinator = new ResourceCoordinator(zk,
                                                discoveryServiceClient,
                                                new BalancedAssignmentStrategy());
          coordinator.startAndWait();
        }

        @Override
        public void follower() {
          if (coordinator != null) {
            coordinator.stopAndWait();
            coordinator = null;
          }
        }
      });

    this.resourceClient = new ResourceCoordinatorClient(zk);
    this.completion = SettableFuture.create();
  }
