public Collection<ExternallyAvailableContent> get(final E experiment) {
        return Collections.singleton(
                new ExternallyAvailableContent(
                        makeUri("experiment-design"),
                        ExternallyAvailableContent.Description.create(
                                "icon-experiment-design", "Experiment Design (tsv)"),
                        streamFile(experiment.getAccession() + "-experiment-design.tsv", new Function<Writer, Void>() {
                            @Nullable
                            @Override
                            public Void apply(@Nullable Writer writer) {
                                writeLines(experiment.getAccession(), getAnalysedRowsAccessions(experiment), writer);
                                return null;
                            }
                        })
                )
        );
    }
