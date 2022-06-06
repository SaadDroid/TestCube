public Pair<T, T> visit(final SwapSecurity swap) {
    final FixedFloatVisitor fixedFloatVisitor = new FixedFloatVisitor();
    final SwapLeg payLeg = swap.getPayLeg();
    final SwapLeg receiveLeg = swap.getReceiveLeg();
    final boolean payFixed = payLeg.accept(fixedFloatVisitor);
    final boolean receiveFixed = receiveLeg.accept(fixedFloatVisitor);
    T firstValue;
    T secondValue;
    if (payFixed && receiveFixed) {
      firstValue = payLeg.accept(new FixedVisitor());
      secondValue = receiveLeg.accept(new FixedVisitor());
      return Pairs.of(firstValue, secondValue);
    }

    if (payFixed) {
      firstValue = payLeg.accept(new FixedVisitor());
      secondValue = receiveLeg.accept(new OtherVisitor());
    } else if (receiveFixed) {
      firstValue = receiveLeg.accept(new FixedVisitor());
      secondValue = payLeg.accept(new OtherVisitor());
    } else {
      firstValue = payLeg.accept(new FloatingPayVisitor());
      secondValue = receiveLeg.accept(new OtherVisitor());
    }
    return Pairs.of(firstValue, secondValue);

  }
