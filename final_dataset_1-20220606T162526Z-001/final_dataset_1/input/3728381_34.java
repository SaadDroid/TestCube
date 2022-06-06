protected Object[] extractLlcParameters(byte[] incomingGeneralBytes) {
		byte[] incomingLlcParameters = {};
		for (int x = 0; x <= incomingGeneralBytes.length - llcHeader.length; x++) {
			boolean match = true;
			for (int h = 0; h < llcHeader.length; h++) {
				if (incomingGeneralBytes[x + h] != llcHeader[h]) {
					match = false;
					break;
				}
			}
			if (match && incomingGeneralBytes.length > x + llcHeader.length) {
				incomingLlcParameters = new byte[incomingGeneralBytes.length - x - llcHeader.length];
				System.arraycopy(incomingGeneralBytes, x + llcHeader.length, incomingLlcParameters, 0,
						incomingLlcParameters.length);
			}
		}

		PduDecoder pduDecoder = new PduDecoder();
		Object[] parameter = pduDecoder.decodeParameter(incomingLlcParameters, 0);
		return parameter;
	}
