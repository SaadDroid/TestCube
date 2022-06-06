protected void handle(Message message) throws SequenceFault, RMException {
        LOG.entering(getClass().getName(), "handleMessage");

        boolean isServer = RMContextUtils.isServerSide(message);
        LOG.fine("isServerSide: " + isServer);

        RMProperties rmps = RMContextUtils.retrieveRMProperties(message, false);
        // message addressing properties may be null, e.g. in case of a runtime fault
        // on the server side
        final AddressingProperties maps = ContextUtils.retrieveMAPs(message, false, false, false);
        if (null == maps) {
            //if wsrmp:RMAssertion and addressing is optional
            if (isServer && !isRMPolicyEnabled(message)) {
                org.apache.cxf.common.i18n.Message msg = new org.apache.cxf.common.i18n.Message(
                    "WSA_REQUIRED_EXC", LOG);
                LOG.log(Level.INFO, msg.toString());
                throw new RMException(msg);
            }
            return;
        }

        String action = null;
        if (null != maps.getAction()) {
            action = maps.getAction().getValue();
        }

        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Action: " + action);
        }

        // RM does not apply to WS-Trust messages, as used by WS-SecureConversation
        if (action != null && action.contains("/RST/SCT")
            && (action.startsWith(STSUtils.WST_NS_05_02) || action.startsWith(STSUtils.WST_NS_05_12))) {
            return;
        }

        Object originalRequestor = message.get(RMMessageConstants.ORIGINAL_REQUESTOR_ROLE);
        if (null != originalRequestor) {
            LOG.fine("Restoring original requestor role to: " + originalRequestor);
            message.put(Message.REQUESTOR_ROLE, originalRequestor);
        }

        // get the wsa and wsrm namespaces from the message
        String rmUri = rmps.getNamespaceURI();
        String addrUri = maps.getNamespaceURI();

        ProtocolVariation protocol = ProtocolVariation.findVariant(rmUri, addrUri);
        if (null == protocol && !MessageUtils.isFault(message)) {
            org.apache.cxf.common.i18n.Message msg = new org.apache.cxf.common.i18n.Message(
                "WSRM_REQUIRED_EXC", LOG, rmUri, addrUri);
            LOG.log(Level.INFO, msg.toString());
            throw new RMException(msg);
        }
        RMContextUtils.setProtocolVariation(message, protocol);

        boolean isApplicationMessage = !RMContextUtils.isRMProtocolMessage(action);
        LOG.fine("isApplicationMessage: " + isApplicationMessage);

        // for application AND out of band messages

        RMEndpoint rme = getManager().getReliableEndpoint(message);
        Destination destination = getManager().getDestination(message);

        assertReliability(message);
        if (isApplicationMessage) {
            if (null != rmps) {
                processAcknowledgments(rme, rmps, protocol);
                processAcknowledgmentRequests(destination, message);
                processSequence(destination, message);
                processDeliveryAssurance(rmps);
            }
            if (ContextUtils.retrieveDeferredUncorrelatedMessageAbort(message)) {
                LOG.info("deferred uncorrelated message abort");
                message.getInterceptorChain().abort();
            } else {
                rme.receivedApplicationMessage();
            }
        } else {
            // in case message is not an application message, release SAVED_CONTENT
            // otherwise tmp files will not be closed
            CachedOutputStream cos = (CachedOutputStream)message.get(RMMessageConstants.SAVED_CONTENT);
            if (null != cos) {
                cos.releaseTempFileHold();
            }
            rme.receivedControlMessage();
            if (RM10Constants.SEQUENCE_ACKNOWLEDGMENT_ACTION.equals(action)
                || RM11Constants.SEQUENCE_ACKNOWLEDGMENT_ACTION.equals(action)) {
                processAcknowledgments(rme, rmps, protocol);
            } else if (RM10Constants.CLOSE_SEQUENCE_ACTION.equals(action)) {
                // RM10 out-of-band CloseSequence/lastMessage is a special case; RM11 needs no special handling
                processSequence(destination, message);
            } else if ((RM10Constants.CREATE_SEQUENCE_ACTION.equals(action)
                || RM11Constants.CREATE_SEQUENCE_ACTION.equals(action)) && !isServer) {
                LOG.fine("Processing inbound CreateSequence on client side.");
                Servant servant = rme.getServant();
                Object csr = servant.createSequence(message);
                Proxy proxy = rme.getProxy();
                proxy.createSequenceResponse(csr, protocol);
                return;
            }
        }
    }
