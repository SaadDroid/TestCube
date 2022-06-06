public void showRGB() {
        Class colorClazz = null;
        try {
            colorClazz = Class.forName(colorClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Color color = null;
        try {
            color = (Color) colorClazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        color.showRGB();
    }
