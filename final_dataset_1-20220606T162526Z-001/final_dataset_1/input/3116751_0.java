protected String buildFullMessage(String message, Object... args) {
		StringBuilder stringBuilder = new StringBuilder(message.length());
		int lastIndex = 0;
		int argIndex = 0;

		while (true) {
			int argPos = message.indexOf(ARGS_PATTERN, lastIndex);
			if (argPos == -1) {
				break;
			}

			stringBuilder.append(message.substring(lastIndex, argPos));

			lastIndex = argPos + ARGS_PATTERN_LENGTH;

			// add the argument, if we still have any
			if (argIndex < args.length) {
				stringBuilder.append(formatArgument(args[argIndex]));
				argIndex++;
			}
		}

		stringBuilder.append(message.substring(lastIndex));

		return stringBuilder.toString();
	}
