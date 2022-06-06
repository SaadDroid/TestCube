public static void quoteHtmlChars(OutputStream output, byte[] buffer,
      int off, int len) throws IOException {
    for (int i = off; i < off + len; i++) {
      switch (buffer[i]) {
      case '&':
        output.write(AMP_BYTES);
        break;
      case '<':
        output.write(LT_BYTES);
        break;
      case '>':
        output.write(GT_BYTES);
        break;
      case '\'':
        output.write(APOS_BYTES);
        break;
      case '"':
        output.write(QUOT_BYTES);
        break;
      default:
        output.write(buffer, i, 1);
      }
    }
  }
