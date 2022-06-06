@POST
  @Path(CoordConsts.SVC_RSC_CONFIGURE_ANALYSIS)
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces(MediaType.APPLICATION_JSON)
  public JSONArray configureAnalysis(
      @FormDataParam(CoordConsts.SVC_KEY_API_KEY) String apiKey,
      @FormDataParam(CoordConsts.SVC_KEY_VERSION) String clientVersion,
      @FormDataParam(CoordConsts.SVC_KEY_NETWORK_NAME) String networkName,
      @FormDataParam(CoordConsts.SVC_KEY_NEW_ANALYSIS) String newAnalysisStr,
      @FormDataParam(CoordConsts.SVC_KEY_ANALYSIS_NAME) String analysisName,
      @FormDataParam(CoordConsts.SVC_KEY_FILE) InputStream addQuestionsStream,
      @FormDataParam(CoordConsts.SVC_KEY_DEL_ANALYSIS_QUESTIONS) String delQuestions,
      @Nullable @FormDataParam(CoordConsts.SVC_KEY_SUGGESTED) Boolean suggested) {
    try {
      _logger.infof(
          "WMS:configureAnalysis %s %s %s %s %s\n",
          apiKey, networkName, newAnalysisStr, analysisName, delQuestions);

      checkStringParam(apiKey, "API key");
      checkStringParam(clientVersion, "Client version");
      checkStringParam(networkName, "Network name");
      checkStringParam(analysisName, "Analysis name");

      checkApiKeyValidity(apiKey);

      checkNetworkAccessibility(apiKey, networkName);

      Map<String, String> questionsToAdd = new HashMap<>();
      if (addQuestionsStream != null) {
        Map<String, Object> streamValue;
        try {
          streamValue =
              BatfishObjectMapper.mapper()
                  .readValue(addQuestionsStream, new TypeReference<Map<String, Object>>() {});
          for (Entry<String, Object> entry : streamValue.entrySet()) {
            String textValue = BatfishObjectMapper.writeString(entry.getValue());
            questionsToAdd.put(entry.getKey(), textValue);
          }
        } catch (IOException e) {
          throw new BatfishException("Failed to read question JSON from input stream", e);
        }
      }
      boolean newAnalysis = !Strings.isNullOrEmpty(newAnalysisStr);
      List<String> questionsToDelete = new ArrayList<>();
      if (!Strings.isNullOrEmpty(delQuestions)) {
        JSONArray delQuestionsArray = new JSONArray(delQuestions);
        for (int i = 0; i < delQuestionsArray.length(); i++) {
          questionsToDelete.add(delQuestionsArray.getString(i));
        }
      }

      Main.getWorkMgr()
          .configureAnalysis(
              networkName, newAnalysis, analysisName, questionsToAdd, questionsToDelete, suggested);

      return successResponse(new JSONObject().put("result", "successfully configured analysis"));

    } catch (IllegalArgumentException | AccessControlException | IOException e) {
      _logger.errorf("WMS:configureAnalysis exception: %s\n", e.getMessage());
      return failureResponse(e.getMessage());
    } catch (Exception e) {
      String stackTrace = Throwables.getStackTraceAsString(e);
      _logger.errorf(
          "WMS:configureAnalysis exception for apikey:%s in network:%s; exception:%s",
          apiKey, networkName, stackTrace);
      return failureResponse(e.getMessage());
    }
  }
