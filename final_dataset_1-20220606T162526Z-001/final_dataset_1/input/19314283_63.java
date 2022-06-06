@Override
    public void log(T message, Object... details) {
        try {

            DiagnosticContext diagnosticContext = new DiagnosticContext(diagnosticContextSupplier);
            LogicalLogRecord<T> record = new LogicalLogRecord<>(clock.instant(), diagnosticContext, message, Optional.empty(), details);
            transferQueue.put(Optional.of(record));
        } catch (Throwable t) {
            errorHandler.accept(t);
        }
    }
