public static FlowBuilder createClassifierRelayFlow(String flowKey, SfcNshHeader sfcNshHeader) {
        if ((flowKey == null) || (sfcNshHeader == null) || (sfcNshHeader.getVxlanIpDst()==null)) {
            return null;
        }

        MatchBuilder mb = SfcOpenflowUtils.getNshMatches(sfcNshHeader.getNshNsp(), sfcNshHeader.getNshEndNsi());

        String dstIp = sfcNshHeader.getVxlanIpDst().getValue();
        List<Action> theActions = new ArrayList<Action>() {{
            int order = 0;
            add(SfcOpenflowUtils.createActionNxLoadTunGpeNp(TUN_GPE_NP_NSH, order++));
            add(SfcOpenflowUtils.createActionNxSetTunIpv4Dst(dstIp, order++));
            add(SfcOpenflowUtils.createActionNxMoveNsp(order++));
            add(SfcOpenflowUtils.createActionNxMoveNsi(order++));
            add(SfcOpenflowUtils.createActionNxMoveNsc1(order++));
            add(SfcOpenflowUtils.createActionNxMoveNsc2(order++));
            add(SfcOpenflowUtils.createActionOutPort(OutputPortValues.INPORT.toString(), order++));
        }};

        InstructionsBuilder isb = SfcOpenflowUtils.wrapActionsIntoApplyActionsInstruction(theActions);
        FlowBuilder flowb = new FlowBuilder();
        flowb.setId(new FlowId(flowKey))
            .setTableId(TABLE_INDEX_CLASSIFIER)
            .setKey(new FlowKey(new FlowId(flowKey)))
            .setPriority(FLOW_PRIORITY_CLASSIFIER)
            .setMatch(mb.build())
            .setInstructions(isb.build());
        return flowb;
    }
