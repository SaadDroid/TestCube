@Override
  public void handle(SCMCommand command, OzoneContainer ozoneContainer,
      StateContext context, SCMConnectionManager connectionManager) {
    invocationCount.incrementAndGet();
    final long startTime = Time.monotonicNow();
    final DatanodeDetails dn = context.getParent()
        .getDatanodeDetails();
    final CreatePipelineCommandProto createCommand =
        ((CreatePipelineCommand)command).getProto();
    final HddsProtos.PipelineID pipelineID = createCommand.getPipelineID();
    final Collection<DatanodeDetails> peers =
        createCommand.getDatanodeList().stream()
            .map(DatanodeDetails::getFromProtoBuf)
            .collect(Collectors.toList());

    try {
      XceiverServerSpi server = ozoneContainer.getWriteChannel();
      if (!server.isExist(pipelineID)) {
        final RaftGroupId groupId = RaftGroupId.valueOf(
            PipelineID.getFromProtobuf(pipelineID).getId());
        final RaftGroup group = RatisHelper.newRaftGroup(groupId, peers);
        server.addGroup(pipelineID, peers);
        peers.stream().filter(
            d -> !d.getUuid().equals(dn.getUuid()))
            .forEach(d -> {
              final RaftPeer peer = RatisHelper.toRaftPeer(d);
              try (RaftClient client = RatisHelper.newRaftClient(peer, conf,
                  ozoneContainer.getTlsClientConfig())) {
                client.groupAdd(group, peer.getId());
              } catch (AlreadyExistsException ae) {
                // do not log
              } catch (IOException ioe) {
                LOG.warn("Add group failed for {}", d, ioe);
              }
            });
        LOG.info("Created Pipeline {} {} #{}.",
            createCommand.getType(), createCommand.getFactor(), pipelineID);
      }
    } catch (IOException e) {
      LOG.error("Can't create pipeline {} {} #{}", createCommand.getType(),
          createCommand.getFactor(), pipelineID, e);
    } finally {
      long endTime = Time.monotonicNow();
      totalTime += endTime - startTime;
    }
  }
