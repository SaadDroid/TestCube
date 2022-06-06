public static String getCommaSeparatedStringFromList(final List<String> values){
        if(values == null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (String next : values) {
            builder.append(next).append(",");
        }
        String commaSeparated = builder.toString();
        return commaSeparated.substring(0, commaSeparated.length() - 1);
    }
