public static String interpolate(String expression, Map<String, String> params) {
        if (expression == null || expression.length() == 0) {
            throw new IllegalArgumentException("glob pattern is empty!");
        }
        if (expression.indexOf('$') < 0) {
            return expression;
        }
        Matcher matcher = VARIABLE_PATTERN.matcher(expression);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) { // 逐个匹配
            String key = matcher.group(1);
            String value = params == null ? null: params.get(key);
            if (value == null) {
            	value = "";
            }
            matcher.appendReplacement(sb, value);
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
