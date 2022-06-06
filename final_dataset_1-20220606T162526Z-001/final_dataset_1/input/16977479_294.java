public static boolean isFault(Message message) {
        return message != null
               && message.getExchange() != null
               && (message == message.getExchange().getInFaultMessage()
                   || message == message.getExchange().getOutFaultMessage());
    }
