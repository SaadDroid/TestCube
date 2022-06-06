public List<Observation> downloadObservationsByPatientUuidsAndConceptUuids(List<String> patientUuids, List<String> conceptUuids) throws DownloadObservationException {
        try {
            String paramSignature = buildParamSignature(patientUuids, conceptUuids);
            Date lastSyncTime = lastSyncTimeService.getLastSyncTimeFor(DOWNLOAD_OBSERVATIONS, paramSignature);
            List<Observation> observations = new ArrayList<>();
            if (hasExactCallBeenMadeBefore(lastSyncTime)) {
                observations.addAll(observationService.downloadObservations(patientUuids, conceptUuids, lastSyncTime));
            } else {

                LastSyncTime fullLastSyncTimeInfo = lastSyncTimeService.getFullLastSyncTimeInfoFor(DOWNLOAD_OBSERVATIONS);
                if (isFirstCallToDownloadObservationsEver(fullLastSyncTimeInfo)) {
                    observations.addAll(observationService.downloadObservations(patientUuids, conceptUuids, null));
                } else {
                    String[] parameterSplit = fullLastSyncTimeInfo.getParamSignature().split(UUID_TYPE_SEPARATOR, -1);
                    List<String> knownPatientsUuid = asList(parameterSplit[0].split(UUID_SEPARATOR));
                    List<String> newPatientsUuids = getNewUuids(patientUuids, knownPatientsUuid);
                    List<String> knownConceptsUuid = asList(parameterSplit[1].split(UUID_SEPARATOR));
                    List<String> newConceptsUuids = getNewUuids(conceptUuids, knownConceptsUuid);
                    List<String> allConceptsUuids = getAllUuids(knownConceptsUuid, newConceptsUuids);
                    List<String> allPatientsUuids = getAllUuids(knownPatientsUuid, newPatientsUuids);
                    paramSignature = buildParamSignature(allPatientsUuids, allConceptsUuids);
                    if(newPatientsUuids.size()!=0) {
                        observations = observationService.downloadObservations(newPatientsUuids, allConceptsUuids, null);
                        observations.addAll(observationService.downloadObservations(knownPatientsUuid, newConceptsUuids, null));
                        observations.addAll(observationService.downloadObservations(knownPatientsUuid, knownConceptsUuid, fullLastSyncTimeInfo.getLastSyncDate()));
                    }
                    else{
                        observations.addAll(observationService.downloadObservations(patientUuids, conceptUuids, fullLastSyncTimeInfo.getLastSyncDate()));
                    }
                }
            }
            LastSyncTime newLastSyncTime = new LastSyncTime(DOWNLOAD_OBSERVATIONS, sntpService.getTimePerDeviceTimeZone(), paramSignature);
            lastSyncTimeService.saveLastSyncTime(newLastSyncTime);
            return observations;
        } catch (IOException e) {
            throw new DownloadObservationException(e);
        }
    }
