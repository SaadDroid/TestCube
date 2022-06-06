public BooleanExpression loe(String val) {
        return BooleanOperation.create(Ops.LOE, this, literal(val));
    }
