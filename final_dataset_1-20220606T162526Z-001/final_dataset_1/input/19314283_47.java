public <T extends Enum<T> & LogMessage> Destination<T> configureDestination() throws UncheckedIOException {
        try {
            StackTraceProcessor stackTraceProcessor = this.configureStackTraceProcessor();
            if (logfilePath.isPresent()) {
                if (!Files.isSymbolicLink(logfilePath.get().getParent())) {
                    Files.createDirectories(logfilePath.get().getParent());
                }
                FileChannelProvider provider = new FileChannelProvider(logfilePath.get());
                ActiveRotationRegistry registry = ActiveRotationRegistry.getSingletonInstance();
                return registry.add(new PathDestination<>(provider, stackTraceProcessor, registry));
            }
            return new OutputStreamDestination<>(loggerOutput.orElse(System.out), stackTraceProcessor);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
