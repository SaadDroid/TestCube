@VisibleForTesting
    boolean containsUndesiredCharacters(String s) {

        // This is done with strings rather than characters because the initialisation of the set is much easier.
        // Otherwise we end up with a Set<Character> being initialised from a List<char>
        //
        final String[] DODGY_LDAP_CHARS = { ",", "+", "\"", "\\", "<", ">", ";" };
        Set<String> dodgyChars = new HashSet<String>(Arrays.asList(DODGY_LDAP_CHARS));
        for(int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            if (dodgyChars.contains(sub)) {
                return true;
            }
        }
        return false;
    }
