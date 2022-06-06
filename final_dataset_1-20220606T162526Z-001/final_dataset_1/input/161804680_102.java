@Override
    public SpiResponse<SpiInitiateAisConsentResponse> initiateAisConsent(@NotNull SpiContextData contextData,
                                                                         SpiAccountConsent accountConsent, @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        byte[] initialAspspConsentData = aspspConsentDataProvider.loadAspspConsentData();
        if (ArrayUtils.isEmpty(initialAspspConsentData)) {
            return firstCallInstantiatingConsent(accountConsent, aspspConsentDataProvider, new SpiInitiateAisConsentResponse(), contextData.getPsuData());
        }

        SCAConsentResponseTO aisConsentResponse;
        try {
            aisConsentResponse = initiateConsentInternal(accountConsent, initialAspspConsentData);
        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Initiate AIS consent failed: consent ID {}, devMessage {}", accountConsent.getId(), devMessage);
            return SpiResponse.<SpiInitiateAisConsentResponse>builder()
                           .error(FeignExceptionHandler.getFailureMessage(feignException, MessageErrorCode.FORMAT_ERROR_UNKNOWN_ACCOUNT))
                           .build();
        }

        logger.info(SCA_STATUS_LOG, aisConsentResponse.getScaStatus());
        aspspConsentDataProvider.updateAspspConsentData(consentDataService.store(aisConsentResponse));

        return SpiResponse.<SpiInitiateAisConsentResponse>builder()
                       .payload(new SpiInitiateAisConsentResponse(accountConsent.getAccess(), false, ""))
                       .build();
    }
