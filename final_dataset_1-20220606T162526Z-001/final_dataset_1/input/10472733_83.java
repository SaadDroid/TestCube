public List<Form> downloadAllForms() throws FormFetchException {
        try {
            Date lastSyncDate = lastSyncTimeService.getLastSyncTimeFor(APIName.DOWNLOAD_FORMS);
            List<Form> forms = formService.downloadFormsByName(StringUtils.EMPTY, lastSyncDate);
            LastSyncTime lastSyncTime = new LastSyncTime(APIName.DOWNLOAD_FORMS, sntpService.getTimePerDeviceTimeZone());
            lastSyncTimeService.saveLastSyncTime(lastSyncTime);
            return forms;
        } catch (IOException e) {
            throw new FormFetchException(e);
        }
    }
