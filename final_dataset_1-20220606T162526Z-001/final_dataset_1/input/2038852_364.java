public static String expand(String ipStr, int nwords) throws IPStringConversionException {
        StringBuilder sb = new StringBuilder();
        String hex;
        int[] vals;
        int[] expanded_vals;
        int i;
        vals = splitvals(ipStr);
        if (vals == null) {
            throw new IPStringConversionException("Error converting hex to binary in IPv6 ip");
        }
        expanded_vals = expand(vals, nwords);
        for (i = 0; i < nwords - 1; i++) {
            hex = String.format("%s:", BitConverters.int16bit2hex(expanded_vals[i]));
            sb.append(hex);
        }
        hex = String.format("%s", BitConverters.int16bit2hex(expanded_vals[nwords - 1]));
        sb.append(hex);
        return sb.toString();
    }
