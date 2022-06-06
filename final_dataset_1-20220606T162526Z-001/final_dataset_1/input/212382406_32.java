public void checkAndAddNewContainer(ContainerID containerID,
      ContainerReplicaProto.State replicaState,
      DatanodeDetails datanodeDetails)
      throws IOException {
    if (!exists(containerID)) {
      LOG.info("New container {} got from {}.", containerID,
          datanodeDetails.getHostName());
      ContainerWithPipeline containerWithPipeline =
          scmClient.getContainerWithPipeline(containerID.getId());
      LOG.debug("Verified new container from SCM {}, {} ",
          containerID, containerWithPipeline.getPipeline().getId());
      // If no other client added this, go ahead and add this container.
      if (!exists(containerID)) {
        addNewContainer(containerID.getId(), containerWithPipeline);
      }
    } else {
      // Check if container state is not open. In SCM, container state
      // changes to CLOSING first, and then the close command is pushed down
      // to Datanodes. Recon 'learns' this from DN, and hence replica state
      // will move container state to 'CLOSING'.
      ContainerInfo containerInfo = getContainer(containerID);
      if (containerInfo.getState().equals(HddsProtos.LifeCycleState.OPEN)
          && !replicaState.equals(ContainerReplicaProto.State.OPEN)
          && isHealthy(replicaState)) {
        LOG.info("Container {} has state OPEN, but Replica has State {}.",
            containerID, replicaState);
        updateContainerState(containerID, FINALIZE);
      }
    }
  }
