public String revertIgnoredSections(String sortedXml) {
        Matcher matcher = InstructionType.TOKEN_PATTERN.matcher(sortedXml);

        StringBuffer returnValue = new StringBuffer();

        while (matcher.find()) {
            int index = Integer.parseInt(matcher.group(1));
            String replacement = ignoredSections.get(index);
            String oneBackslashBeforeBackslash = replacement.replace("\\", "\\\\");
            String oneBackslashBeforeDollar = oneBackslashBeforeBackslash.replace("$", "\\$");

            matcher.appendReplacement(returnValue, oneBackslashBeforeDollar);
        }
        matcher.appendTail(returnValue);

        return returnValue.toString();
    }
