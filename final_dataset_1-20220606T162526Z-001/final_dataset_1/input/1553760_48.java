@Override
	public void characters(String text) {
		assertOpenBlock();
		try {
			for (int x = 0; x < text.length(); ++x) {
				char c = text.charAt(x);
				switch (c) {
				case '\u00A0':// &nbsp;
					currentBlock.write(' ');
					break;
				case '\u00A9': // &copy;
					currentBlock.write("(c)"); //$NON-NLS-1$
					break;
				case '\u00AE': // &reg;
					currentBlock.write("(r)"); //$NON-NLS-1$
					break;
				default:
					currentBlock.write(c);
					break;
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
