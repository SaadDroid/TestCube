@POST
    @Path("/" + DatasetOptionListContainer.DATASETID + "/" + HarvestOptionListContainer.HARVEST + "/" + HarvestOptionListContainer.SCHEDULE)
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @ApiOperation(value = "Schedules an automatic harvesting.", httpMethod = "POST", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created (Response containing a String message)"),
            @ApiResponse(code = 404, message = "DoesNotExistException"),
            @ApiResponse(code = 406, message = "MissingArgumentsException"),
            @ApiResponse(code = 409, message = "AlreadyExistsException"),
            @ApiResponse(code = 500, message = "InternalServerErrorException")
    })
    public Response scheduleHarvest(@ApiParam(value = "Id of dataset", required = true) @PathParam("datasetId") String datasetId, @ApiParam(value = "Task", required = true) Task task,
            @ApiParam(value = "true|false") @DefaultValue("false") @QueryParam("incremental") boolean incremental)
            throws MissingArgumentsException, DoesNotExistException, AlreadyExistsException {

        DataSourceContainer dataSourceContainer;
        try {
            dataSourceContainer = dataManager.getDataSourceContainer(datasetId);
        } catch (DocumentException | IOException e) {
            throw new InternalServerErrorException("Error in server : " + e.getMessage());
        }

        if (dataSourceContainer != null) {
            DataSource dataSource = dataSourceContainer.getDataSource();
            if (task instanceof ScheduledTask)
            {
                ScheduledTask scheduledTask = (ScheduledTask)task;
                Calendar firstRun = scheduledTask.getFirstRun();
                Frequency frequency = scheduledTask.getFrequency();
                String xmonths = "";
                if (scheduledTask.getXmonths() != null)
                    xmonths = Integer.toString(scheduledTask.getXmonths());

                if (firstRun == null)
                    throw new MissingArgumentsException("Missing value: " + "Date or are time must not be empty");
                else if (frequency == null)
                    throw new MissingArgumentsException("Missing value: " + "frequency must not be empty");
                else if ((frequency == Frequency.XMONTHLY) && (xmonths == null || xmonths.isEmpty()))
                    throw new MissingArgumentsException("Missing value: " + "xmonths must not be empty");

                String newTaskId;
                try {
                    newTaskId = dataSource.getNewTaskId();
                    scheduledTask.setId(newTaskId);
                } catch (IOException e) {
                    throw new InternalServerErrorException("Error in server : " + e.getMessage());
                }

                scheduledTask.setTaskClass(IngestDataSource.class);
                String[] parameters = new String[] { newTaskId, dataSource.getId(), (Boolean.valueOf(!incremental)).toString() };
                scheduledTask.setParameters(parameters);

                try {
                    if (taskManager.taskAlreadyExists(dataSource.getId(), DateUtil.date2String(scheduledTask.getFirstRun().getTime(), TimeUtil.LONG_DATE_FORMAT_NO_SECS), scheduledTask.getFrequency())) {
                        throw new AlreadyExistsException("Already exists: " + "Task already exists!");
                    }
                    else {
                        dataSource.setMaxRecord4Sample(-1);
                        dataManager.setDataSetSampleState(false, dataSource); //Set dataset to isSample false, a scheduled dataset harvest is not a sample anymore
                        taskManager.saveTask(scheduledTask);
                    }
                } catch (IOException e) {
                    throw new InternalServerErrorException("Error in server : " + e.getMessage());
                }

                return Response.status(201).entity(new Result("Task for dataset with id '" + datasetId + "' created!")).build();
            }
            else
                return Response.status(500).entity(new Result("Invalid task instance in body!")).build();
        }
        else
            throw new DoesNotExistException("Dataset with id " + datasetId + " does NOT exist!");
    }
