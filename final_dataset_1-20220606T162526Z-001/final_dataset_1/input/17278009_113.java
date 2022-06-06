@Override
    public BundleDeployResult deployBundle(final BundleDeployRequest request) {
        BundleDeployResult result = new BundleDeployResult();
        try {
            BundleResourceDeployment resourceDeployment = request.getResourceDeployment();
            BundleDeployment bundleDeployment = resourceDeployment.getBundleDeployment();
            BundleVersion bundleVersion = bundleDeployment.getBundleVersion();

            String recipe = bundleVersion.getRecipe();
            File recipeFile = File.createTempFile("ant-bundle-recipe", ".xml", request.getBundleFilesLocation());
            File logFile = File.createTempFile("ant-bundle-recipe", ".log", this.tmpDirectory);
            PrintWriter logFileOutput = null;
            try {
                // Open the log file for writing.
                logFileOutput = new PrintWriter(new FileOutputStream(logFile, true));

                // Store the recipe in the tmp recipe file.
                ByteArrayInputStream in = new ByteArrayInputStream(recipe.getBytes());
                FileOutputStream out = new FileOutputStream(recipeFile);
                StreamUtil.copy(in, out);

                // Get the bundle's configuration values and the global system facts and
                // add them as Ant properties so the Ant script can get their values.
                Properties antProps = createAntProperties(request);
                // TODO: Eventually the phase to be executed should be passed in by the PC when it calls us.
                // TODO: Invoke STOP phase.
                // TODO: Invoke START phase.

                List<BuildListener> buildListeners = new ArrayList();
                LoggerAntBuildListener logger = new LoggerAntBuildListener(null, logFileOutput, Project.MSG_DEBUG);
                buildListeners.add(logger);
                DeploymentAuditorBuildListener auditor = new DeploymentAuditorBuildListener(
                    request.getBundleManagerProvider(), resourceDeployment);
                buildListeners.add(auditor);

                // Parse and execute the Ant script.
                executeDeploymentPhase(recipeFile, antProps, buildListeners, DeploymentPhase.STOP, null);
                File deployDir = request.getAbsoluteDestinationDirectory();
                DeploymentsMetadata deployMetadata = new DeploymentsMetadata(deployDir);
                DeploymentPhase installPhase = (deployMetadata.isManaged()) ? DeploymentPhase.UPGRADE
                    : DeploymentPhase.INSTALL;
                BundleAntProject project = executeDeploymentPhase(recipeFile, antProps, buildListeners, installPhase,
                    new PluginContainerHandoverTarget(request));
                executeDeploymentPhase(recipeFile, antProps, buildListeners, DeploymentPhase.START, null);

                // Send the diffs to the Server so it can store them as an entry in the deployment history.
                BundleManagerProvider bundleManagerProvider = request.getBundleManagerProvider();
                DeployDifferences diffs = project.getDeployDifferences();

                String msg = "Added files=" + diffs.getAddedFiles().size() + "; Deleted files="
                    + diffs.getDeletedFiles().size() + " (see attached details for more information)";
                String fullDetails = formatDiff(diffs);
                bundleManagerProvider.auditDeployment(resourceDeployment, "Deployment Differences", project.getName(),
                    DEPLOY_STEP, null, msg, fullDetails);
            } catch (Throwable t) {
                if (LOG.isDebugEnabled()) {
                    try {
                        LOG.debug(new String(StreamUtil.slurp(new FileInputStream(logFile))));
                    } catch (Exception ignored) {
                    }
                }
                throw new Exception("Failed to execute the bundle Ant script", t);
            } finally {
                if (logFileOutput != null) {
                    logFileOutput.close();
                }
                recipeFile.delete();
                logFile.delete();
            }

        } catch (Throwable t) {
            LOG.error("Failed to deploy bundle [" + request + "]", t);
            result.setErrorMessage(t);
        }
        return result;
    }
