public Optional<V> get() {
        Stack<V> ctx = values.get();
        if (ctx.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(ctx.get(ctx.size() - 1));
        }
    }
