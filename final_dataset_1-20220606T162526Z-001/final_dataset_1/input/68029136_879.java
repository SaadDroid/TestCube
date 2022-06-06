@Path("/resource/{env}/{resourceType : \\d+}")
    @Produces("application/json")
    @GET
    @ApiOperation(value = "Get batch job inventory", notes = "Returns the available e.g. batch applications and their related resources (only db2, oracle, ws, rest and file)")
    public BatchJobInventoryDTO getBatchJobInventar(
            @ApiParam(value = "return batch job inventory") @PathParam("env") String env,
            @ApiParam(value = "resource type (int)") @PathParam("resourceType") int resourceType,
            @ApiParam(value = "Filter by Applicationname or -part") @QueryParam("app") String appFilter,
            @ApiParam(value = "Filter by Resource or -part") @QueryParam("job") String jobFilter,
            @ApiParam(value = "Filter by Release") @QueryParam("rel") String relFilter,
            @ApiParam(value = "Filter by consumed DB type") @QueryParam("db") String dbFilter,
            @ApiParam(value = "Filter by consumed WS name or part") @QueryParam("ws") String wsFilter) {
        BatchJobInventoryDTO inventory = new BatchJobInventoryDTO();

        // Applications und ihre Resourcen lesen
        List<ResourceEntity> reList = resourceLocator.getAllApplicationsWithResource(resourceType);

        List<String> appList = new ArrayList<>();
        for (ResourceEntity re : reList) {
            for (ConsumedResourceRelationEntity a : re.getConsumedMasterRelations()) {
                BatchResourceRelationDTO job = new BatchResourceRelationDTO(a);
                // filter by appname or part of name
                if (appFilter != null && !appFilter.isEmpty() && job.getBatchApp() != null) {
                    if (!job.getBatchApp().toLowerCase().contains(appFilter.toLowerCase())) {
                        // do not add to list
                        break;
                    }
                }

                // filter by release (must match either in app or in job)
                if (relFilter != null && !relFilter.isEmpty() &&                               //
                        (job.getBatchAppRelease() != null)) { // || job.getBatchJobRelease() != null)) {
                    if (!job.getBatchAppRelease().toLowerCase().contains(relFilter.toLowerCase())) {
                        // job-Release Filter ist nicht relevant, da dort der Release nur auf Stufe 'standardJob' wirkt
                        // || job.getBatchJobRelease().toLowerCase().contains(relFilter.toLowerCase()))) {
                        // do not add to list
                        break;
                    }
                }

                inventory.getBatchJobs().add(job);
                if (!appList.contains(job.getBatchApp())) {
                    appList.add(job.getBatchApp().toLowerCase());
                }

            }
        }

        // filter by jobname or part
        List<BatchResourceRelationDTO> jobsToRemove = new ArrayList<>();
        for (BatchResourceRelationDTO job : inventory.getBatchJobs()) {
            if (jobFilter != null && !jobFilter.isEmpty()) {
                if (job.getJobName() == null) {
                    // remove from list
                    jobsToRemove.add(job);
                } else if (!job.getJobName().toLowerCase().contains(jobFilter.toLowerCase())) {
                    // remove from list
                    jobsToRemove.add(job);
                }
            }
        }
        for (BatchResourceRelationDTO deleteMe : jobsToRemove) {
            inventory.getBatchJobs().remove(deleteMe);
        }

        // Alle 'JavaBatch' Server lesen
        String appServer = null; // alle lesen
        String runtime = "JavaBatch*"; // aber nur Batch
        String host = null;
        String node = null;
        List<ServerTuple> servers = serverView.getServers(host, appServer, runtime, node, env, true);
        List<String> appServerList = new ArrayList<>();
        for (ServerTuple t : servers) {
            appServerList.add(t.getAppServer().toLowerCase());
        }

        // Mapping von fofa_batch nach ch_mobi_fofa_fofa_selection, funktioniert nur falls Server zugeordnet
        // Map contains: <ch_mobi_fofa_fofa_selection, fofa_batch>
        Map<String, String> mapping = resourceLocator.getAppToAppServerMapping(appServerList);
        for (BatchResourceRelationDTO job : inventory.getBatchJobs()) {
            String appName = mapping.get(job.getBatchApp());
            job.setAppName(appName);
        }

        for (BatchResourceRelationDTO job : inventory.getBatchJobs()) {
            for (ServerTuple server : servers) {
                if (job.getAppName() != null && job.getAppName().equals(server.getAppServer())) {
                    job.setBatchServer(server.getHost());
                }
            }
        }

        // Flags fuer verwendete Ressourcen: DB2, Oracle, WS und File ermitteln
        List<ResourceEntity> resources = resourceLocator.getBatchJobConsumedResources(appList);
        if (resources != null && !resources.isEmpty()) {
            for (BatchResourceRelationDTO job : inventory.getBatchJobs()) {
                for (ResourceEntity re : resources) {

                    for (ConsumedResourceRelationEntity r : re.getConsumedMasterRelations()) {

                        if (r.getMasterResourceName().equals(job.getBatchApp())) {
                            if (r.getSlaveResourceTypeId().equals(Constants.RESOURCETYPE_DB2)) {
                                job.setDb2(true);
                            }
                            if (r.getSlaveResourceTypeId().equals(Constants.RESOURCETYPE_ORACLE)) {
                                job.setOracle(true);
                            }
                            if (r.getSlaveResourceTypeId().equals(Constants.RESOURCETYPE_WS)
                                    || r.getSlaveResourceTypeId().equals(Constants.RESOURCETYPE_REST)) {
                                job.setWs(true);
                                if (!job.getWsList().contains(r.getSlaveResource().getName())) {
                                    job.getWsList().add(r.getSlaveResource().getName());
                                }
                            }
                            if (r.getSlaveResourceTypeId().equals(Constants.RESOURCETYPE_FILE)) {
                                job.setFile(true);
                            }
                        }
                    }
                }
            }
        }

        // filter by used db (Empty, DB2 or Oracle from Constant Dropdown)
        // filter by consumed WS
        List<BatchResourceRelationDTO> deleteJobs = new ArrayList<>();
        for (BatchResourceRelationDTO job : inventory.getBatchJobs()) {

            if (dbFilter != null && !dbFilter.isEmpty()) {
                if (dbFilter.equalsIgnoreCase(DB2) && !job.getDb2()) {
                    // remove from result
                    deleteJobs.add(job);
                }
                if (dbFilter.equalsIgnoreCase(ORACLE) && !job.getOracle()) {
                    // remove from result
                    deleteJobs.add(job);
                }
            }
            if (wsFilter != null && !wsFilter.isEmpty()) {
                boolean found = false;
                for (String ws : job.getWsList()) {
                    if (ws.toLowerCase().contains(wsFilter)) {
                        found = true;
                    }
                }
                if (!found) {
                    if (!deleteJobs.contains(job)) {
                        deleteJobs.add(job);
                    }
                }
            }
        }
        for (BatchResourceRelationDTO job : deleteJobs) {
            inventory.getBatchJobs().remove(job);
        }

        return inventory;
    }
