@Override
    public Object invoke(final Object proxy, final Method method, final Object[] args)
        throws Throwable {
        switch (method.getName()) {
            case "equals":
                return equals(args.length > 0 ? args[0] : null);

            case "hashCode":
                return hashCode();

            case "toString":
                return toString();

            default:
                break;
        }

        return decoratedDispatch.get(method).apply(args);
    }
