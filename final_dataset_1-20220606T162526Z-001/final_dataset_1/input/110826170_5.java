protected static PhoneNumber getPhoneNumber(@NonNull String providedPhoneNumber) {
        String countryCode = DEFAULT_COUNTRY_CODE;
        String countryIso = DEFAULT_LOCALE.getCountry();

        String phoneNumber = providedPhoneNumber;
        if (providedPhoneNumber.startsWith("+")) {
            countryCode = countryCodeForPhoneNumber(providedPhoneNumber);
            countryIso = countryIsoForCountryCode(countryCode);
            phoneNumber = stripCountryCode(providedPhoneNumber, countryCode);
        }
        return new PhoneNumber(phoneNumber, countryIso, countryCode);
    }
