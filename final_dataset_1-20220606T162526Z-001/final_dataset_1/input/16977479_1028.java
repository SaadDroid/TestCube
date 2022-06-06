public Map<TypeCode, RaisesType> getOperationExceptions(
                                         OperationType operation,
                                         CorbaTypeMap map) {
        if (orb == null) {
            prepareOrb();
        }
        Map<TypeCode, RaisesType> exceptions = new HashMap<>();
        List<RaisesType> exList = operation.getRaises();
        if (exList != null) {
            for (int i = 0; i < exList.size(); ++i) {
                RaisesType ex = exList.get(i);
                TypeCode tc = CorbaUtils.getTypeCode(orb, ex.getException(), map);
                exceptions.put(tc, ex);
            }
        }

        return exceptions;
    }
