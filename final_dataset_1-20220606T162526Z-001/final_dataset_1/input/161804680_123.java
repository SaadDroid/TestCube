@Override
    public SpiResponse<SpiTransactionReport> requestTransactionsForAccount(@NotNull SpiContextData contextData,
                                                                           @NotNull SpiTransactionReportParameters spiTransactionReportParameters,
                                                                           @NotNull SpiAccountReference accountReference,
                                                                           @NotNull SpiAccountConsent accountConsent,
                                                                           @NotNull SpiAspspConsentDataProvider aspspConsentDataProvider) {
        // TODO Remove it https://git.adorsys.de/adorsys/xs2a/aspsp-xs2a/issues/1100
        if (BookingStatus.INFORMATION == spiTransactionReportParameters.getBookingStatus()) {
            logger.info("Retrieving mock standing order report for account: {}", accountReference.getResourceId());
            SpiTransactionReport transactionReport = new SpiTransactionReport(null, createStandingOrderReportMock(), null,
                                                                              processAcceptMediaType(spiTransactionReportParameters.getAcceptMediaType()), null);
            return SpiResponse.<SpiTransactionReport>builder()
                           .payload(transactionReport)
                           .build();
        }


        byte[] aspspConsentData = aspspConsentDataProvider.loadAspspConsentData();
        // TODO https://git.adorsys.de/adorsys/xs2a/aspsp-xs2a/issues/1106
        // For dates there are alternative test values in case of receiving NULLs, ledgers must receive dates for retrieving transactions request
        // Will be deleted when Ledgers provides supporting getting transactions list without dates.
        LocalDate dateFrom = Optional.ofNullable(spiTransactionReportParameters.getDateFrom())
                                     .orElse(LocalDate.now().minusMonths(6));
        LocalDate dateTo = Optional.ofNullable(spiTransactionReportParameters.getDateTo())
                                   .orElse(LocalDate.now());
        boolean withBalance = spiTransactionReportParameters.isWithBalance();
        String acceptMediaType = spiTransactionReportParameters.getAcceptMediaType();
        String entryReferenceFrom = spiTransactionReportParameters.getEntryReferenceFrom();
        Boolean deltaList = spiTransactionReportParameters.getDeltaList();

        try {
            SCAResponseTO response = applyAuthorisation(aspspConsentData);

            logger.info("Requested transactions for account: {}, dates from: {}, to: {}, withBalance: {}, entryReferenceFrom: {}, deltaList: {}",
                        accountReference.getResourceId(), dateFrom, dateTo, withBalance, entryReferenceFrom, deltaList);
            List<SpiTransaction> transactions = Optional.ofNullable(
                    accountRestClient.getTransactionByDates(accountReference.getResourceId(), dateFrom, dateTo).getBody())
                                                        .map(accountMapper::toSpiTransactions).orElseGet(ArrayList::new);
            List<SpiAccountBalance> balances = getSpiAccountBalances(contextData, withBalance, accountReference,
                                                                     accountConsent, aspspConsentDataProvider);

            SpiTransactionReport transactionReport = new SpiTransactionReport("downloadId", transactions, balances,
                                                                              processAcceptMediaType(acceptMediaType), null);
            logger.info("Finally found {} transactions.", transactionReport.getTransactions().size());

            aspspConsentDataProvider.updateAspspConsentData(tokenService.store(response));

            return SpiResponse.<SpiTransactionReport>builder()
                           .payload(transactionReport)
                           .build();
        } catch (FeignException feignException) {
            String devMessage = feignExceptionReader.getErrorMessage(feignException);
            logger.error("Request transactions for account failed: consent ID {}, resource ID {}, devMessage {}", accountConsent.getId(), accountReference.getResourceId(), devMessage);
            return SpiResponse.<SpiTransactionReport>builder()
                           .error(buildTppMessage(feignException))
                           .build();
        } finally {
            authRequestInterceptor.setAccessToken(null);
        }
    }
