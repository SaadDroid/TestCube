public FederatedServiceMethodInvocationHandler getHandlerForMethod(
      Method method) {

    FederatedByAgencyIdMethod byAgency = method.getAnnotation(FederatedByAgencyIdMethod.class);
    if (byAgency != null)
      return new FederatedByAgencyIdMethodInvocationHandlerImpl(method,
          byAgency.argument(), byAgency.propertyExpression());

    FederatedByAnyEntityIdMethod byAnyEntityId = method.getAnnotation(FederatedByAnyEntityIdMethod.class);
    if (byAnyEntityId != null)
      return new FederatedByAnyEntityIdMethodInvocationHandlerImpl(method,
          byAnyEntityId.argument(), byAnyEntityId.properties(),
          byAnyEntityId.agencyIdProperties());

    FederatedByEntityIdMethod ann0 = method.getAnnotation(FederatedByEntityIdMethod.class);
    if (ann0 != null)
      return new FederatedByEntityIdMethodInvocationHandlerImpl(method,
          ann0.argument(), ann0.propertyExpression());

    FederatedByEntityIdsMethod ann1 = method.getAnnotation(FederatedByEntityIdsMethod.class);
    if (ann1 != null)
      return new FederatedByEntityIdsMethodInvocationHandlerImpl(
          ann1.argument());

    FederatedByBoundsMethod ann2 = method.getAnnotation(FederatedByBoundsMethod.class);
    if (ann2 != null)
      return new FederatedByBoundsMethodInvocationHandlerImpl(
          ann2.lat1Argument(), ann2.lon1Argument(), ann2.lat2Argument(),
          ann2.lon2Argument());

    FederatedByLocationMethod ann3 = method.getAnnotation(FederatedByLocationMethod.class);
    if (ann3 != null)
      return new FederatedByLocationMethodInvocationHandlerImpl(
          ann3.latArgument(), ann3.lonArgument());

    FederatedByAggregateMethod ann4 = method.getAnnotation(FederatedByAggregateMethod.class);
    if (ann4 != null) {
      EMethodAggregationType aggregationType = getAggregationTypeForMethod(method);
      return new FederatedByAggregateMethodInvocationHandlerImpl(
          aggregationType);
    }

    FederatedByCoordinateBoundsMethod ann5 = method.getAnnotation(FederatedByCoordinateBoundsMethod.class);
    if (ann5 != null)
      return new FederatedByCoordinateBoundsMethodInvocationHandlerImpl(method,
          ann5.argument(), ann5.propertyExpression());

    FederatedByCoordinatePointsMethod ann6 = method.getAnnotation(FederatedByCoordinatePointsMethod.class);
    if (ann6 != null) {
      int[] argumentIndices = ann6.arguments();
      String[] expressions = ann6.propertyExpressions();
      if (expressions.length == 0)
        expressions = new String[argumentIndices.length];
      return new FederatedByCoordinatePointsMethodInvocationHandlerImpl(method,
          argumentIndices, expressions);
    }

    FederatedByCustomMethod ann7 = method.getAnnotation(FederatedByCustomMethod.class);
    if (ann7 != null) {
      Class<? extends FederatedServiceMethodInvocationHandler> handlerClass = ann7.handler();
      try {
        return handlerClass.newInstance();
      } catch (Exception ex) {
        throw new ServiceException(
            "error creating FederatedServiceMethodInvocationHandler of type "
                + handlerClass, ex);
      }
    }

    throw new IllegalArgumentException(
        "No FederatedService method annotation for method: " + method);
  }
