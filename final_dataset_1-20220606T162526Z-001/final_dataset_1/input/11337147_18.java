@Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {

        final String filePath = request.getParameter(FILE_PATH_PARAM);
        String fileName = request.getParameter(FILE_NAME_PARAM);
        final String resourcePath = request.getParameter(RESOURCE_FILE_NAME_PARAM);
        final String documentId = request.getParameter(DOCUMENT_ID_PARAM);
        String contentStorageId = request.getParameter(CONTENT_STORAGE_ID_PARAM);
        final APISession apiSession = (APISession) request.getSession().getAttribute(API_SESSION_PARAM_KEY);
        byte[] fileContent = null;
        if (filePath != null) {
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.log(Level.FINE, "attachmentPath: " + filePath);
            }
            final BonitaHomeFolderAccessor tempFolderAccessor = new BonitaHomeFolderAccessor();
            try {
                final File file = tempFolderAccessor.getTempFile(FilenameUtils.separatorsToSystem(filePath), apiSession.getTenantId());
                if (fileName == null) {
                    fileName = file.getName();
                }
                fileContent = getFileContent(file, filePath);
            } catch (final UnauthorizedFolderException e) {
                throw new ServletException(e.getMessage());
            } catch (final IOException e) {
                throw new ServletException(e);
            }
        } else if (fileName != null && contentStorageId != null) {
            try {
                fileContent = bpmEngineAPIUtil.getProcessAPI(apiSession).getDocumentContent(contentStorageId);
            } catch (final Exception e) {
                final String errorMessage = "Error while retrieving the document  with content storage ID " + contentStorageId + " from the engine.";
                if (LOGGER.isLoggable(Level.SEVERE)) {
                    LOGGER.log(Level.SEVERE, errorMessage, e);
                }
                throw new ServletException(errorMessage, e);
            }
        } else if (documentId != null) {
            try {
                final ProcessAPI processAPI = bpmEngineAPIUtil.getProcessAPI(apiSession);
                try {
                    final Document document = processAPI.getDocument(Long.valueOf(documentId));
                    fileName = document.getContentFileName();
                    contentStorageId = document.getContentStorageId();
                } catch (final DocumentNotFoundException dnfe) {
                    final ArchivedDocument archivedDocument = processAPI.getArchivedVersionOfProcessDocument(Long.valueOf(documentId));
                    fileName = archivedDocument.getDocumentContentFileName();
                    contentStorageId = archivedDocument.getContentStorageId();
                }
                if (contentStorageId != null && !contentStorageId.isEmpty()) {
                    fileContent = processAPI.getDocumentContent(contentStorageId);
                }
            } catch (final Exception e) {
                final String errorMessage = "Error while retrieving the document  with ID " + documentId + " from the engine.";
                if (LOGGER.isLoggable(Level.SEVERE)) {
                    LOGGER.log(Level.SEVERE, errorMessage, e);
                }
                throw new ServletException(errorMessage, e);
            }
        } else if (resourcePath != null) {
            final String processIDStr = request.getParameter(PROCESS_ID_PARAM);
            final String instanceIDStr = request.getParameter(INSTANCE_ID_PARAM);
            final String taskIdStr = request.getParameter(TASK_ID_PARAM);
            final IFormWorkflowAPI workflowAPI = FormAPIFactory.getFormWorkflowAPI();
            long processDefinitionID = -1;
            try {
                if (processIDStr != null) {
                    processDefinitionID = Long.parseLong(processIDStr);
                } else if (taskIdStr != null) {
                    processDefinitionID = workflowAPI.getProcessDefinitionIDFromActivityInstanceID(apiSession, Long.parseLong(taskIdStr));
                } else if (instanceIDStr != null) {
                    processDefinitionID = workflowAPI.getProcessDefinitionIDFromProcessInstanceID(apiSession, Long.parseLong(instanceIDStr));
                } else {
                    final String errorMessage = "Error while retrieving the resource " + resourcePath
                            + " : Either a process, instance or task is required in the URL";
                    if (LOGGER.isLoggable(Level.SEVERE)) {
                        LOGGER.log(Level.SEVERE, errorMessage);
                    }
                    throw new ServletException(errorMessage);
                }
                Date processDeployementDate = workflowAPI.getMigrationDate(apiSession, processDefinitionID);
                if (processDeployementDate == null) {
                    processDeployementDate = workflowAPI.getProcessDefinitionDate(apiSession, processDefinitionID);
                }
                final File processDir = FormsResourcesUtils.getApplicationResourceDir(apiSession, processDefinitionID, processDeployementDate);
                final File resource = new File(processDir, BUSINESS_ARCHIVE_RESOURCES_DIRECTORY + File.separator + resourcePath);
                if (resource.exists()) {
                    fileName = resource.getName();
                    fileContent = getFileContent(resource, filePath);
                } else {
                    final String errorMessage = "The target resource does not exist " + resource.getAbsolutePath();
                    if (LOGGER.isLoggable(Level.SEVERE)) {
                        LOGGER.log(Level.SEVERE, errorMessage);
                    }
                    throw new IOException(errorMessage);
                }
            } catch (final Exception e) {
                final String errorMessage = "Error while retrieving the resource " + resourcePath;
                if (LOGGER.isLoggable(Level.SEVERE)) {
                    LOGGER.log(Level.SEVERE, errorMessage, e);
                }
                throw new ServletException(errorMessage, e);
            }
        } else {
            final String errorMessage = "Error while getting the file. either a document, a filePath or a resourcePath parameter is required.";
            if (LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE, errorMessage);
            }
            throw new ServletException(errorMessage);
        }
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("UTF-8");
        try {
            final String encodedfileName = URLEncoder.encode(fileName, "UTF-8");
            final String userAgent = request.getHeader("User-Agent");
            if (userAgent != null && userAgent.contains("Firefox")) {
                response.setHeader("Content-Disposition", "attachment; filename*=UTF-8''" + encodedfileName.replace("+", "%20"));
            } else {
                response.setHeader("Content-Disposition", "attachment; filename=\"" + encodedfileName.replaceAll("\\+", " ") + "\"; filename*=UTF-8''"
                        + encodedfileName.replace("+", "%20"));
            }
            final OutputStream out = response.getOutputStream();
            if (fileContent == null) {
                response.setContentLength(0);
            } else {
                response.setContentLength(fileContent.length);
                out.write(fileContent);
            }
            out.close();
        } catch (final IOException e) {
            if (LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE, "Error while generating the response.", e);
            }
            throw new ServletException(e);
        }
    }
