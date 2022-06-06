@Override
    public <T extends TypeUsage> TypeUsage replaceTypeVariables(Map<String, T> typeParams) {
        if (typeParams.isEmpty()) {
            return this;
        }
        List<FormalParameterSymbol> replacedParams = internalInvokableDefinition
                .getFormalParameters()
                .stream()
                .map((fp) -> new FormalParameterSymbol(
                        fp.getType().replaceTypeVariables(typeParams),
                        fp.getName(),
                        fp.hasDefaultValue()))
                .collect(Collectors.toList());
        if (internalInvokableDefinition.isMethod()) {
            return new InvokableReferenceTypeUsage(new InternalMethodDefinition(
                    internalInvokableDefinition.asMethod().getMethodName(),
                    replacedParams,
                    internalInvokableDefinition.getReturnType().replaceTypeVariables(typeParams),
                    internalInvokableDefinition.asMethod().getJvmMethodDefinition()));
        } else if (internalInvokableDefinition.isConstructor()) {
            return new InvokableReferenceTypeUsage(new InternalConstructorDefinition(
                    internalInvokableDefinition.getReturnType().replaceTypeVariables(typeParams),
                    replacedParams,
                    internalInvokableDefinition.asConstructor().getJvmConstructorDefinition()));
        } else {
            throw new UnsupportedOperationException();
        }
     }
