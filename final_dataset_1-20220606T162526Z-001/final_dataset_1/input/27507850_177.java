@VisibleForTesting
  void forwardOutInterface(
      Interface outgoingInterface, Ip nextHopIp, @Nullable Ip overriddenNextHopIp) {
    // Apply preSourceNatOutgoingFilter
    if (applyFilter(
            outgoingInterface.getPreTransformationOutgoingFilter(),
            PRE_TRANSFORMATION_EGRESS_FILTER)
        == DENIED) {
      return;
    }

    applyTransformation(outgoingInterface.getOutgoingTransformation());

    // apply outgoing filter
    if (applyFilter(outgoingInterface.getOutgoingFilter(), EGRESS_FILTER) == DENIED) {
      return;
    }

    // apply outgoing filter matching original flow
    if (applyFilterToOriginalFlow(
            outgoingInterface.getOutgoingOriginalFlowFilter(), EGRESS_ORIGINAL_FLOW_FILTER)
        == DENIED) {
      return;
    }

    // setup session if necessary
    FirewallSessionInterfaceInfo firewallSessionInterfaceInfo =
        outgoingInterface.getFirewallSessionInterfaceInfo();
    if (firewallSessionInterfaceInfo != null) {
      @Nullable
      FirewallSessionTraceInfo session =
          buildFirewallSessionTraceInfo(firewallSessionInterfaceInfo);
      if (session != null) {
        _newSessions.add(session);
        _steps.add(
            new SetupSessionStep(
                SetupSessionStepDetail.builder()
                    .setSessionScope(session.getSessionScope())
                    .setMatchCriteria(session.getMatchCriteria())
                    .setSessionAction(session.getAction())
                    .setTransformation(returnFlowDiffs(_originalFlow, _currentFlow))
                    .build()));
      }
    }

    String currentNodeName = _currentNode.getName();
    String outgoingIfaceName = outgoingInterface.getName();

    // add ExitOutputIfaceStep
    _steps.add(buildExitOutputIfaceStep(outgoingIfaceName));

    SortedSet<NodeInterfacePair> neighborIfaces =
        _tracerouteContext.getInterfaceNeighbors(currentNodeName, outgoingIfaceName);
    /*
    Special handling is necessary if ARP IP was overridden.
    Consider the following: dst IP: 2.2.2.2, NH was overridden to 1.1.1.1 and matched a connected route 1.1.1.0/24, for "iface0"
    Since the FIB entry has no ARP IP (because connected route) we'd normally compute disposition for the dest IP (2.2.2.2)
    However, nothing in forwarding analysis says 2.2.2.2 has a valid disposition for "iface0":
      - there is no route for 2.2.2.2 there,
      - it's not in the subnet of "iface0",
      - nobody will ARP reply for it as far as we know.
    To simplify our life, just compute disposition for 1.1.1.1, at least that's guaranteed to give us a disposition
    */
    if (neighborIfaces.isEmpty()) {
      Ip arpIp = firstNonNull(overriddenNextHopIp, _currentFlow.getDstIp());
      FlowDisposition disposition =
          _tracerouteContext.computeDisposition(currentNodeName, outgoingIfaceName, arpIp);
      buildArpFailureTrace(outgoingIfaceName, arpIp, disposition);
    } else {
      processOutgoingInterfaceEdges(
          outgoingIfaceName, firstNonNull(overriddenNextHopIp, nextHopIp), neighborIfaces);
    }
  }
