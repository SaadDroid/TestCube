public static PushReport mapFromImportSummaryToPushReport(ImportSummary importSummary,
            String importSummaryKey) {
        PushReport pushReport = new PushReport();
        List<PushConflict> conflictList = new ArrayList<>();
        if (importSummary.getConflicts() != null) {
            for (Conflict conflict : importSummary.getConflicts()) {
                conflictList.add(
                        new PushConflict(conflict.getObject(), conflict.getValue()));
            }
        }
        pushReport.setPushConflicts(conflictList);
        pushReport.setDescription(importSummary.getDescription());
        pushReport.setHref(importSummary.getHref());

        ImportCount importCount = importSummary.getImportCount();
        if(importCount!=null) {
            pushReport.setPushedValuesCount(
                    new PushedValuesCount(importCount.getImported(), importCount.getUpdated(),
                            importCount.getIgnored(), importCount.getDeleted()));

        }
        pushReport.setReference(importSummary.getReference());
        if (importSummary.getStatus() == ImportSummary.Status.ERROR) {
            pushReport.setStatus(PushReport.Status.ERROR);
        }
        if (importSummary.getStatus() == ImportSummary.Status.OK) {
            pushReport.setStatus(PushReport.Status.OK);
        }
        if (importSummary.getStatus() == ImportSummary.Status.SUCCESS) {
            pushReport.setStatus(PushReport.Status.SUCCESS);
        }
        pushReport.setEventUid(importSummaryKey);
        return pushReport;
    }
