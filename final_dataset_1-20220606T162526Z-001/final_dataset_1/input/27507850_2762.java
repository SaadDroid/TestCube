@Nonnull
  @VisibleForTesting
  static List<Row> getPassivePeerRows(
      BgpPeerConfigId passiveId,
      BgpPassivePeerConfig passivePeer,
      NetworkConfigurations nc,
      ValueGraph<BgpPeerConfigId, BgpSessionProperties> configuredTopology,
      ValueGraph<BgpPeerConfigId, BgpSessionProperties> establishedTopology) {
    // Start row with base columns. Need to add status.
    // If there are compatible peers, will also add remote node and replace:
    // - local IP, with the remote node's remote IP
    // - remote AS
    // - remote IP
    // - session type
    // Local and remote interface will not be filled in (reserved for unnumbered peers).
    Row.TypedRowBuilder rb =
        Row.builder(METADATA_MAP)
            .put(COL_ADDRESS_FAMILIES, ImmutableSet.of())
            .put(COL_LOCAL_AS, passivePeer.getLocalAs())
            .put(COL_LOCAL_IP, passivePeer.getLocalIp())
            .put(COL_NODE, new Node(passiveId.getHostname()))
            .put(COL_REMOTE_AS, passivePeer.getRemoteAsns().toString())
            .put(
                COL_REMOTE_IP, new SelfDescribingObject(Schema.PREFIX, passivePeer.getPeerPrefix()))
            .put(COL_SESSION_TYPE, SessionType.UNSET)
            .put(COL_VRF, passiveId.getVrfName());

    // If peer is locally misconfigured (missing remote prefix or local/remote AS) generate one row
    if (getLocallyBrokenStatus(passivePeer) != null) {
      return ImmutableList.of(rb.put(COL_ESTABLISHED_STATUS, NOT_COMPATIBLE).build());
    }

    // Find all correctly configured remote peers compatible with this peer
    Set<BgpPeerConfigId> compatibleRemotes = configuredTopology.adjacentNodes(passiveId);

    // If no compatible neighbors exist, generate one NOT_ESTABLISHED row
    if (compatibleRemotes.isEmpty()) {
      return ImmutableList.of(rb.put(COL_ESTABLISHED_STATUS, NOT_ESTABLISHED).build());
    }

    // Find all remote peers that established a session with this peer. Passive peer will not be in
    // establishedBgpTopology at all it was invalid according to bgpConfigPassesSanityChecks()
    Set<BgpPeerConfigId> establishedRemotes =
        establishedTopology.nodes().contains(passiveId)
            ? establishedTopology.adjacentNodes(passiveId)
            : ImmutableSet.of();

    // Compatible remotes exist. Generate a row for each.
    return compatibleRemotes.stream()
        .map(
            remoteId -> {
              BgpSessionProperties sessionProps =
                  configuredTopology.edgeValue(passiveId, remoteId).orElse(null);
              assert sessionProps != null;
              BgpActivePeerConfig activeRemote = nc.getBgpPointToPointPeerConfig(remoteId);
              assert activeRemote != null;
              BgpSessionStatus status =
                  establishedRemotes.contains(remoteId) ? ESTABLISHED : NOT_ESTABLISHED;
              return rb.put(COL_ESTABLISHED_STATUS, status)
                  .put(COL_ADDRESS_FAMILIES, sessionProps.getAddressFamilies())
                  .put(COL_LOCAL_IP, sessionProps.getTailIp())
                  .put(COL_LOCAL_AS, sessionProps.getTailAs())
                  .put(COL_REMOTE_AS, Long.toString(sessionProps.getHeadAs()))
                  .put(COL_REMOTE_NODE, new Node(remoteId.getHostname()))
                  .put(COL_REMOTE_IP, new SelfDescribingObject(Schema.IP, sessionProps.getHeadIp()))
                  .put(COL_SESSION_TYPE, sessionProps.getSessionType())
                  .build();
            })
        .collect(ImmutableList.toImmutableList());
  }
