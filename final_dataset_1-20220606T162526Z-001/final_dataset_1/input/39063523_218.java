public List<DraftLotItem> getDraftLotItemListWrapper() {
        draftLotItemListWrapper = ListUtil.wrapOrEmpty(foreignDraftLotItems, draftLotItemListWrapper);
        return draftLotItemListWrapper;
    }
