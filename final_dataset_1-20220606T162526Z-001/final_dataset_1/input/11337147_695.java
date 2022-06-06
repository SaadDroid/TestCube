public String getCompleteTempFilePath(final String path) throws IOException {
        return bonitaHomeFolderAccessor.getCompleteTempFilePath(path, apiSession.getTenantId());
    }
