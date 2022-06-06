public boolean isValidSegment() throws IgSegmentationException
    {
        if (!initialized)
            this.validateProperties();

        try {
            endpointCommunicator = new Socket();
            endpointCommunicator.bind(bindPointAddress);
            endpointCommunicator.connect(endPointAddress, this.socketTimeout);
        }
        catch (IOException e) {
            throw new IgSegmentationException("Failed to check tcp reachability: " + this.targetNodeAddress.toString(), e);
        }
        finally {
            U.closeQuiet(endpointCommunicator);
        }

        return true;
    }
