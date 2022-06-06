public static Term parse(String paramName, String paramValue) {
        String termStr;
        if (Utils.empty(paramValue) && paramName.contains("(")) {
            termStr = paramName;
        } else {
            if (Utils.empty(paramValue))
                paramValue = "true";

            termStr = "eq(" + paramName + "," + paramValue + ")";
        }
        Term term = RqlParser.parse(termStr);
        return term;
    }
