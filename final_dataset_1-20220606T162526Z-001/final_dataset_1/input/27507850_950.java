@Override
  public Set<T> resolve() {
    return _ast.accept(new EnumSetAstNodeToEnumValues<>(_allValues, _groupValues)).toValues();
  }
