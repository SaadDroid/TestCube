public static RMProperties retrieveRMProperties(Message message, boolean outbound) {
        if (outbound) {
            return (RMProperties)message.get(getRMPropertiesKey(true));
        }
        Message m = null;
        if (MessageUtils.isOutbound(message)) {
            // the in properties are only available on the in message
            m = message.getExchange().getInMessage();
            if (null == m) {
                m = message.getExchange().getInFaultMessage();
            }
        } else {
            m = message;
        }
        if (null != m) {
            return (RMProperties)m.get(getRMPropertiesKey(false));
        }
        return null;

    }
