@Override
  public void onMessage(final DatanodeDetails datanodeDetails,
                        final EventPublisher publisher) {

    try {

      /*
       * We should have already destroyed all the pipelines on this datanode
       * when it was marked as stale. Destroy pipeline should also have closed
       * all the containers on this datanode.
       *
       * Ideally we should not have any pipeline or OPEN containers now.
       *
       * To be on a safer side, we double check here and take appropriate
       * action.
       */
      LOG.info("A dead datanode is detected. {}", datanodeDetails);
      destroyPipelines(datanodeDetails);
      closeContainers(datanodeDetails, publisher);

      // Remove the container replicas associated with the dead node.
      removeContainerReplicas(datanodeDetails);

    } catch (NodeNotFoundException ex) {
      // This should not happen, we cannot get a dead node event for an
      // unregistered datanode!
      LOG.error("DeadNode event for a unregistered node: {}!", datanodeDetails);
    }
  }
