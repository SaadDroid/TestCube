@Override
    public SpiResponse<SpiCardAccountDetails> requestCardAccountDetailsForAccount(@NotNull SpiContextData contextData,
                                                                                  @NotNull SpiAccountReference accountReference,
                                                                                  @NotNull SpiAccountConsent accountConsent,
                                                                                  @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        byte[] aspspConsentData = aspspConsentDataProvider.loadAspspConsentData();

        try {
            SCAResponseTO response = applyAuthorisation(aspspConsentData);

            logger.info("Requested details for account, ACCOUNT-ID: {}", accountReference.getResourceId());

            SpiCardAccountDetails cardAccountDetails = Optional
                                                               .ofNullable(accountRestClient.getAccountDetailsById(accountReference.getResourceId()).getBody())
                                                               .map(accountMapper::toSpiCardAccountDetails)
                                                               .orElseThrow(() -> FeignExceptionHandler.getException(HttpStatus.NOT_FOUND, RESPONSE_STATUS_200_WITH_EMPTY_BODY));

            cardAccountDetails.setMaskedPan(ibanResolverMockService.getMaskedPanByIban(cardAccountDetails.getAspspAccountId())); // TODO: Remove when ledgers starts supporting card accounts https://git.adorsys.de/adorsys/xs2a/aspsp-xs2a/issues/1246

            aspspConsentDataProvider.updateAspspConsentData(tokenService.store(response));
            SpiCardAccountDetails accountDetailsWithOwnerName = enrichWithOwnerName(cardAccountDetails, accountConsent.getAccess());

            return SpiResponse.<SpiCardAccountDetails>builder()
                           .payload(accountDetailsWithOwnerName)
                           .build();

        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Request card account details for account failed: consent ID {}, resource ID {}, devMessage {}", accountConsent.getId(), accountReference.getResourceId(), devMessage);
            return SpiResponse.<SpiCardAccountDetails>builder()
                           .error(buildTppMessage(feignException))
                           .build();
        } finally {
            authRequestInterceptor.setAccessToken(null);
        }
    }
