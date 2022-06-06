@Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(componentName + ":" + name, mode);
    }
