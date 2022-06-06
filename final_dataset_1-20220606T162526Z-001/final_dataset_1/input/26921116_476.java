public <T> void update(T[][] observations, int iterations, ToIntFunction<T> ordinal) {
        update(
                Arrays.stream(observations)
                        .map(sequence -> Arrays.stream(sequence).mapToInt(symbol -> ordinal.applyAsInt(symbol)).toArray())
                        .toArray(int[][]::new),
                iterations);
    }
