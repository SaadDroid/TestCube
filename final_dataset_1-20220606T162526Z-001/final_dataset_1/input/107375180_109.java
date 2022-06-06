public String getText() {
        return messages.stream()
                .map(Message::getText)
                .collect(Collectors.joining("\n"));
    }
