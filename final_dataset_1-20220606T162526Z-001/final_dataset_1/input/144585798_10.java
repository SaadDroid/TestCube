public final TemporalFunction<N> with(TemporalAdjuster adjuster) {
        return temporalFunction(withMetadata(metadata, adjuster.getMetadata()), (model,
                context) -> value(model, context).map(v -> withFunction(adjuster.getAdjuster()).apply(v)));
    }
