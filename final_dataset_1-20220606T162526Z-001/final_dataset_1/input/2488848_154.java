@Override
    public NODE visit(Constant<?> expr, Bindings bindings) {
        if (expr.getType().equals(String.class)) {
            return new LIT(expr.getConstant().toString());
        } else if (NODE.class.isAssignableFrom(expr.getType())) {
            return (NODE) expr.getConstant();
        } else {
            UID datatype = ConverterRegistryImpl.DEFAULT.getDatatype(expr.getType());
            String value = ConverterRegistryImpl.DEFAULT.toString(expr.getConstant());
            return new LIT(value, datatype);
        }

    }
