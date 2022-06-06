@CheckReturnValue
    @Nonnull
    public static DummyException throwAnyway(Throwable t) {
        if (t instanceof Error) {
            throw (Error) t;
        }

        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        }

        if (t instanceof IOException) {
            throw new UncheckedIOException((IOException) t);
        }

        if (t instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }

        if (t instanceof InvocationTargetException) {
            throw throwAnyway(t.getCause());
        }

        throwEvadingChecks(t);

        // never reached
        return null;
    }
