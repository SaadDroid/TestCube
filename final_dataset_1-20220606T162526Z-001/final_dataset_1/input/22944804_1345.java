@Post
    public Representation importXACML(Representation entity) {
        boolean dryRun = "true".equalsIgnoreCase(getQuery().getFirstValue("dryrun"));
        List<ImportStep> steps;

        try {
            if (!checkPermission("MODIFY")) {
                // not allowed
                throw new ResourceException(new Status(FORBIDDEN));
            }

            String realm = RestletRealmRouter.getRealmFromRequest(getRequest());
            steps = importExport.importXacml(realm, entity.getStream(), getAdminToken(), dryRun);

            if (steps.isEmpty()) {
                throw new ResourceException(new Status(BAD_REQUEST,
                        "No policies found in XACML document", null, null));
            }

            List<Map<String, String>> result = new ArrayList<Map<String, String>>();
            for (XACMLExportImport.ImportStep step : steps) {
                Map<String, String> stepResult = new HashMap<String, String>();
                stepResult.put("status", String.valueOf(step.getDiffStatus().getCode()));
                stepResult.put("name", step.getPrivilege().getName());
                result.add(stepResult);
            }
            getResponse().setStatus(Status.SUCCESS_OK);

            return jacksonRepresentationFactory.create(result);

        } catch (EntitlementException e) {
            debug.warning("Importing XACML to policies failed", e);
            throw new ResourceException(new Status(BAD_REQUEST, e, e
                    .getLocalizedMessage(getRequestLocale()), null, null));
        } catch (IOException e) {
            debug.warning("Reading XACML import failed", e);
            throw new ResourceException(new Status(BAD_REQUEST, e, e
                    .getLocalizedMessage(), null, null));
        }
    }
