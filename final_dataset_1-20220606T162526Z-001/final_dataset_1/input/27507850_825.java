@POST
  @Path(CoordConsts.SVC_RSC_GET_ANALYSIS_ANSWERS_ROWS)
  @Produces(MediaType.APPLICATION_JSON)
  public JSONArray getAnalysisAnswersRows(
      @FormDataParam(CoordConsts.SVC_KEY_API_KEY) String apiKey,
      @FormDataParam(CoordConsts.SVC_KEY_VERSION) String clientVersion,
      @FormDataParam(CoordConsts.SVC_KEY_NETWORK_NAME) String networkName,
      @FormDataParam(CoordConsts.SVC_KEY_SNAPSHOT_NAME) String snapshotName,
      @FormDataParam(CoordConsts.SVC_KEY_REFERENCE_SNAPSHOT_NAME) String referenceSnapshot,
      @FormDataParam(CoordConsts.SVC_KEY_ANALYSIS_NAME) String analysisName,
      @FormDataParam(CoordConsts.SVC_KEY_ANALYSIS_ANSWERS_OPTIONS) String answersRowsOptionsStr,
      @FormDataParam(CoordConsts.SVC_KEY_WORKITEM) String workItemStr /* optional */) {
    try {
      _logger.infof(
          "WMS:getAnalysisAnswersRows %s %s %s %s %s\n",
          apiKey, networkName, snapshotName, analysisName, answersRowsOptionsStr);

      checkStringParam(apiKey, "API key");
      checkStringParam(clientVersion, "Client version");
      checkStringParam(networkName, "Network name");
      checkStringParam(snapshotName, "Current snapshot name");
      checkStringParam(analysisName, "Analysis name");
      Map<String, AnswerRowsOptions> analysisAnswersOptions =
          BatfishObjectMapper.mapper()
              .readValue(
                  answersRowsOptionsStr, new TypeReference<Map<String, AnswerRowsOptions>>() {});

      checkApiKeyValidity(apiKey);

      checkNetworkAccessibility(apiKey, networkName);

      JSONObject response = new JSONObject();

      if (!Strings.isNullOrEmpty(workItemStr)) {
        WorkItem workItem = BatfishObjectMapper.mapper().readValue(workItemStr, WorkItem.class);
        if (!workItem.getNetwork().equals(networkName)
            || !workItem.getSnapshot().equals(snapshotName)) {
          return failureResponse(
              "Mismatch in parameters: WorkItem is not for the supplied network or snapshot");
        }
        QueuedWork work = Main.getWorkMgr().getMatchingWork(workItem, QueueType.INCOMPLETE);
        if (work != null) {
          String taskStr = BatfishObjectMapper.writeString(work.getLastTaskCheckResult());
          response
              .put(CoordConsts.SVC_KEY_WORKID, work.getWorkItem().getId())
              .put(CoordConsts.SVC_KEY_WORKSTATUS, work.getStatus().toString())
              .put(CoordConsts.SVC_KEY_TASKSTATUS, taskStr);
        }
      }

      Map<String, String> rawAnswers =
          Main.getWorkMgr()
              .getAnalysisAnswers(
                  networkName,
                  snapshotName,
                  referenceSnapshot,
                  analysisName,
                  analysisAnswersOptions.keySet());

      Map<String, Answer> answers =
          Main.getWorkMgr().processAnalysisAnswers(rawAnswers, analysisAnswersOptions);

      String answerStr = BatfishObjectMapper.writeString(answers);

      return successResponse(response.put(CoordConsts.SVC_KEY_ANSWERS, answerStr));
    } catch (IllegalArgumentException | AccessControlException e) {
      _logger.errorf("WMS:getAnalysisAnswers exception: %s\n", e.getMessage());
      return failureResponse(e.getMessage());
    } catch (Exception e) {
      String stackTrace = Throwables.getStackTraceAsString(e);
      _logger.errorf(
          "WMS:getAnalysisAnswersRows exception for apikey:%s in network:%s, snapshot:%s, "
              + "referencesnapshot:%s; exception:%s",
          apiKey, networkName, snapshotName, referenceSnapshot, stackTrace);
      return failureResponse(e.getMessage());
    }
  }
