@Override
    public HttpServiceResponse handle(HttpServiceRequest request) throws Exception {
        return MetadataDrivers.runFunctionWithLedgerManagerFactory(conf,
                ledgerManagerFactory -> {
                    try (LedgerUnderreplicationManager ledgerUnderreplicationManager = ledgerManagerFactory
                            .newLedgerUnderreplicationManager()) {
                        switch (request.getMethod()) {
                            case GET:
                                return handleGetStatus(ledgerUnderreplicationManager);
                            case PUT:
                                return handlePutStatus(request, ledgerUnderreplicationManager);
                            default:
                                return new HttpServiceResponse("Not found method. Should be GET or PUT method",
                                        HttpServer.StatusCode.NOT_FOUND);
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new UncheckedExecutionException(e);
                    } catch (Exception e) {
                        throw new UncheckedExecutionException(e);
                    }
                });
    }
