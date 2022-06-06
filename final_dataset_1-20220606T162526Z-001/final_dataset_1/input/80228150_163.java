public SecurityGroupMemberDeleteTask create(SecurityGroupMember sgm) {
        SecurityGroupMemberDeleteTask task = new SecurityGroupMemberDeleteTask();
        task.sgm = sgm;
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;

        return task;
    }
