@Override
    public Tuple<R> apply(final Tuple<R> state, final FO output) {
        if (null == projection) {
            throw new IllegalArgumentException("Projection is required");
        }

        if (null != state) {
            if (1 == projection.length) {
                state.put(projection[0], output);
            } else {
                int i = 0;
                for (final Object obj : (Iterable) output) {
                    state.put(projection[i++], obj);
                }
            }
        }

        return state;
    }
