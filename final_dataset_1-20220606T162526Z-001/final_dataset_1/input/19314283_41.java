public DiagnosticContextSupplier configureContextSupplier() {
        return correlationIdSupplier.orElse(EMPTY_CONTEXT_SUPPLIER);
    }
