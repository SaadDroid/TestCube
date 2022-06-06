@Override
    public <P extends SpiPayment> SpiResponse<? extends SpiPaymentInitiationResponse> initiatePayment(@NotNull SpiContextData contextData,
                                                                                                      @NotNull P spiPayment,
                                                                                                      @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) throws NotSupportedPaymentTypeException {
        // Payment initiation can only be called if exemption.
        PaymentType paymentType = spiPayment.getPaymentType();

        // Don't know who came to idea to call external API internally, but it causes now to bring this tricky hack in play
        switch (paymentType) {
            case SINGLE:
                return singlePaymentSpi.initiatePayment(contextData, (@NotNull SpiSinglePayment) spiPayment, aspspConsentDataProvider);
            case BULK:
                return bulkPaymentSpi.initiatePayment(contextData, (@NotNull SpiBulkPayment) spiPayment, aspspConsentDataProvider);
            case PERIODIC:
                return periodicPaymentSpi.initiatePayment(contextData, (@NotNull SpiPeriodicPayment) spiPayment, aspspConsentDataProvider);
            default:
                throw new NotSupportedPaymentTypeException(String.format("Unknown payment type: %s", paymentType.getValue()));
        }
    }
