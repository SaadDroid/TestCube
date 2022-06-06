@Override
    public void run() {
        log.debug("Starting drift detection...");
        long startTime = System.currentTimeMillis();
        DriftDetectionSchedule schedule;
        while((schedule = scheduleQueue.getNextSchedule()) != null) {
            boolean updateSchedule = true;
            try {
                if (log.isDebugEnabled()) {
                    log.debug("Fetching next schedule from " + scheduleQueue);
                    log.debug("Processing " + schedule);
                }
                if (schedule.getNextScan() > (System.currentTimeMillis() + 100L)) {
                    if (log.isDebugEnabled()) {
                        log.debug("Skipping " + schedule + " because it is too early to do the next detection.");
                    }
                    updateSchedule = false;
                    break; // We're done, rest of the queue is not scheduled yet
                }

                if (!schedule.getDriftDefinition().isEnabled()) {
                    if (log.isDebugEnabled()) {
                        log.debug("Skipping " + schedule + " because the drift definition is disabled.");
                    }
                    updateSchedule = false;
                    break; // We're done, rest of the queue is disabled only
                }

                if (previousSnapshotExists(schedule)) {
                    if (log.isDebugEnabled()) {
                        log.debug("Skipping " + schedule + " because server has not yet acked previous change set");
                    }
                    continue;
                }

                DriftDetectionSummary detectionSummary = new DriftDetectionSummary();
                detectionSummary.setSchedule(schedule);
                try {
                    if (changeSetMgr.changeSetExists(schedule.getResourceId(), createHeaders(schedule, COVERAGE, 0))) {
                        detectionSummary.setType(DRIFT);
                        generateDriftChangeSet(detectionSummary);
                    } else {
                        detectionSummary.setType(COVERAGE);
                        generateSnapshot(detectionSummary);
                    }

                    if (!detectionSummary.isBaseDirExists()) {
                        driftClient.reportMissingBaseDir(schedule.getResourceId(), schedule.getDriftDefinition());
                    } else if (detectionSummary.isRepeat()) {
                        driftClient.repeatChangeSet(schedule.getResourceId(), schedule.getDriftDefinition().getName(),
                                detectionSummary.getVersion());
                    } else if (changesNeedToBeReported(detectionSummary)) {
                        driftClient.sendChangeSetToServer(detectionSummary);
                    }
                } catch (IOException e) {
                    log.error("Drift detection failed: " + e.getMessage(), e);
                    revertSnapshot(detectionSummary);
                } catch (RuntimeException e) {
                    log.error("Drift detection failed: " + e.getMessage(), e);
                    revertSnapshot(detectionSummary);
                }
            } catch (Throwable t) {
                Throwable cause = t.getCause();
                String message = (null != cause) ? cause.getMessage() : t.getMessage();
                log.error("An unexpected error occurred during drift detection: " + message, t);

            } finally {
                try {
                    scheduleQueue.deactivateSchedule(updateSchedule);
                } catch (Throwable t) {
                    Throwable cause = t.getCause();
                    String message = (null != cause) ? cause.getMessage() : t.getMessage();
                    log.error("An unexpected error occurred while deactivating schedule: " + message, t);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        log.debug("Finished drift detection in " + (endTime - startTime) + " ms");
    }
