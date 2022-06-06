public MailServer load(String clazz, String realm) throws IllegalStateException {
       try {
            return (MailServer) Class.forName(clazz).getDeclaredConstructor(String.class).newInstance(realm);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e) {
            throw new IllegalStateException(e);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
