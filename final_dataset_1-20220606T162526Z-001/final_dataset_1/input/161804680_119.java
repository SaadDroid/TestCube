@Override
    public @NotNull SpiResponse<SpiPaymentExecutionResponse> verifyScaAuthorisationAndCancelPaymentWithResponse(@NotNull SpiContextData contextData,
                                                                                                                @NotNull SpiScaConfirmation spiScaConfirmation,
                                                                                                                @NotNull SpiPayment payment,
                                                                                                                @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        try {
            SCAPaymentResponseTO sca = getSCAConsentResponse(aspspConsentDataProvider, true);
            authRequestInterceptor.setAccessToken(sca.getBearerToken().getAccess_token());

            ResponseEntity<SCAPaymentResponseTO> response = paymentRestClient.authorizeCancelPayment(sca.getPaymentId(), sca.getAuthorisationId(), spiScaConfirmation.getTanNumber());
            return response.getStatusCode() == HttpStatus.OK
                           ? SpiResponse.<SpiPaymentExecutionResponse>builder()
                                     .payload(new SpiPaymentExecutionResponse(SpiAuthorisationStatus.SUCCESS))
                                     .build()
                           : SpiResponse.<SpiPaymentExecutionResponse>builder()
                                     .error(new TppMessage(MessageErrorCode.UNAUTHORIZED_CANCELLATION))
                                     .build();
        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Verify sca authorisation and cancel payment failed: payment ID {}, devMessage {}", payment.getPaymentId(), devMessage);

            String errorCode = feignExceptionReader.getErrorCode(feignException);
            if (errorCode.equals(ATTEMPT_FAILURE)) {
                return SpiResponse.<SpiPaymentExecutionResponse>builder()
                               .payload(new SpiPaymentExecutionResponse(SpiAuthorisationStatus.ATTEMPT_FAILURE))
                               .error(FeignExceptionHandler.getFailureMessage(feignException, MessageErrorCode.PSU_CREDENTIALS_INVALID, devMessage))
                               .build();
            }
            return SpiResponse.<SpiPaymentExecutionResponse>builder()
                           .error(new TppMessage(MessageErrorCode.PSU_CREDENTIALS_INVALID))
                           .build();
        }
    }
