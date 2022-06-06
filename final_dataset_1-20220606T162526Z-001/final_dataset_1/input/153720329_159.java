@Override
    public List<SegmentKey> call() throws Exception {
        CollateService collateService = SwiftContext.get().getBean(CollateService.class);
        return collateService.appointCollate(tableKey, segmentService.getSegmentKeysByIds(tableKey, segmentIds));
    }
