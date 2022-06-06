public List<Encounter> downloadEncountersByPatientUuids(List<String> patientUuids, String activeSetupConfigUuid) throws DownloadEncounterException {
        try {
            String paramSignature = StringUtils.getCommaSeparatedStringFromList(patientUuids);
            Date lastSyncTime = lastSyncTimeService.getLastSyncTimeFor(DOWNLOAD_ENCOUNTERS, paramSignature);
            List<Encounter> encounters = new ArrayList<>();
            List<String> previousPatientsUuid = new ArrayList<>();
            if (hasThisCallHappenedBefore(lastSyncTime)) {
                encounters.addAll(downloadEncounters(patientUuids, lastSyncTime, activeSetupConfigUuid));
            } else {
                //ToDo: Revise this while working on Encounter Delta download
                //previousPatientsUuid = updateEncountersAndReturnPrevPatientUUIDs(patientUuids, encounters, previousPatientsUuid);
                encounters.addAll(downloadEncounters(patientUuids, null, activeSetupConfigUuid));
            }
            LastSyncTime newLastSyncTime = new LastSyncTime(DOWNLOAD_ENCOUNTERS, sntpService.getTimePerDeviceTimeZone(), paramSignature);
            lastSyncTimeService.saveLastSyncTime(newLastSyncTime);
            return encounters;
        } catch (IOException e) {
            throw new DownloadEncounterException(e);
        }
    }
