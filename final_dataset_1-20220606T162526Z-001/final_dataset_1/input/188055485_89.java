@Override
    public CommonResult reprintTransactionLog(String invoiceCode, Integer newCashierId){
        List<TransactionLog> transactionLogs = transactionLogMapper.listLogsByInvoiceCode(invoiceCode);
        String newInvoiceCode;
        synchronized (this) {
            //通过查询invoice表得到新的缴费记录的发票号并将其状态改为已用
            CommonResult result = invoiceService.getNextInvoiceCode();
            newInvoiceCode = (String) result.getData();
        }

        int count = 0;
        for(TransactionLog transactionLog: transactionLogs){
            //更改原有的发票号对应的缴费状态
            transactionLog.setStatus((byte)5);
            count += transactionLogMapper.update(transactionLog);
            //插入新的缴费记录
            TransactionLog newTransactionLog = (TransactionLog) transactionLog.clone();
            newTransactionLog.setId(null);
            newTransactionLog.setCashierId(newCashierId);
            newTransactionLog.setInvoiceCode(newInvoiceCode);
            newTransactionLog.setStatus((byte) 2);
            CommonResult insertReverseResult = transactionService.insertTransactionLog(newTransactionLog);
            if (insertReverseResult.getCode() == 500)
                return insertReverseResult;
        }
        invoiceService.updateStatus((byte)3, newInvoiceCode);
        
        //向异常表中添加新的记录
        CommonResult insertExceptionResult = transactionService.insertTransactionExceptionLog(
                invoiceCode, newInvoiceCode, null, newCashierId, "发票重打" );
        if (insertExceptionResult.getCode() == 500)
            return insertExceptionResult;
        if(count == transactionLogs.size())
            return CommonResult.success(newInvoiceCode);
        else
            return CommonResult.fail();
    }
