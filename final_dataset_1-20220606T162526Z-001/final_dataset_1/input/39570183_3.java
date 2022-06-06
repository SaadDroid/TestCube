public static boolean isValidDomainName(String domainName) {
        Pattern p = Pattern.compile(DOMAIN_NAME_PATTERN);
        Matcher m = p.matcher(domainName);
        return m.matches();
    }
