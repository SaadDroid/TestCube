private static Stream<PsiElement> descendants(PsiElement element) {
    return Arrays.stream(element.getChildren()).flatMap(
      tree -> Stream.concat(Stream.of(tree), descendants(tree)));
  }
