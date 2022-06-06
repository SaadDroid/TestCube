public static boolean isOutbound(Message message) {
        return message != null
               && message.getExchange() != null
               && (message == message.getExchange().getOutMessage()
                   || message == message.getExchange().getOutFaultMessage());
    }
