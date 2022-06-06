public void unique(Object what, Set<?> where, String component) {
        that(!where.contains(what), "duplicated " + component + " [value=" + what + ']');
    }
