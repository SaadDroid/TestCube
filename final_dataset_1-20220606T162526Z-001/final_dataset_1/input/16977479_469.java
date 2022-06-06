public void handleMessage(Message message) {
        if (isGET(message) && message.getContent(List.class) != null) {
            LOG.fine("DocLiteralInInterceptor skipped in HTTP GET method");
            return;
        }

        DepthXMLStreamReader xmlReader = getXMLStreamReader(message);
        MessageContentsList parameters = new MessageContentsList();

        Exchange exchange = message.getExchange();
        BindingOperationInfo bop = exchange.getBindingOperationInfo();

        boolean client = isRequestor(message);

        //if body is empty and we have BindingOperationInfo, we do not need to match
        //operation anymore, just return
        if (bop != null && !StaxUtils.toNextElement(xmlReader)) {
            // body may be empty for partial response to decoupled request
            return;
        }

        Service service = ServiceModelUtil.getService(message.getExchange());
        bop = getBindingOperationInfo(xmlReader, exchange, bop, client);
        boolean forceDocLitBare = false;
        if (bop != null && bop.getBinding() != null) {
            forceDocLitBare = Boolean.TRUE.equals(bop.getBinding().getService().getProperty("soap.force.doclit.bare"));
        }
        DataReader<XMLStreamReader> dr = getDataReader(message);

        try {
            if (!forceDocLitBare && bop != null && bop.isUnwrappedCapable()) {
                ServiceInfo si = bop.getBinding().getService();
                // Wrapped case
                MessageInfo msgInfo = setMessage(message, bop, client, si);
                setDataReaderValidation(service, message, dr);

                // Determine if we should keep the parameters wrapper
                if (shouldWrapParameters(msgInfo, message)) {
                    QName startQName = xmlReader.getName();
                    MessagePartInfo mpi = msgInfo.getFirstMessagePart();
                    if (!mpi.getConcreteName().equals(startQName)) {
                        throw new Fault("UNEXPECTED_WRAPPER_ELEMENT", LOG, null, startQName,
                                        mpi.getConcreteName());
                    }
                    Object wrappedObject = dr.read(mpi, xmlReader);
                    parameters.put(mpi, wrappedObject);
                } else {
                    // Unwrap each part individually if we don't have a wrapper

                    bop = bop.getUnwrappedOperation();

                    msgInfo = setMessage(message, bop, client, si);
                    List<MessagePartInfo> messageParts = msgInfo.getMessageParts();
                    Iterator<MessagePartInfo> itr = messageParts.iterator();

                    // advance just past the wrapped element so we don't get
                    // stuck
                    if (xmlReader.getEventType() == XMLStreamConstants.START_ELEMENT) {
                        StaxUtils.nextEvent(xmlReader);
                    }

                    // loop through each child element
                    getPara(xmlReader, dr, parameters, itr, message);
                }

            } else {
                //Bare style
                BindingMessageInfo msgInfo = null;


                Endpoint ep = exchange.getEndpoint();
                ServiceInfo si = ep.getEndpointInfo().getService();
                if (bop != null) { //for xml binding or client side
                    if (client) {
                        msgInfo = bop.getOutput();
                    } else {
                        msgInfo = bop.getInput();
                        if (bop.getOutput() == null) {
                            exchange.setOneWay(true);
                        }
                    }
                    if (msgInfo == null) {
                        return;
                    }
                    setMessage(message, bop, client, si, msgInfo.getMessageInfo());
                }

                Collection<OperationInfo> operations = null;
                operations = new ArrayList<>();
                operations.addAll(si.getInterface().getOperations());

                if (xmlReader == null || !StaxUtils.toNextElement(xmlReader)) {
                    // empty input
                    getBindingOperationForEmptyBody(operations, ep, exchange);
                    return;
                }

                setDataReaderValidation(service, message, dr);

                int paramNum = 0;

                do {
                    QName elName = xmlReader.getName();
                    Object o = null;

                    MessagePartInfo p;
                    if (!client && msgInfo != null && msgInfo.getMessageParts() != null
                        && msgInfo.getMessageParts().isEmpty()) {
                        //no input messagePartInfo
                        return;
                    }

                    if (msgInfo != null && msgInfo.getMessageParts() != null
                        && msgInfo.getMessageParts().size() > 0) {
                        if (msgInfo.getMessageParts().size() > paramNum) {
                            p = msgInfo.getMessageParts().get(paramNum);
                        } else {
                            p = null;
                        }
                    } else {
                        p = findMessagePart(exchange, operations, elName, client, paramNum, message);
                    }

                    if (!forceDocLitBare) {
                        //Make sure the elName found on the wire is actually OK for
                        //the purpose we need it
                        validatePart(p, elName, message);
                    }

                    o = dr.read(p, xmlReader);
                    if (forceDocLitBare && parameters.isEmpty()) {
                        // webservice provider does not need to ensure size
                        parameters.add(o);
                    } else {
                        parameters.put(p, o);
                    }

                    paramNum++;
                    if (message.getContent(XMLStreamReader.class) == null || o == xmlReader) {
                        xmlReader = null;
                    }
                } while (xmlReader != null && StaxUtils.toNextElement(xmlReader));

            }

            message.setContent(List.class, parameters);
        } catch (Fault f) {
            if (!isRequestor(message)) {
                f.setFaultCode(Fault.FAULT_CODE_CLIENT);
            }
            throw f;
        }
    }
