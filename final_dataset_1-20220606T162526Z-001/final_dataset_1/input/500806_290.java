public static void addConstructorArgReference(BeanDefinitionBuilder builder, String beanReference) {
        if (StringUtils.hasText(beanReference)) {
            builder.addConstructorArgReference(beanReference);
        }
    }
