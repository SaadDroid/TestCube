@Override
  public void handle(SCMCommand command, OzoneContainer ozoneContainer,
      StateContext context, SCMConnectionManager connectionManager) {
    LOG.debug("Processing Close Container command.");
    invocationCount.incrementAndGet();
    final long startTime = Time.monotonicNow();
    final DatanodeDetails datanodeDetails = context.getParent()
        .getDatanodeDetails();
    final CloseContainerCommandProto closeCommand =
        ((CloseContainerCommand)command).getProto();
    final ContainerController controller = ozoneContainer.getController();
    final long containerId = closeCommand.getContainerID();
    try {
      final Container container = controller.getContainer(containerId);

      if (container == null) {
        LOG.error("Container #{} does not exist in datanode. "
            + "Container close failed.", containerId);
        return;
      }

      // move the container to CLOSING if in OPEN state
      controller.markContainerForClose(containerId);

      switch (container.getContainerState()) {
      case OPEN:
      case CLOSING:
        // If the container is part of open pipeline, close it via write channel
        if (ozoneContainer.getWriteChannel()
            .isExist(closeCommand.getPipelineID())) {
          ContainerCommandRequestProto request =
              getContainerCommandRequestProto(datanodeDetails,
                  closeCommand.getContainerID());
          ozoneContainer.getWriteChannel()
              .submitRequest(request, closeCommand.getPipelineID());
        } else {
          // Container should not exist in CLOSING state without a pipeline
          controller.markContainerUnhealthy(containerId);
        }
        break;
      case QUASI_CLOSED:
        if (closeCommand.getForce()) {
          controller.closeContainer(containerId);
        }
        break;
      case CLOSED:
        break;
      case UNHEALTHY:
      case INVALID:
        if (LOG.isDebugEnabled()) {
          LOG.debug("Cannot close the container #{}, the container is"
              + " in {} state.", containerId, container.getContainerState());
        }
        break;
      default:
        break;
      }
    } catch (NotLeaderException e) {
      LOG.debug("Follower cannot close container #{}.", containerId);
    } catch (IOException e) {
      LOG.error("Can't close container #{}", containerId, e);
    } finally {
      long endTime = Time.monotonicNow();
      totalTime += endTime - startTime;
    }
  }
