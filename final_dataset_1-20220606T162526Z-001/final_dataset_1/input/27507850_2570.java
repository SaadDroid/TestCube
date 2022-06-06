@Override
  public AnswerElement answer(NetworkSnapshot snapshot) {
    SpecifierContext context = _batfish.specifierContext(snapshot);
    Multiset<Row> rows =
        _nodeSpecifier.resolve(context).stream()
            .flatMap(node -> searchPoliciesForNode(node, _policySpecifier.resolve(node, context)))
            .map(SearchRoutePoliciesAnswerer::toRow)
            .collect(ImmutableMultiset.toImmutableMultiset());

    TableAnswerElement answerElement = new TableAnswerElement(metadata());
    answerElement.postProcessAnswer(_question, rows);
    return answerElement;
  }
