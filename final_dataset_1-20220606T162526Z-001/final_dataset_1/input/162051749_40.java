void checkSearchUrlValidity(String yandexSearchUrl) {
        if (yandexSearchUrl == null || yandexSearchUrl.isEmpty()) {
            throw new IllegalArgumentException("Search URL must be supplied.");
        }
        if (!yandexSearchUrl.matches(SEARCH_URL_PATTERN)) {
            throw new IllegalArgumentException(
                    "The supplied search URL is invalid. It must start with \"http://xmlsearch.yandex.ru/xmlsearch\" and contain a valid user and key parameter.");
        }
    }
