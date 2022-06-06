ParticipatingExperiment participate(final Experiment experiment) {
        logParticipate(experiment);

        try {
            Response<ParticipateResponse> response = api.participate(experiment,
                    new ArrayList<>(experiment.alternatives),
                    experiment.forcedChoice,
                    experiment.trafficFraction,
                    null
            ).execute();

            if (response.isSuccessful()) {
                return new ParticipatingExperiment(Sixpack.this, experiment, response.body().getSelectedAlternative());
            } else {
                return getControlParticipation(experiment);
            }
        } catch (RuntimeException | IOException e) {
            logException(experiment, e);
            return getControlParticipation(experiment);
        }
    }
