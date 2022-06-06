@VisibleForTesting
  void sendShutdownRequest() {
    Criteria criteria = new Criteria();
    criteria.setInstanceName("%");
    criteria.setPartition("%");
    criteria.setPartitionState("%");
    criteria.setResource("%");
    if (this.isHelixClusterManaged) {
      //In the managed mode, the Gobblin Yarn Application Master connects to the Helix cluster in the Participant role.
      criteria.setRecipientInstanceType(InstanceType.PARTICIPANT);
      criteria.setInstanceName(this.helixInstanceName);
    } else {
      criteria.setRecipientInstanceType(InstanceType.CONTROLLER);
    }
    criteria.setSessionSpecific(true);

    Message shutdownRequest = new Message(GobblinHelixConstants.SHUTDOWN_MESSAGE_TYPE,
        HelixMessageSubTypes.APPLICATION_MASTER_SHUTDOWN.toString().toLowerCase() + UUID.randomUUID().toString());
    shutdownRequest.setMsgSubType(HelixMessageSubTypes.APPLICATION_MASTER_SHUTDOWN.toString());
    shutdownRequest.setMsgState(Message.MessageState.NEW);
    shutdownRequest.setTgtSessionId("*");

    int messagesSent = this.messagingService.send(criteria, shutdownRequest);
    if (messagesSent == 0) {
      LOGGER.error(String.format("Failed to send the %s message to the controller", shutdownRequest.getMsgSubType()));
    }
  }
