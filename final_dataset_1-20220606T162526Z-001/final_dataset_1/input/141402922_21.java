private Presence(Function<T, ?> toBePresent) {
        super("Presence of " + (isLoggable(toBePresent) ? toBePresent.toString() : "<not described value>"),
                o -> ofNullable(o)
                        .map(o1 -> {
                            Class<?> clazz = o1.getClass();

                            if (Boolean.class.isAssignableFrom(clazz)) {
                                return (Boolean) o1;
                            }

                            if (Iterable.class.isAssignableFrom(clazz)) {
                                return Iterables.size((Iterable) o1) > 0;
                            }

                            if (clazz.isArray()) {
                                return Array.getLength(o1) > 0;
                            }
                            return true;
                        })
                        .orElse(false));

        StepFunction<T, ?> expectedToBePresent;
        if (StepFunction.class.isAssignableFrom(toBePresent.getClass())) {
            expectedToBePresent = ((StepFunction<T, ?>) toBePresent);
        } else {
            expectedToBePresent = new StepFunction<>(isLoggable(toBePresent) ?
                    toBePresent.toString() :
                    "<not described value>",
                    toBePresent);
        }
        from(expectedToBePresent.turnReportingOff());
    }
