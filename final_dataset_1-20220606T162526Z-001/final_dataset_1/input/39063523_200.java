@Override
    public List<RnrFormItem> generateRnrFormItems(RnRForm form, List<StockCard> stockCards) throws LMISException {
        List<RnrFormItem> rnrFormItems = super.generateRnrFormItems(form, stockCards);
        return fillAllPTVProduct(form, rnrFormItems);
    }
