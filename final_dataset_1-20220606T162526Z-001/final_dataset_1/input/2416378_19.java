public static <T> T callMethod(Class<T> retClass, Class<?> targetClass, Object target, String method, Class[] argClasses, Object[] args) {
        try {
            Method classMethod = targetClass.getDeclaredMethod(method, argClasses);

            return AccessController.doPrivileged(
                    new SetMethodPrivilegedAction<T>(classMethod, target, args));

        } catch (NoSuchMethodException e) {
            throw new TransfuseInjectionException("Exception during method injection: NoSuchFieldException", e);
        } catch (PrivilegedActionException e) {
            throw new TransfuseInjectionException("PrivilegedActionException Exception during field injection", e);
        } catch (Exception e) {
            throw new TransfuseInjectionException("Exception during field injection", e);
        }
    }
