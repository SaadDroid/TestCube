@Override
    public ProcessItem add(final ProcessItem process) {
        final ProcessEngineClient engineClient = getProcessEngineClient();

        File processFile;
        try {
            processFile = getTenantFolder().getTempFile(process.getAttributes().get(FILE_UPLOAD), getEngineSession().getTenantId());
        } catch (final UnauthorizedFolderException e) {
            throw new APIForbiddenException(e.getMessage());
        } catch (final IOException e) {
            throw new APIException(e);
        }

        final BusinessArchive businessArchive = readBusinessArchive(processFile);
        final ProcessDefinition deployedArchive = engineClient.deploy(businessArchive);
        final ProcessDeploymentInfo processDeploymentInfo = engineClient.getProcessDeploymentInfo(deployedArchive.getId());

        try {
            FormsResourcesUtils.retrieveApplicationFiles(
                    getEngineSession(),
                    processDeploymentInfo.getProcessId(),
                    processDeploymentInfo.getDeploymentDate());
        } catch (final IOException e) {
            throw new APIException("", e);
        } catch (final ProcessDefinitionNotFoundException e) {
            throw new APIException("", e);
        } catch (final BPMEngineException e) {
            throw new APIException("", e);
        }

        return convertEngineToConsoleItem(processDeploymentInfo);
    }
