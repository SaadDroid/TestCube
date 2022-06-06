public static <T> String joinString(Collection<T> objects, String delim) {
        StringBuilder sb = new StringBuilder();
        Object[] oarray = objects.toArray();
        int nobjects = oarray.length;
        if (nobjects == 0) {
            return "";
        }
        for (int i = 0; i < nobjects - 1; i++) {
            sb.append(String.format("%s%s", oarray[i].toString(), delim));
        }
        sb.append(String.format("%s", oarray[nobjects - 1]));
        return sb.toString();
    }
