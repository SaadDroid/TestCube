static boolean nameExists(StringBuilder sb, String name) {
        int index = sb.indexOf(name);
        while (index != -1) {
            final int end = index + name.length();
            if ((sb.length() == end || sb.charAt(end) == '.') && (index == 0 || sb.charAt(index-1) == '.')) {
                return true;
            }

            index = sb.indexOf(name, end + 1);
        }
        return false;
    }
