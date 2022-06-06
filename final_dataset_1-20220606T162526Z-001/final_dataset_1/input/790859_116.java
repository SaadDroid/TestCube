@Deprecated
    public static Policy getPolicy(String name) throws Exception {
        return getPolicy(new QName(name));
    }
