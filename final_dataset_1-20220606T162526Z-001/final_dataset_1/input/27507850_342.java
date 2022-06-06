@Override
  public void applyTo(
      JuniperConfiguration jc,
      HeaderSpace.Builder srcHeaderSpaceBuilder,
      LineAction action,
      List<? super ExprAclLine> lines,
      Warnings w) {
    if (!_junosApplication.hasDefinition()) {
      w.redFlag("Reference to undefined application: \"" + _junosApplication.name() + "\"");
    } else {
      _junosApplication.applyTo(jc, srcHeaderSpaceBuilder, action, lines, w);
    }
  }
