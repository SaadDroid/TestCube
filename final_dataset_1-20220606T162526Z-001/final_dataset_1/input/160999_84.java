public static String[] getHostAndPort(String s) throws ConfigException {
        if (s.startsWith("[")) {
            int i = s.indexOf("]");
            if (i < 0) {
                throw new ConfigException(s + " starts with '[' but has no matching ']:'");
            }
            if (i + 2 == s.length()) {
                throw new ConfigException(s + " doesn't have a port after colon");
            }
            if (i + 2 < s.length()) {
                String[] sa = s.substring(i + 2).split(":");
                String[] nsa = new String[sa.length + 1];
                nsa[0] = s.substring(1, i);
                System.arraycopy(sa, 0, nsa, 1, sa.length);
                return nsa;
            }
            return new String[]{s.replaceAll("\\[|\\]", "")};
        } else {
            return s.split(":");
        }
    }
