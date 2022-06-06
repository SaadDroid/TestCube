public Continuation getContinuation() {
        Message m = inMessage;
        // Get the real message which is used in the interceptor chain
        if (m != null && m.getExchange() != null && m.getExchange().getInMessage() != null) {
            m = m.getExchange().getInMessage();
        }
        if (m == null || m.getExchange() == null || m.getExchange().isOneWay()) {
            return null;
        }
        JMSContinuation cw = m.get(JMSContinuation.class);
        if (cw == null) {
            cw = new JMSContinuation(bus, m,  incomingObserver, suspendendContinuations);
            m.put(JMSContinuation.class, cw);
        }
        return cw;


    }
