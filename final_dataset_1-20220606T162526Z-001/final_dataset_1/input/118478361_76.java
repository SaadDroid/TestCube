@Override
    public Rule getRuleAnnotation(int ruleIndex) {
        String methodName = String.format("rule%d", ruleIndex);
        Class<? extends MixedJavaTimeSignavioBaseDecision> cls = this.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (methodName.equals(method.getName())) {
                return method.getAnnotation(Rule.class);
            }
        }
        return null;
    }
