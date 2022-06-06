@Override
    public boolean check(String email) {
        if (email == null || localpartPattern == null) {
            return false;
        }
        int pos = email.indexOf(Constant.AT);
        if (pos == -1) {
            return false;
        }
        String inputLocalPart = email.substring(0, pos);
        if (!localpartPattern.matcher(inputLocalPart).matches()) {
            return false;
        }
        return true;
    }
