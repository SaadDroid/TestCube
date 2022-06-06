public String correctCapitalization(String value) {
        String[] split = value.split("\\s");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String part = split[i];
            if (i > 0) {
                result.append(" ");
            }
            String temp = part;
            // last part of sentence
            if (i == split.length - 1 && part.endsWith(".")) {
                temp = part.substring(0, part.length() - 1);
            }
            if (getLowercaseRatio(temp) > lowercaseThreshold) {
                part = part.toLowerCase();
            }
            result.append(part);
        }
        return result.toString();
    }
