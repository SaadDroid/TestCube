public final void addApplicationContext(ApplicationContext ac) {
        if (!appContexts.contains(ac)) {
            appContexts.add(ac);
            List<ApplicationContext> inactiveApplicationContexts = new ArrayList<>();
            Iterator<ApplicationContext> it = appContexts.iterator();
            while (it.hasNext()) {
                ApplicationContext c = it.next();
                if (c instanceof ConfigurableApplicationContext
                    && !((ConfigurableApplicationContext)c).isActive()) {
                    inactiveApplicationContexts.add(c);
                }
            }
            // Remove the inactive application context here can avoid the UnsupportedOperationException
            for (ApplicationContext context : inactiveApplicationContexts) {
                appContexts.remove(context);
            }
            initWildcardDefinitionMap();
        }
    }
