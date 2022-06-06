public static List<ServerLifecycleComponent> loadServerComponents(String[] componentClassNames,
                                                                      BookieConfiguration conf,
                                                                      StatsLogger statsLogger) {
        List<Class<? extends ServerLifecycleComponent>> componentClasses =
            Lists.newArrayListWithExpectedSize(componentClassNames.length);
        for (String componentClsName : componentClassNames) {
            componentClasses.add(ReflectionUtils.forName(componentClsName, ServerLifecycleComponent.class));
        }
        return Lists.transform(componentClasses, cls -> newComponent(cls, conf, statsLogger));

    }
