@Override
    public @NotNull SpiResponse<SpiPaymentCancellationResponse> initiatePaymentCancellation(@NotNull SpiContextData contextData,
                                                                                            @NotNull SpiPayment payment,
                                                                                            @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        SpiPaymentCancellationResponse response = new SpiPaymentCancellationResponse();
        boolean cancellationMandated = payment.getPaymentStatus() != TransactionStatus.RCVD;
        response.setCancellationAuthorisationMandated(cancellationMandated);
        response.setTransactionStatus(payment.getPaymentStatus());
        return SpiResponse.<SpiPaymentCancellationResponse>builder()
                       .payload(response).build();
    }
