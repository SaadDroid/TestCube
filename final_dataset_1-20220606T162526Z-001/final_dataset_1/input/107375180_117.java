public static Builder builder(String text, Severity severity) {
        Objects.requireNonNull(text, "text must not be null");
        Objects.requireNonNull(severity, "severity must not be null");

        return new Builder(text, severity);
    }
