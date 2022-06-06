@VisibleForTesting
  protected static boolean areLeafsEquivalent(JavaScriptTree leftNode, JavaScriptTree rightNode) {
    if (leftNode instanceof IdentifierTree) {
      return Objects.equal(((IdentifierTree) leftNode).name(), ((IdentifierTree) rightNode).name());
    } else if (leftNode instanceof SyntaxToken) {
      return Objects.equal(((SyntaxToken) leftNode).text(), ((SyntaxToken) rightNode).text());
    } else {
      throw new IllegalArgumentException();
    }
  }
