public void handleMessage(Message message) throws Fault {
        BindingOperationInfo boi = message.getExchange().getBindingOperationInfo();
        MessageInfo mi;
        BindingMessageInfo bmi;
        if (isRequestor(message)) {
            mi = boi.getOperationInfo().getInput();
            bmi = boi.getInput();
        } else {
            mi = boi.getOperationInfo().getOutput();
            bmi = boi.getOutput();
        }
        XMLBindingMessageFormat xmf = bmi.getExtensor(XMLBindingMessageFormat.class);
        QName rootInModel = null;
        if (xmf != null) {
            rootInModel = xmf.getRootNode();
        }
        final int mpn = mi.getMessagePartsNumber();
        if (boi.isUnwrapped()
            || mpn == 1) {
            // wrapper out interceptor created the wrapper
            // or if bare-one-param
            new BareOutInterceptor().handleMessage(message);
        } else {
            if (rootInModel == null) {
                rootInModel = boi.getName();
            }
            if (mpn == 0 && !boi.isUnwrapped()) {
                // write empty operation qname
                writeMessage(message, rootInModel, false);
            } else {
                // multi param, bare mode, needs write root node
                writeMessage(message, rootInModel, true);
            }
        }
        // in the end we do flush ;)
        XMLStreamWriter writer = message.getContent(XMLStreamWriter.class);
        try {
            writer.flush();
        } catch (XMLStreamException e) {
            throw new Fault(new org.apache.cxf.common.i18n.Message("STAX_WRITE_EXC", BUNDLE, e));
        }
    }
