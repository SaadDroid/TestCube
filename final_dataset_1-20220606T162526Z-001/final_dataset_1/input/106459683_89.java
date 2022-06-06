public static Props props(ActorRef barista) {
        return Props.create(Waiter.class, () -> new Waiter(barista));
    }
