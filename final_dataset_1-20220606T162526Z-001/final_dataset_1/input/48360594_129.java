public String removeRepeatedChar(String inputStr) {
        if (StringUtils.isEmpty(inputStr)) {
            return inputStr;
        }
        Matcher matcher = removeRepeatCharPattern.matcher(inputStr);
        return matcher.replaceAll("$1"); //$NON-NLS-1$
    }
