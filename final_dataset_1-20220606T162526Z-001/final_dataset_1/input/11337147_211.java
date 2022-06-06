@Override
    protected void setUploadSizeMax(final ServletFileUpload serviceFileUpload, final HttpServletRequest request) {
        serviceFileUpload.setFileSizeMax(getConsoleProperties(getAPISession(request).getTenantId()).getMaxSize() * MEGABYTE);
    }
