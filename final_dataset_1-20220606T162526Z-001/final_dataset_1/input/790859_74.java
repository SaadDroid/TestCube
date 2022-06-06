@Override
    public void handleMessage(Exchange exchange) throws HandlerException {
        // if no TM is available, there's nothing to do
        if (_transactionManager == null) {
            return;
        }
        
        Property prop = exchange.getContext().getProperty(BEFORE_INVOKED_PROPERTY, Scope.EXCHANGE);
        if (prop != null && Boolean.class.cast(prop.getValue())) {
            // OUT phase in IN_OUT exchange or 2nd invocation in IN_ONLY exchange
            handleAfter(exchange);
        } else {
            exchange.getContext().setProperty(BEFORE_INVOKED_PROPERTY, Boolean.TRUE, Scope.EXCHANGE).addLabels(BehaviorLabel.TRANSIENT.label());
            handleBefore(exchange);
        }
    }
