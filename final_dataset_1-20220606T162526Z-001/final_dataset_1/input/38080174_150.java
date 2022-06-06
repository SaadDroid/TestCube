public static ByteBuf fromGzip(ByteBuf src, int maxMessageSize) throws ParseException {
		if (CHECK) checkArgument(src.readRemaining() > 0);

		int expectedSize = readExpectedInputSize(src);
		check(expectedSize >= 0, src, INCORRECT_UNCOMPRESSED_INPUT_SIZE);
		check(expectedSize <= maxMessageSize, src, DECOMPRESSED_SIZE_EXCEEDS_EXPECTED_MAX_SIZE);
		processHeader(src);
		ByteBuf dst = ByteBufPool.allocate(expectedSize);
		Inflater decompressor = ensureDecompressor();
		decompressor.setInput(src.array(), src.head(), src.readRemaining());
		try {
			readDecompressedData(decompressor, src, dst, maxMessageSize);
		} catch (DataFormatException ignored) {
			moveDecompressorToPool(decompressor);
			src.recycle();
			dst.recycle();
			throw DATA_FORMAT_EXCEPTION;
		}
		moveDecompressorToPool(decompressor);
		check(expectedSize == dst.readRemaining(), src, dst, ACTUAL_DECOMPRESSED_DATA_SIZE_IS_NOT_EQUAL_TO_EXPECTED);
		check(src.readRemaining() == GZIP_FOOTER_SIZE, src, dst, COMPRESSED_DATA_WAS_NOT_READ_FULLY);

		src.recycle();
		return dst;
	}
