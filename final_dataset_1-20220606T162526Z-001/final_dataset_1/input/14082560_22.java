public boolean isSuperclass(Concept x, Concept y) {
        return this.superclasses.get(y).contains(x);
    }
