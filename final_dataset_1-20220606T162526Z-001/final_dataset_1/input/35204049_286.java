@Override
    public int compare(String s1, String s2) {
       if (s1.equals(s2)) {
            return 0;
        }

        int s1Order = ordering.indexOf(s1);
        int s2Order = ordering.indexOf(s2);

        if (s1Order == -1 && s2Order == -1) {
            return s1.compareTo(s2);
        }

        if (s1Order != -1 && s2Order != -1) {
            return s1Order - s2Order;
        }

        return s1Order == -1 ? 1 : -1;

    }
