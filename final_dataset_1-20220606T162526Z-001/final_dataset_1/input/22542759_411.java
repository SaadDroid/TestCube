@Override
  public void addApplication(ApplicationId id, ApplicationSpecification spec) {
    TransactionRunners.run(transactionRunner, context -> {
      getAppMetadataStore(context).writeApplication(id.getNamespace(), id.getApplication(), id.getVersion(), spec);
    });
  }
