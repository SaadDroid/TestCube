@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {


		int packedSize = interpretter.getPackedLength(size);
		if (inStream.length - offset < packedSize) {
			throw new ISOException(String.format("Field [%s] at offset [%d]:Expecting %d bytes found %d", getName(),offset,packedSize, inStream.length - offset));
		}
		String interprettedvalue = interpretter.uninterpret(inStream, offset, size);
		if (getValue() != null) {
			if (!getValue().equals(interprettedvalue)) {
				throw new ISOException(String.format("Field [%s] at offset [%d]:Expected %s but found %s", getName(),offset,getValue(), interprettedvalue));
			}
		}

		fields.put(getName(),interprettedvalue);
		value = interprettedvalue;
		return offset + packedSize;

	}
