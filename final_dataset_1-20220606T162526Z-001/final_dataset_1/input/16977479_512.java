public static List<String> getScopeClaims(String... scope) {
        List<String> claims = new ArrayList<>();
        if (scope != null) {
            for (String s : scope) {
                if (SCOPES_MAP.containsKey(s)) {
                    claims.addAll(SCOPES_MAP.get(s));
                }
            }
        }
        return claims;
    }
