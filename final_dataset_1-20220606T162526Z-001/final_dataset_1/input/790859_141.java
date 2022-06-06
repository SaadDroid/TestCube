public static JavaService fromClass(Class<?> serviceInterface) {
        HashSet<ServiceOperation> ops = new HashSet<ServiceOperation>();
        // Use all methods in type hierarchy for interfaces, but avoid this
        // for classes which can drag in garbage from java.lang.Object, etc.
        Method[] methods = serviceInterface.isInterface()
                ? serviceInterface.getMethods()
                : serviceInterface.getDeclaredMethods();
        for (Method m : methods) {
            // We only consider public methods
            if (Modifier.isPublic(m.getModifiers())) {
                // At this point, we only accept methods with a single 
                // parameter which maps to the input message
                Class<?>[] params = m.getParameterTypes();
                if (params.length > 1) {
                    throw APIMessages.MESSAGES.serviceOpNeedOneParamater();
                }

                // Create the appropriate service operation and add it to the list
                OperationTypeQNames operationTypeNames = new OperationTypeQNames(m);
                if (m.getReturnType().equals(Void.TYPE)) {
                    ops.add(new InOnlyOperation(m.getName(), operationTypeNames.in()));
                } else {
                    ops.add(new InOutOperation(m.getName(), operationTypeNames.in(), operationTypeNames.out(), operationTypeNames.fault()));
                }
            }
        }
        
        return new JavaService(ops, serviceInterface);
    }
