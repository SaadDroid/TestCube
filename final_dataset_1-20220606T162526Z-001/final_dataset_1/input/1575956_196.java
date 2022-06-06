@Override
    public HttpServiceResponse handle(HttpServiceRequest request) throws Exception {
        HttpServiceResponse response = new HttpServiceResponse();
        // GET
        // parameter could be like: print_metadata=true&page=PageIndex
        if (HttpServer.Method.GET == request.getMethod()) {
            Map<String, String> params = request.getParams();
            // default not print metadata
            boolean printMeta = (params != null)
              && params.containsKey("print_metadata")
              && params.get("print_metadata").equals("true");

            // do not decode meta by default for backward compatibility
            boolean decodeMeta = (params != null)
                    && params.getOrDefault("decode_meta", "false").equals("true");

            // Page index should start from 1;
            int pageIndex = (printMeta && params.containsKey("page"))
                ? Integer.parseInt(params.get("page")) : -1;

            LedgerManagerFactory mFactory = bookieServer.getBookie().getLedgerManagerFactory();
            LedgerManager manager = mFactory.newLedgerManager();
            LedgerManager.LedgerRangeIterator iter = manager.getLedgerRanges(0);

            // output <ledgerId: ledgerMetadata>
            LinkedHashMap<String, Object> output = Maps.newLinkedHashMap();
            // futures for readLedgerMetadata for each page.
            Map<Long, CompletableFuture<Versioned<LedgerMetadata>>> futures =
                new LinkedHashMap<>(LIST_LEDGER_BATCH_SIZE);

            if (printMeta) {
                int ledgerIndex = 0;

                // start and end ledger index for wanted page.
                int startLedgerIndex = 0;
                int endLedgerIndex = 0;
                if (pageIndex > 0) {
                    startLedgerIndex = (pageIndex - 1) * LIST_LEDGER_BATCH_SIZE;
                    endLedgerIndex = startLedgerIndex + LIST_LEDGER_BATCH_SIZE - 1;
                }

                // get metadata
                while (iter.hasNext()) {
                    LedgerManager.LedgerRange r = iter.next();
                    for (Long lid : r.getLedgers()) {
                        ledgerIndex++;
                        if (endLedgerIndex == 0       // no actual page parameter provided
                                || (ledgerIndex >= startLedgerIndex && ledgerIndex <= endLedgerIndex)) {
                            futures.put(lid, manager.readLedgerMetadata(lid));
                        }
                    }
                    if (futures.size() >= LIST_LEDGER_BATCH_SIZE) {
                        for (Map.Entry<Long, CompletableFuture<Versioned<LedgerMetadata>> > e : futures.entrySet()) {
                            keepLedgerMetadata(e.getKey(), e.getValue(), output, decodeMeta);
                        }
                        futures.clear();
                    }
                }
                for (Map.Entry<Long, CompletableFuture<Versioned<LedgerMetadata>> > e : futures.entrySet()) {
                    keepLedgerMetadata(e.getKey(), e.getValue(), output, decodeMeta);
                }
                futures.clear();
            } else {
                while (iter.hasNext()) {
                    LedgerManager.LedgerRange r = iter.next();
                    for (Long lid : r.getLedgers()) {
                        output.put(lid.toString(), null);
                    }
                }
            }

            manager.close();

            String jsonResponse = JsonUtil.toJson(output);
            LOG.debug("output body:" + jsonResponse);
            response.setBody(jsonResponse);
            response.setCode(HttpServer.StatusCode.OK);
            return response;
        } else {
            response.setCode(HttpServer.StatusCode.NOT_FOUND);
            response.setBody("Not found method. Should be GET method");
            return response;
        }
    }
