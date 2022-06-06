public DataSource read(InputStream input, Class<? extends Comparable<?>>... types)
			throws IOException {
		// Read all contents from the input stream
		Scanner scanner = new Scanner(input).useDelimiter("\\Z");
		String content = scanner.next();

		// Tokenize the string
		Character separator = getSetting(SEPARATOR_CHAR);
		CSVTokenizer tokenizer = new CSVTokenizer(separator);
		List<Token> tokens = tokenizer.tokenize(content);

		// Add row token if there was no trailing line break
		Token lastToken = tokens.get(tokens.size() - 1);
		if (lastToken.getType() != CSVTokenType.ROW_SEPARATOR) {
			Token eof = new Token(lastToken.getEnd(), lastToken.getEnd(),
				CSVTokenType.ROW_SEPARATOR, "");
			tokens.add(eof);
		}

		// Find methods for all column data types that can be used to convert
		// the text to the column data type
		Map<Class<? extends Comparable<?>>, Method> parseMethods =
				new HashMap<>();
		for (Class<? extends Comparable<?>> type : types) {
			if (parseMethods.containsKey(type)) {
				continue;
			}
			Method parseMethod = getParseMethod(type);
			if (parseMethod != null) {
				parseMethods.put(type, parseMethod);
			}
		}

		// Process the data and store the data.
		DataTable data = new DataTable(types);
		List<Comparable<?>> row = new LinkedList<>();
		int rowIndex = 0;
		int colIndex = 0;
		StringBuilder cellContent = new StringBuilder();
		for (Token token : tokens) {
			if (token.getType() == CSVTokenType.TEXT ||
					token.getType() == CSVTokenType.EMPTY_SPACE) {
				// Store the token text
				cellContent.append(token.getContent());
			} else if (token.getType() == CSVTokenType.COLUMN_SEPARATOR ||
					token.getType() == CSVTokenType.ROW_SEPARATOR) {
				// Check for a valid number of columns
				if (colIndex >= types.length) {
					throw new IllegalArgumentException(MessageFormat.format(
						"Too many columns in line {0,number,integer}: got {1,number,integer}, but expected {2,number,integer}.", //$NON-NLS-1$
						rowIndex + 1, colIndex + 1, types.length));
				}

				// We need to add the cell to the row in both cases because
				// rows don't have a trailing column token
				Class<? extends Comparable<?>> colType = types[colIndex];
				Method parseMethod = parseMethods.get(colType);
				Comparable<?> cell = null;
				try {
					cell = (Comparable<?>) parseMethod.invoke(
						null, cellContent.toString().trim());

				} catch (IllegalArgumentException e) {
					throw new RuntimeException(MessageFormat.format(
						"Could not invoke method for parsing data type {0} in column {1,number,integer}.", //$NON-NLS-1$
						types[colIndex].getSimpleName(), colIndex));
				} catch (IllegalAccessException e) {
					throw new RuntimeException(MessageFormat.format(
						"Could not access method for parsing data type {0} in column {1,number,integer}.", //$NON-NLS-1$
						types[colIndex].getSimpleName(), colIndex));
				} catch (InvocationTargetException e) {
					if (cellContent.length() > 0) {
						throw new IOException(MessageFormat.format(
							"Type mismatch in line {0,number,integer}, column {1,number,integer}: got \"{2}\", but expected {3} value.", //$NON-NLS-1$
							rowIndex + 1, colIndex + 1, cellContent.toString(), colType.getSimpleName()));
					}
				}
				row.add(cell);
				colIndex++;

				if (token.getType() == CSVTokenType.ROW_SEPARATOR) {
					// Check for a valid number of columns
					if (row.size() < types.length) {
						throw new IllegalArgumentException(MessageFormat.format(
							"Not enough columns in line {0,number,integer}: got {1,number,integer}, but expected {2,number,integer}.", //$NON-NLS-1$
							rowIndex + 1, row.size(), types.length));
					}

					// Add the row to the table
					data.add(row);
					rowIndex++;

					// Start a new row
					row.clear();
					colIndex = 0;
				}
				cellContent = new StringBuilder();
			}
		}

		return data;
	}
