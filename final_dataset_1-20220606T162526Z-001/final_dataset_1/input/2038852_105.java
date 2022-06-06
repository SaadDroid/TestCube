public static String set2commastr(Set<String> values) {
        int i;
        List<String> valList = new ArrayList<String>(values);
        Collections.sort(valList);
        Object[] objAry = valList.toArray();
        StringBuilder sb = new StringBuilder();
        if (objAry.length == 0) {
            return sb.toString();
        }
        i = 1;
        for (i = 0; i < objAry.length - 1; i++) {
            sb.append(String.format("%s,", (String) objAry[i]));
        }
        sb.append(objAry[i]);
        return sb.toString();
    }
