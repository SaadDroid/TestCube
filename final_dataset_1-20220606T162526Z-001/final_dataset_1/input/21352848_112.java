@Override
  public WikiDocumentOutput map(ParsedWikiDocument doc) {
    Set<String> identifiers = doc.getIdentifiers().elementSet();
    List<Relation> relations = Lists.newArrayList();
    for (String identifier : identifiers) {
      List<Relation> candidates = generateCandidates(doc, identifier);
      if(config.getDefinitionMerging()){
        selfMerge(candidates);
      } else {
        Collections.sort(candidates);
        Collections.reverse(candidates);
      }
      for (Relation rel : candidates) {
        if (rel.getScore() >= config.getThreshold()) {
          relations.add(rel);
        }
      }
    }
    return new WikiDocumentOutput(doc.getTitle(), relations, doc.getIdentifiers());
  }
