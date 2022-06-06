@Override
  public BundleBuildResponse build(BundleBuildRequest bundleRequest) {
    String id = getNextId();
    bundleRequest.setId(id);
    BundleBuildResponse bundleResponse = new BundleBuildResponse(id);
    bundleResponse.setBundleBuildName(bundleRequest.getBundleName());
    bundleResponse.setBundleStartDate(bundleRequest.getBundleStartDateString());
    bundleResponse.setBundleEndDate(bundleRequest.getBundleEndDateString());
    bundleResponse.setBundleComment(bundleRequest.getBundleComment());
    _buildMap.put(bundleResponse.getId(), bundleResponse);
    bundleResponse.addStatusMessage("queueing...");
    if (_bundleService != null) {
      _bundleService.createBundleBuildResponse(bundleResponse);
    }
    _executorService.execute(new BuildThread(bundleRequest, bundleResponse));
    return bundleResponse;
  }
