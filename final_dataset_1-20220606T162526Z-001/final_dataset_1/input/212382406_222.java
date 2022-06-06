public static String getOzoneManagerServiceId(OzoneConfiguration conf)
      throws IOException {
    String localOMServiceId = conf.get(OZONE_OM_INTERNAL_SERVICE_ID);
    Collection<String> omServiceIds = conf.getTrimmedStringCollection(
        OZONE_OM_SERVICE_IDS_KEY);
    if (localOMServiceId == null) {
      LOG.info("{} is not defined, falling back to {} to find serviceID for "
              + "OzoneManager if it is HA enabled cluster",
          OZONE_OM_INTERNAL_SERVICE_ID, OZONE_OM_SERVICE_IDS_KEY);
      if (omServiceIds.size() > 1) {
        throw new IOException(String.format(
            "More than 1 OzoneManager ServiceID (%s) " +
                "configured : %s, but %s is not " +
                "configured.", OZONE_OM_SERVICE_IDS_KEY,
            omServiceIds.toString(), OZONE_OM_INTERNAL_SERVICE_ID));
      }
    } else if (!omServiceIds.contains(localOMServiceId)) {
      throw new IOException(String.format(
          "Cannot find the internal service id %s in %s",
          localOMServiceId, omServiceIds.toString()));
    } else {
      omServiceIds = Collections.singletonList(localOMServiceId);
    }

    if (omServiceIds.isEmpty()) {
      LOG.info("No OzoneManager ServiceID configured.");
      return null;
    } else {
      String serviceId = omServiceIds.iterator().next();
      LOG.info("Using OzoneManager ServiceID '{}'.", serviceId);
      return serviceId;
    }
  }
