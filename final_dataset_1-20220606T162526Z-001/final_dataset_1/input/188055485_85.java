@Override
    public CommonResult listTransactionLogsByInvoiceCode(String invoiceCode){
        List<TransactionLog> transactionLogs = transactionLogMapper.listLogsByInvoiceCode(invoiceCode);
        return CommonResult.success(transactionLogs);
    }
