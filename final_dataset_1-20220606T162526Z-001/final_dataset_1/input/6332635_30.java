public void handle(Exchange exc) {
        if (exc.getNodeExceptions() != null) {
            for (int i = 0; i < exc.getDestinations().size(); i++) {
                if (exc.getNodeExceptions()[i] != null) {
                    //setNodeDown(exc, i);
                    handleNodeException(exc, i);
                }
            }
        }
        if (exc.getNodeStatusCodes() != null) {
            for (int i = 0; i < exc.getDestinations().size(); i++) {
                if (exc.getNodeStatusCodes()[i] != 0) {
                    int status = exc.getNodeStatusCodes()[i];
                    if (status >= 400 && status < 600) {
                        //setNodeDown(exc, i);
                        handleNodeBadStatusCode(exc, i);
                    }
                }
            }
        }
    }
