@Nonnull
    public DropFlux withFunction(@Nonnull final String function) {

        Arguments.checkNonEmpty(function, "Function");

        this.withFunction("fn: (column)", function);

        return this;
    }
