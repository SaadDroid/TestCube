public MessageList sortBySeverity() {
        return messages.stream()
                .sorted(Comparator.comparing(Message::getSeverity).reversed())
                .collect(collector());
    }
