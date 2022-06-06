@POST
  @Path(CoordConsts.SVC_RSC_GET_WORKSTATUS)
  @Produces(MediaType.APPLICATION_JSON)
  @Deprecated
  public JSONArray getWorkStatus(
      @FormDataParam(CoordConsts.SVC_KEY_API_KEY) String apiKey,
      @FormDataParam(CoordConsts.SVC_KEY_VERSION) String clientVersion,
      @FormDataParam(CoordConsts.SVC_KEY_WORKID) String workId) {
    try {
      _logger.debugf("WMS:getWorkStatus %s\n", workId);

      checkStringParam(apiKey, "API key");
      checkStringParam(clientVersion, "Client version");
      checkStringParam(workId, "work id");

      checkApiKeyValidity(apiKey);

      QueuedWork work = Main.getWorkMgr().getWork(UUID.fromString(workId));

      if (work == null) {
        return failureResponse("work with the specified id does not exist or is not inaccessible");
      }

      NetworkId networkId = work.getDetails().getNetworkId();
      Optional<String> networkOpt =
          Main.getWorkMgr().getNetworkNames().stream()
              .filter(
                  n ->
                      Main.getWorkMgr()
                          .getIdManager()
                          .getNetworkId(n)
                          .equals(Optional.of(networkId)))
              .findFirst();
      checkArgument(networkOpt.isPresent(), "Invalid network ID: %s", networkId);

      checkNetworkAccessibility(apiKey, networkOpt.get());

      String taskStr = BatfishObjectMapper.writeString(work.getLastTaskCheckResult());

      // TODO: Use pojo.WorkStatus instead of this custom Json
      return successResponse(
          new JSONObject()
              .put(CoordConsts.SVC_KEY_WORKSTATUS, work.getStatus().toString())
              .put(CoordConsts.SVC_KEY_TASKSTATUS, taskStr));
    } catch (IllegalArgumentException | AccessControlException e) {
      _logger.errorf("WMS:getWorkStatus exception: %s\n", e.getMessage());
      return failureResponse(e.getMessage());
    } catch (Exception e) {
      String stackTrace = Throwables.getStackTraceAsString(e);
      _logger.errorf("WMS:getWorkStatus exception: %s", stackTrace);
      return failureResponse(e.getMessage());
    }
  }
