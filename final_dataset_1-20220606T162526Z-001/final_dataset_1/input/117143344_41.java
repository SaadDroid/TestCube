private static <S, T, M extends Map<T, MutableDouble>> void conditionPMI(Map<S, M> coOccurrence,
          Map<S, MutableDouble> firstFreq, Map<T, MutableDouble> secondFreq, double firstTotal,
          double secondTotal, double coTotal,boolean LPMI) {
    for (Map.Entry<S, M> outer : coOccurrence.entrySet()) {
      S s = outer.getKey(); // "p"
      MutableDouble freqS = firstFreq.get(s); // frequency of S
      for (Map.Entry<T, MutableDouble> inner : outer.getValue().entrySet()) {
        T t = inner.getKey(); // "q"
        MutableDouble pmiTarget = inner.getValue(); // this is what we need to fill. Currently pmiTarget.value is p(first & second)*coTotal
        MutableDouble freqT = secondFreq.get(t); // frequency of T
        double numarator = pmiTarget.value / coTotal; // p(first & second) = coOccurrence.get(first).get(second)/coTotal
        double denominator = ((freqS.value / firstTotal) * (freqT.value / secondTotal)); // p(first) *p(second)
        if (LPMI)
        	pmiTarget.value *= Math.log((numarator / denominator)) / Math.log(2); 
        else
        	pmiTarget.value = Math.log((numarator / denominator)) / Math.log(2); 
      }
    }
  }
