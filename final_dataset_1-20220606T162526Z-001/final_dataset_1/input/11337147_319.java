@Override
    public ImportStatusMessages importFileContent(final byte[] fileContent, final String importPolicyAsString) throws ExecutionException, ImportException, AlreadyExistsException, InvalidSessionException, BonitaHomeNotSetException, ServerAPIException, UnknownAPITypeException {
        final ApplicationImportPolicy importPolicy = ApplicationImportPolicy.valueOf(importPolicyAsString);
        final List<ImportStatus> ImportStatusList = getApplicationAPI().importApplications(fileContent, importPolicy);
        return new ImportStatusMessages(ImportStatusList);
    }
