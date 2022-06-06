ConvertedExperiment convert(final ParticipatingExperiment experiment, String kpi) {
        logConvert(experiment, kpi);

        try {
            Response<ConvertResponse> response = api.convert(experiment.baseExperiment, kpi).execute();

            if (response.isSuccessful()) {
                return new ConvertedExperiment(Sixpack.this, experiment.baseExperiment);
            } else {
                logFailedConversion(experiment.baseExperiment, response.code());
                throw new ConversionError(null, experiment.baseExperiment);
            }
        } catch (RuntimeException | IOException e) {
            logException(experiment.baseExperiment, e);
            throw new ConversionError(e, experiment.baseExperiment);
        }
    }
