@Override
    public double getWeight(String str1, String str2) {
        String code1 = algorithm.encode(str1);
        String code2 = algorithm.encode(str2);
        if (code1 == null || code2 == null) { // something wrong with input string (maybe a \n)
            return 0d;
        }
        int maxLengh = Math.max(code1.length(), code2.length());
        // check specific case when input strings are numeric values such as 23
        if (maxLengh == 0) {
            if (StringUtils.equalsIgnoreCase(str1, str2)) {
                return 1d; // as both strings identically zero length
            } else {
                return 0d; // strings are different but both yield to an empty code
            }
        }
        return StringComparisonUtil.difference(code1, code2) / (double) maxLengh;
    }
