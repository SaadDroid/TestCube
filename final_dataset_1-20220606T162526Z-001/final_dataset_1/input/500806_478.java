public String execute(List<String> parameterList, TestContext context) {
        if (!parameterList.isEmpty()) {
            throw new InvalidFunctionUsageException("Unexpected parameter for function.");
        }
        
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new CitrusRuntimeException("Unable to locate local host address", e);
        }
    }
