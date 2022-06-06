private BlockStopTimeEntry getBlockStopTime(
      BlockTripInstance blockTripInstance, AgencyAndId stopId, int stopSequence,
      int timeOfServiceDate) {

    /**
     * We don't iterate over block stop times directly because there is
     * performance penalty with instantiating each. Also note that this will
     * currently miss the case where a stop is visited twice in the same trip.
     */
    BlockTripEntry blockTrip = blockTripInstance.getBlockTrip();
    TripEntry trip = blockTrip.getTrip();
    List<StopTimeEntry> stopTimes = trip.getStopTimes();

    if (stopSequence > -1) {

      /**
       * If a stop sequence has been specified, we start our search at the
       * specified index, expanding our search until we find the target stop. We
       * allow this flexibility in the case of a bookmarked arrival-departure
       * where the stop sequence has changed slightly due to the addition or
       * subtraction of a previous stop.
       */
      int offset = 0;
      while (true) {
        int before = stopSequence - offset;
        if (isMatch(stopTimes, stopId, before)) {
          return blockTrip.getStopTimes().get(before);
        }
        int after = stopSequence + offset;
        if (isMatch(stopTimes, stopId, after)) {
          return blockTrip.getStopTimes().get(after);
        }

        if (before < 0 && after >= stopTimes.size())
          return null;

        offset++;

      }
    } else {

      Min<BlockStopTimeEntry> m = new Min<BlockStopTimeEntry>();
      int index = 0;

      for (StopTimeEntry stopTime : stopTimes) {
        if (stopTime.getStop().getId().equals(stopId)) {
          int a = Math.abs(timeOfServiceDate - stopTime.getArrivalTime());
          int b = Math.abs(timeOfServiceDate - stopTime.getDepartureTime());
          int delta = Math.min(a, b);
          m.add(delta, blockTrip.getStopTimes().get(index));
        }
        index++;
      }

      if (m.isEmpty())
        return null;

      return m.getMinElement();
    }
  }
