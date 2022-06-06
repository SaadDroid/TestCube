@Override
    public String getUrlBinding(Class<? extends ActionBean> clazz) {
        String binding = super.getUrlBinding(clazz);

        // If there's no annotated binding, and the class is concrete
        if (binding == null && !Modifier.isAbstract(clazz.getModifiers())) {
            binding = getUrlBinding(clazz.getName());
        }

        return binding;
    }
