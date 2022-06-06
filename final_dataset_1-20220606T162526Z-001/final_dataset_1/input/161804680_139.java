@Override
    public SpiResponse<SpiAccountDetails> requestAccountDetailForAccount(@NotNull SpiContextData contextData,
                                                                         boolean withBalance,
                                                                         @NotNull SpiAccountReference accountReference,
                                                                         @NotNull SpiAccountConsent accountConsent,
                                                                         @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        byte[] aspspConsentData = aspspConsentDataProvider.loadAspspConsentData();

        try {
            SCAResponseTO response = applyAuthorisation(aspspConsentData);

            logger.info("Requested details for account, ACCOUNT-ID: {}, withBalance: {}",
                        accountReference.getResourceId(), withBalance);
            SpiAccountDetails accountDetails = Optional.ofNullable(accountRestClient.getAccountDetailsById(accountReference.getResourceId()).getBody())
                                                       .map(accountMapper::toSpiAccountDetails)
                                                       .orElseThrow(() -> FeignExceptionHandler.getException(HttpStatus.NOT_FOUND, RESPONSE_STATUS_200_WITH_EMPTY_BODY));

            SpiAccountDetails accountDetailsWithOwnerName = enrichWithOwnerName(accountDetails, accountConsent.getAccess());

            if (!withBalance) {
                accountDetailsWithOwnerName.emptyBalances();
            }
            logger.info("The responded account RESOURCE-ID: {}", accountDetailsWithOwnerName.getResourceId());

            aspspConsentDataProvider.updateAspspConsentData(tokenService.store(response));

            return SpiResponse.<SpiAccountDetails>builder()
                           .payload(accountDetailsWithOwnerName)
                           .build();

        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Request account details for account failed: consent ID {}, resource ID {}, devMessage {}", accountConsent.getId(), accountReference.getResourceId(), devMessage);
            return SpiResponse.<SpiAccountDetails>builder()
                           .error(buildTppMessage(feignException))
                           .build();
        } finally {
            authRequestInterceptor.setAccessToken(null);
        }
    }
