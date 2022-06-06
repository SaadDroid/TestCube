@Override
  @OverridingMethodsMustInvokeSuper
  public List<WorkUnit> pack(List<WorkUnit> workUnitsIn, WorkUnitWeighter weighter) {

    if (this.maxWeightPerUnit <= 0) { // just return the input
      return workUnitsIn;
    }

    List<WorkUnit> workUnits = Lists.newArrayList(workUnitsIn);

    long smallUnitSize = 0; // total size of work units smaller than maxWeightPerUnit
    int largeUnits = 0; // number of work units larger than maxWeightPerUnit
    for (WorkUnit workUnit : workUnits) {
      long weight = weighter.weight(workUnit);
      if (weight <= this.maxWeightPerUnit) {
        smallUnitSize += weight;
      } else {
        largeUnits++;
      }
    }
    int estimateByWeight = largeUnits + (int) ((smallUnitSize - 1) / this.maxWeightPerUnit) + 1;
    int estimatedMultiWorkUnits = Math.min(estimateByWeight, workUnits.size());

    MinMaxPriorityQueue<MultiWorkUnit> pQueue = MinMaxPriorityQueue.orderedBy(new MultiWorkUnitComparator()).create();
    for (int i = 0; i < estimatedMultiWorkUnits; i++) {
      pQueue.add(MultiWorkUnit.createEmpty());
    }

    Collections.sort(workUnits, Collections.reverseOrder(new WeightComparator(weighter)));

    for (WorkUnit workUnit : workUnits) {
      MultiWorkUnit lightestMultiWorkUnit = pQueue.peek();
      long weight = Math.max(1, weighter.weight(workUnit));
      long multiWorkUnitWeight = getMultiWorkUnitWeight(lightestMultiWorkUnit);
      if (multiWorkUnitWeight == 0 || (weight + multiWorkUnitWeight <= this.maxWeightPerUnit
          && weight + multiWorkUnitWeight > multiWorkUnitWeight)) { // check for overflow
        // if it fits, add it to lightest work unit
        addToMultiWorkUnit(lightestMultiWorkUnit, workUnit, weight);
        pQueue.poll();
        pQueue.add(lightestMultiWorkUnit);
      } else {
        // if doesn't fit in lightest multi work unit, create a new work unit for it
        MultiWorkUnit newMultiWorkUnit = MultiWorkUnit.createEmpty();
        addToMultiWorkUnit(newMultiWorkUnit, workUnit, weight);
        pQueue.add(newMultiWorkUnit);
      }
    }

    return Lists.<WorkUnit> newArrayList(Iterables.filter(pQueue, new Predicate<MultiWorkUnit>() {
      @Override
      @edu.umd.cs.findbugs.annotations.SuppressWarnings(
          value="NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE",
          justification="Allowing nullable values")
      public boolean apply(@Nullable MultiWorkUnit input) {
        return getMultiWorkUnitWeight(input) > 0;
      }
    }));
  }
