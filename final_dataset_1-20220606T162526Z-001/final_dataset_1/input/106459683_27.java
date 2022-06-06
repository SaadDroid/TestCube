public static Props props(FiniteDuration prepareCoffeeDuration) {
        return Props.create(Barista.class, () -> new Barista(prepareCoffeeDuration));
    }
