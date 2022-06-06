@Override
    public String getAsText() {
        UID uid = (UID) getValue();
        if (uid == null) {
            return "";
        } else {
            return uid.getId();
        }
    }
