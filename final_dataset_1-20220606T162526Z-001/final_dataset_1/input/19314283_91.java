@Override
    public void logThrowable(T message, Throwable cause, Object... details) {
        try {
            LogicalLogRecord<T> record = constructLogRecord(message, Optional.of(cause), details);
            publish(record);
        } catch (Throwable t) {
            errorHandler.accept(t);
        }
    }
