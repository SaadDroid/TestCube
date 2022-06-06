static Set<TestTime> findObsoleteTests(Collection<TestTime> testTimes) {
        Optional<Instant> maybeAverage = calculateAverageLastUpdatedTime(testTimes);
        if(!maybeAverage.isPresent()) {
            return Collections.emptySet();
        }

        Instant averageLastUpdated = maybeAverage.get();

        return testTimes.stream()
                .filter(t -> isTestOlderThanAverage(averageLastUpdated, t))
                .collect(Collectors.toSet());

    }
