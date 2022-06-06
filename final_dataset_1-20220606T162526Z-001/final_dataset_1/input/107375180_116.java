public Optional<Severity> getSeverity() {
        return messages.stream()
                .map(Message::getSeverity)
                .max(Comparator.comparing(Severity::ordinal));
    }
