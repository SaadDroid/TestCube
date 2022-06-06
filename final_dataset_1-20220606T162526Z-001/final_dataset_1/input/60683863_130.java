public static Method findMethodByMethodSignature(Class<?> clazz, String methodName, String[] parameterTypes)
	        throws NoSuchMethodException, ClassNotFoundException {
	    String signature = clazz.getName() + "." + methodName;
        if(parameterTypes != null && parameterTypes.length > 0){
            signature += StringUtils.join(parameterTypes);
        }
        Method method = Signature_METHODS_CACHE.get(signature);
        if(method != null){
            return method;
        }
	    if (parameterTypes == null) {
            List<Method> finded = new ArrayList<Method>();
            for (Method m : clazz.getMethods()) {
                if (m.getName().equals(methodName)) {
                    finded.add(m);
                }
            }
            if (finded.isEmpty()) {
                throw new NoSuchMethodException("No such method " + methodName + " in class " + clazz);
            }
            if(finded.size() > 1) {
                String msg = String.format("Not unique method for method name(%s) in class(%s), find %d methods.",
                        methodName, clazz.getName(), finded.size());
                throw new IllegalStateException(msg);
            }
            method = finded.get(0);
        } else {
            Class<?>[] types = new Class<?>[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i ++) {
                types[i] = ReflectUtils.name2class(parameterTypes[i]);
            }
            method = clazz.getMethod(methodName, types);
            
        }
	    Signature_METHODS_CACHE.put(signature, method);
        return method;
	}
