public static List<Object> processParameters(OperationResourceInfo ori,
                                                 MultivaluedMap<String, String> values,
                                                 Message message)
        throws IOException, WebApplicationException {

        Class<?>[] parameterTypes = ori.getInParameterTypes();
        List<Parameter> paramsInfo = ori.getParameters();
        boolean preferModelParams = paramsInfo.size() > parameterTypes.length
            && !PropertyUtils.isTrue(message.getContextualProperty("org.apache.cxf.preferMethodParameters"));

        final int parameterTypesLength = preferModelParams ? paramsInfo.size() : parameterTypes.length;
        if (parameterTypesLength < 1) {
            return Collections.emptyList();
        }

        Type[] genericParameterTypes = ori.getInGenericParameterTypes();
        Annotation[][] anns = ori.getInParameterAnnotations();
        Object[] params = new Object[parameterTypesLength];

        // Ensure we process all request-body parameters first, then all @*Params, etc.
        ParamTuple[] tuple = new ParamTuple[parameterTypesLength];
        for (int i = 0; i < parameterTypesLength; i++) {
            tuple[i] = new ParamTuple();
            if (!preferModelParams) {
                tuple[i].param = parameterTypes[i];
                tuple[i].genericParam = InjectionUtils.processGenericTypeIfNeeded(
                    ori.getClassResourceInfo().getServiceClass(), tuple[i].param, genericParameterTypes[i]);
                tuple[i].param = InjectionUtils.updateParamClassToTypeIfNeeded(tuple[i].param,
                                                                               tuple[i].genericParam);
                tuple[i].paramAnns = anns == null ? EMPTY_ANNOTATIONS : anns[i];
            } else {
                tuple[i].param = paramsInfo.get(i).getJavaType();
                tuple[i].genericParam = tuple[i].param;
                tuple[i].paramAnns = EMPTY_ANNOTATIONS;
            }
            if (paramsInfo.get(i).getType() == ParameterType.REQUEST_BODY) {
                params[i] = processRequestBodyParameter(tuple[i].param,
                                                        tuple[i].genericParam,
                                                        tuple[i].paramAnns,
                                                        message,
                                                        ori);
            }
        }
        for (int i = 0; i < parameterTypesLength; i++) {

            if (paramsInfo.get(i).getType() != ParameterType.REQUEST_BODY) {
                params[i] = processParameter(tuple[i].param,
                                             tuple[i].genericParam,
                                             tuple[i].paramAnns,
                                             paramsInfo.get(i),
                                             values,
                                             message,
                                             ori);
            }
        }

        return Arrays.asList(params);
    }
