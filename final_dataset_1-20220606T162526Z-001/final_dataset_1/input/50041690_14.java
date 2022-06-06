@Override
    public Either<Set<KEMException>, Term> apply(TermCons tc) {
        Either<Set<KEMException>, Term> vis;
        if (tc.production().isSyntacticSubsort() && tc.production().klabel().isEmpty()) {
            // eliminating syntactic subsort
            vis = apply(tc.get(0));
        } else if (!tc.production().att().contains(Att.BRACKET()) && tc.production().klabel().isEmpty()) {
            return Left.apply(Sets.newHashSet(KEMException.innerParserError(
                    "Only subsort productions are allowed to have no #klabel attribute", tc)));
        } else {
            // invalidate the hashCode cache
            vis = super.apply(tc);
        }
        return vis;
    }
