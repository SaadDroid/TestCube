@Override
    public FindPathsResponse FindPaths(FindPathsRequest req) throws TException {
        LOG.debug("FindPaths called");
        long startTime = System.currentTimeMillis();

        TripParameters trip = req.getTrip();
        TripPaths outPaths = new TripPaths();
        outPaths.setTrip(trip);

        TripPaths tripPaths = computePaths(trip, req.getOptions());

        FindPathsResponse res = new FindPathsResponse();
        res.setPaths(tripPaths);
        res.setCompute_time_millis(System.currentTimeMillis() - startTime);

        return res;
    }
