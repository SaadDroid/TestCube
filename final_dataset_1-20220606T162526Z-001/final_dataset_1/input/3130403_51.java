public final ParseCtxt skipBlanks() {
    while (!isDone()) {
      if (!isSpace(text.charAt(pos))) {
        break;
      }
      ++pos;
    }
    return this;
  }
