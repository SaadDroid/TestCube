public void enableMvc(ConfigurableListableBeanFactory factory, BundleContext context) {
        if (factory == null) {
            throw new IllegalArgumentException("Method argument factory must not be null.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Method argument context must not be null.");
        }

        BundleAwareServletConfig servletConfig = new BundleAwareServletConfig(context);

        factory.addBeanPostProcessor(new ServletContextAwareProcessor(this.servletContext, servletConfig));
        factory.ignoreDependencyInterface(ServletContextAware.class);
        factory.ignoreDependencyInterface(ServletConfigAware.class);

        final BundleSpecificDispatcherServlet dispatcherServlet = createBundleSpecificDispatcherServlet(factory, servletConfig);
        factory.registerSingleton(generateNameFor(BundleSpecificDispatcherServlet.class), dispatcherServlet);
        this.mvcCapableBundles.put(context.getBundle(), dispatcherServlet);
    }
