public List<Locale> getAcceptableLanguages() {
        List<String> ls = getListValues(HttpHeaders.ACCEPT_LANGUAGE);
        if (ls.isEmpty()) {
            return Collections.singletonList(new Locale("*"));
        }

        List<Locale> newLs = new ArrayList<>();
        Map<Locale, Float> prefs = new HashMap<>();
        for (String l : ls) {
            String[] pair = l.split(";");

            Locale locale = HttpUtils.getLocale(pair[0].trim());

            newLs.add(locale);
            if (pair.length > 1) {
                String[] pair2 = pair[1].split("=");
                if (pair2.length > 1) {
                    prefs.put(locale, JAXRSUtils.getMediaTypeQualityFactor(pair2[1].trim()));
                } else {
                    prefs.put(locale, 1F);
                }
            } else {
                prefs.put(locale, 1F);
            }
        }
        if (newLs.size() <= 1) {
            return newLs;
        }

        Collections.sort(newLs, new AcceptLanguageComparator(prefs));
        return newLs;

    }
