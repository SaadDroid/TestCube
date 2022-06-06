public static String encodeStr(String string) {
        //- . _ ~ ( ) ' ! * : @ , ;
        Pattern p = Pattern.compile("[^A-Za-z0-9\\-\\.\\_\\(\\)\\'\\!\\:\\,\\;\\*]");

        Matcher      m  = p.matcher(string);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String        chars = m.group();
            StringBuilder hex   = new StringBuilder("@").append(Hex.encodeHex(chars.getBytes()));
            while (hex.length() < 5)
                hex.insert(1, "0");

            m.appendReplacement(sb, hex.toString());
        }
        m.appendTail(sb);
        return sb.toString();
    }
