public PaymentTO mapToPaymentTO(PaymentType paymentType, SpiPaymentInfo spiPaymentInfo) {
        if (standardPaymentProductsResolverConnector.isRawPaymentProduct(spiPaymentInfo.getPaymentProduct())) {
            PaymentTO paymentTO = paymentMapperTO.toAbstractPayment(new String(spiPaymentInfo.getPaymentData()),
                                                                    paymentType.name(),
                                                                    spiPaymentInfo.getPaymentProduct());
            paymentTO.setPaymentId(spiPaymentInfo.getPaymentId());
            if (PaymentType.PERIODIC == paymentType) {
                enrichPeriodicPaymentFields(paymentTO, spiPaymentInfo);
            }
            return paymentTO;
        } else {
            switch (paymentType) {
                case SINGLE:
                    return ledgersSpiPaymentToMapper.toPaymentTO_Single(spiPaymentInfo);
                case BULK:
                    return ledgersSpiPaymentToMapper.toPaymentTO_Bulk(spiPaymentInfo);
                case PERIODIC:
                    return ledgersSpiPaymentToMapper.toPaymentTO_Periodic(spiPaymentInfo);
                default:
                    throw new IllegalArgumentException(String.format("Unknown payment type: %s", paymentType.getValue()));
            }
        }
    }
