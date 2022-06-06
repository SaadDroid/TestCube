public static Collector<Message, ?, MessageList> toMessageList() {
        return Collector.of(MessageList::new, MessageList::add, addAll());
    }
