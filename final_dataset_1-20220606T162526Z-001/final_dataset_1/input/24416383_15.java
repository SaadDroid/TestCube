@Override
    public boolean matches(String s1, String s2) {
        boolean matches = false;
        if (s1 == null && s2 == null)
            matches = true;
        else{
            matches = super.matches(clean(s1),clean(s2));
        }
        return matches;
    }
