public Unification unify(Type type, TypeScope scope) {
        return generate(scope).unify_(type.generate(scope), scope);
    }
