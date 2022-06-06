public static Object[] realize(Object[] objs, Class<?>[] types) {
        if (objs.length != types.length)
            throw new IllegalArgumentException("args.length != types.length");
        Object[] dests = new Object[objs.length];
        for (int i = 0; i < objs.length; i ++) {
            dests[i] = realize(objs[i], types[i]);
        }
        return dests;
    }
