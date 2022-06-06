public SpiPeriodicPayment mapToSpiPeriodicPayment(PaymentTO paymentTO) {
        if (paymentTO == null) {
            return null;
        }

        SpiPeriodicPayment spiPeriodicPayment = new SpiPeriodicPayment(paymentTO.getPaymentProduct());
        fillCommonPart(paymentTO, spiPeriodicPayment);

        spiPeriodicPayment.setStartDate(paymentTO.getStartDate());
        spiPeriodicPayment.setEndDate(paymentTO.getEndDate());
        spiPeriodicPayment.setFrequency(FrequencyCode.valueOf(paymentTO.getFrequency().name()));
        spiPeriodicPayment.setDayOfExecution(PisDayOfExecution.fromValue(String.valueOf(paymentTO.getDayOfExecution())));
        spiPeriodicPayment.setExecutionRule(PisExecutionRule.getByValue(paymentTO.getExecutionRule()).orElse(null));

        return spiPeriodicPayment;
    }
