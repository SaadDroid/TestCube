@GraphTransaction
    public List<AtlasGlossaryCategory> getGlossaryCategories(String glossaryGuid, int offset, int limit, SortOrder sortOrder) throws AtlasBaseException {
        if (Objects.isNull(glossaryGuid)) {
            throw new AtlasBaseException(AtlasErrorCode.BAD_REQUEST, "glossaryGuid is null/empty");
        }

        if (DEBUG_ENABLED) {
            LOG.debug("==> GlossaryService.getGlossaryCategories({}, {}, {}, {})", glossaryGuid, offset, limit, sortOrder);
        }

        List<AtlasGlossaryCategory> ret = new ArrayList<>();

        List<AtlasRelatedCategoryHeader> categoryHeaders = getGlossaryCategoriesHeaders(glossaryGuid, offset, limit, sortOrder);
        for (AtlasRelatedCategoryHeader header : categoryHeaders) {
            ret.add(dataAccess.load(getAtlasGlossaryCategorySkeleton(header.getCategoryGuid())));
        }

        if (DEBUG_ENABLED) {
            LOG.debug("<== GlossaryService.getGlossaryCategories() : {}", ret);
        }

        return ret;
    }
