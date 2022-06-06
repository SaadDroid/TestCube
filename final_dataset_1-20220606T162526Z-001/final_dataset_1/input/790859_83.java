private boolean suspendsRequired(Exchange exchange) {
        return PolicyUtil.isRequired(exchange, TransactionPolicy.SUSPENDS_TRANSACTION);
    }
