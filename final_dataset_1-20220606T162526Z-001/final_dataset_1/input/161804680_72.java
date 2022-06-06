@Override
    public SpiResponse<List<SpiCardAccountDetails>> requestCardAccountList(@NotNull SpiContextData contextData,
                                                                           @NotNull SpiAccountConsent accountConsent,
                                                                           @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        byte[] aspspConsentData = aspspConsentDataProvider.loadAspspConsentData();

        try {
            SCAResponseTO response = applyAuthorisation(aspspConsentData);

            logger.info("Requested card account list for consent with ID: {}", accountConsent.getId());
            List<SpiCardAccountDetails> cardAccountDetailsList = getSpiCardAccountDetails(accountConsent, aspspConsentData);

            aspspConsentDataProvider.updateAspspConsentData(tokenService.store(response));

            List<SpiCardAccountDetails> cardAccountDetailsListWithMaskedPan = mapToCardAccountList(cardAccountDetailsList);
            List<SpiCardAccountDetails> cardAccountDetailsListWithOwnerName = cardAccountDetailsListWithMaskedPan.stream()
                                                                                      .map(accountDetails -> enrichWithOwnerName(accountDetails, accountConsent.getAccess()))
                                                                                      .collect(Collectors.toList());

            return SpiResponse.<List<SpiCardAccountDetails>>builder()
                           .payload(cardAccountDetailsListWithOwnerName)
                           .build();
        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Request card account list failed: consent ID {}, devMessage {}", accountConsent.getId(), devMessage);

            return SpiResponse.<List<SpiCardAccountDetails>>builder()
                           .error(buildTppMessage(feignException))
                           .build();
        } finally {
            authRequestInterceptor.setAccessToken(null);
        }
    }
