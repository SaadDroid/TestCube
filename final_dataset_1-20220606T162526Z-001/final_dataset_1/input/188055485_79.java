@Override
    public CommonResult freezeTransactionLogs(DailySummaryParam dailySummaryParam){
        List<HashMap> transactionLogs = dailySummaryParam.getInvoiceCollection();
        Integer cashierRoleId = dailySummaryParam.getCashierId();
        Timestamp beginDate = Timestamp.valueOf(dailySummaryParam.getBeginDateStr());
        Timestamp endDate = Timestamp.valueOf(dailySummaryParam.getEndDateStr());
        BigDecimal totalMoney = dailySummaryParam.getTotalMoney();
        String invoiceCodeBegin = dailySummaryParam.getInvoiceCodeBegin();
        String invoiceCodeEnd = dailySummaryParam.getInvoiceCodeEnd();

        DailySummaryLog dailySummaryLog = new DailySummaryLog(cashierRoleId, totalMoney, invoiceCodeBegin,
                                                invoiceCodeEnd, beginDate, endDate);
        //更改收费记录状态 --冻结
        for (HashMap t: transactionLogs){
            transactionLogMapper.updateTransactionLogsByInvoiceCode((String) t.get("invoiceCode"));
        }

        //向日结表插入数据
        int count = dailySummaryLogMapper.insert(dailySummaryLog);
        if (count > 0)
            return CommonResult.success(count);
        else
            return CommonResult.fail(E_805);
    }
