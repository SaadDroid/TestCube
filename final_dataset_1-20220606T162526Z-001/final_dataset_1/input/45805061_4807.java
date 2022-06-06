public MulticurveSensitivity parSpreadCurveSensitivity(final DepositIbor deposit, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(deposit, "Deposit");
    ArgumentChecker.notNull(multicurve, "Multicurves");
    final Map<String, List<ForwardSensitivity>> mapFwd = new HashMap<>();
    final List<ForwardSensitivity> listForward = new ArrayList<>();
    listForward.add(new SimplyCompoundedForwardSensitivity(deposit.getStartTime(), deposit.getEndTime(), deposit.getAccrualFactor(), 1.0));
    mapFwd.put(multicurve.getName(deposit.getIndex()), listForward);
    return MulticurveSensitivity.ofForward(mapFwd);
  }
