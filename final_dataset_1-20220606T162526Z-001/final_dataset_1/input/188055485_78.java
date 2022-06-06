@Override
    public CommonResult listLogsByCashierIdAndDate(DailySummaryParam dailySummaryParam){
        Integer cashierId = dailySummaryParam.getCashierId();
        String beginDateStr = dailySummaryParam.getBeginDateStr();
        String endDateStr = dailySummaryParam.getEndDateStr();
        List<HashMap> invoiceResult = transactionLogMapper.listLogsByCashierIdAndDate(cashierId, beginDateStr, endDateStr);
        if(invoiceResult.size()!=0)
            return CommonResult.success(invoiceResult);
        else
            return CommonResult.success(null);
    }
