public List<SCMCommand> dispatch(SCMHeartbeatRequestProto heartbeat) {
    DatanodeDetails datanodeDetails =
        DatanodeDetails.getFromProtoBuf(heartbeat.getDatanodeDetails());
    List<SCMCommand> commands;

    // If node is not registered, ask the node to re-register. Do not process
    // Heartbeat for unregistered nodes.
    if (!nodeManager.isNodeRegistered(datanodeDetails)) {
      LOG.info("SCM received heartbeat from an unregistered datanode {}. " +
          "Asking datanode to re-register.", datanodeDetails);
      UUID dnID = datanodeDetails.getUuid();
      nodeManager.addDatanodeCommand(dnID, new ReregisterCommand());

      commands = nodeManager.getCommandQueue(dnID);

    } else {

      // should we dispatch heartbeat through eventPublisher?
      commands = nodeManager.processHeartbeat(datanodeDetails);
      if (heartbeat.hasNodeReport()) {
        LOG.debug("Dispatching Node Report.");
        eventPublisher.fireEvent(
            NODE_REPORT,
            new NodeReportFromDatanode(
                datanodeDetails,
                heartbeat.getNodeReport()));
      }

      if (heartbeat.hasContainerReport()) {
        LOG.debug("Dispatching Container Report.");
        eventPublisher.fireEvent(
            CONTAINER_REPORT,
            new ContainerReportFromDatanode(
                datanodeDetails,
                heartbeat.getContainerReport()));

      }

      final List<IncrementalContainerReportProto> icrs =
          heartbeat.getIncrementalContainerReportList();

      if (icrs.size() > 0) {
        LOG.debug("Dispatching ICRs.");
        for (IncrementalContainerReportProto icr : icrs) {
          eventPublisher.fireEvent(INCREMENTAL_CONTAINER_REPORT,
              new IncrementalContainerReportFromDatanode(
                  datanodeDetails, icr));
        }
      }

      if (heartbeat.hasContainerActions()) {
        LOG.debug("Dispatching Container Actions.");
        eventPublisher.fireEvent(
            CONTAINER_ACTIONS,
            new ContainerActionsFromDatanode(
                datanodeDetails,
                heartbeat.getContainerActions()));
      }

      if (heartbeat.hasPipelineReports()) {
        LOG.debug("Dispatching Pipeline Report.");
        eventPublisher.fireEvent(
            PIPELINE_REPORT,
            new PipelineReportFromDatanode(
                datanodeDetails,
                heartbeat.getPipelineReports()));

      }

      if (heartbeat.hasPipelineActions()) {
        LOG.debug("Dispatching Pipeline Actions.");
        eventPublisher.fireEvent(
            PIPELINE_ACTIONS,
            new PipelineActionsFromDatanode(
                datanodeDetails,
                heartbeat.getPipelineActions()));
      }

      if (heartbeat.getCommandStatusReportsCount() != 0) {
        LOG.debug("Dispatching Command Status Report.");
        for (CommandStatusReportsProto commandStatusReport : heartbeat
            .getCommandStatusReportsList()) {
          eventPublisher.fireEvent(
              CMD_STATUS_REPORT,
              new CommandStatusReportFromDatanode(
                  datanodeDetails,
                  commandStatusReport));
        }
      }
    }

    return commands;
  }
