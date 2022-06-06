public static Optional<Method> getTargetMethod(Message m) {
        Method method;
        BindingOperationInfo bop = m.getExchange().getBindingOperationInfo();
        if (bop != null) {
            MethodDispatcher md = (MethodDispatcher) m.getExchange().getService().get(MethodDispatcher.class.getName());
            method = md.getMethod(bop);
        } else {
            method = (Method) m.get("org.apache.cxf.resource.method");
        }
        return Optional.ofNullable(method);
    }
