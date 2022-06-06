public DeleteServiceFunctionChainTask create(SecurityGroup securityGroup) {
		DeleteServiceFunctionChainTask task = new DeleteServiceFunctionChainTask();

		task.securityGroup = securityGroup;
		task.apiFactory = this.apiFactory;
		task.name = task.getName();
		task.dbConnectionManager = this.dbConnectionManager;
		task.txBroadcastUtil = this.txBroadcastUtil;

		return task;
	}
