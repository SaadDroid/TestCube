private void rollover(final LocationIdentifier identifier, ILoggingEvent event) throws RolloverFailure, IOException {
    // Close unclosed outputstream before proceeding further
    closeInvalidStream();

    if (!locationManager.getActiveLocations().containsKey(identifier)) {
      return;
    }

    final LocationOutputStream locationOutputStream = locationManager.getActiveLocations().get(identifier);

    if (triggeringPolicy instanceof LocationTriggeringPolicy) {
      // no need to type cast on every event
      if (locationTriggeringPolicy == null) {
        locationTriggeringPolicy = ((LocationTriggeringPolicy) triggeringPolicy);
      }

      locationTriggeringPolicy.setLocation(locationOutputStream.getLocation());
      // set number of bytes written to locationOutputStream, we need to do this because HDFS does not provide
      // correct size of the file
      locationTriggeringPolicy.setActiveLocationSize(locationOutputStream.getNumOfBytes());

      if (locationTriggeringPolicy.isTriggeringEvent(event)) {
          if (rollingPolicy instanceof LocationRollingPolicy) {
            // no need to type cast on every event
            if (locationRollingPolicy == null) {
              locationRollingPolicy = ((LocationRollingPolicy) rollingPolicy);
            }

            locationRollingPolicy.setLocation(locationOutputStream.getLocation(), new Closeable() {
              @Override
              public void close() throws IOException {
                locationManager.getActiveLocations().remove(identifier);
                try {
                  locationOutputStream.close();
                } catch (IOException e) {
                  // If there is an exception while closing the outputstream, remember it and throw an exception so
                  // that it can be closed on another event append
                  locationManager.setInvalidOutputStream(locationOutputStream);
                  LOG.trace("Exception while closing the output stream for {}, will retry to close it later",
                           identifier, e);
                  throw e;
                }
              }
            });

            locationRollingPolicy.rollover();
          }
      }
    }
  }
