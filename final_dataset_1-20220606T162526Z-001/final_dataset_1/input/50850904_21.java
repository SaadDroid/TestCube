public static IndexToIndexMultiMap from(
            final Buffer byteBuffer) {
        final int type = byteBuffer.getInt();
        if (type == V1DatabaseFormat.MultiMapType.LIST_BASED.getCode()) {
            return IntIndexToIndexMultiMap.from(byteBuffer.slice());
        } else if (type == V1DatabaseFormat.MultiMapType.LONG_ARRAY_BIT_SET_BASED.getCode()) {
            return BitSetIndexToIndexMultiMap.from(byteBuffer.slice());
        } else if (type == V1DatabaseFormat.MultiMapType.ASCENDING_BIT_SET_BASED.getCode()) {
            return AscendingBitSetIndexToIndexMultiMap.from(byteBuffer.slice());
        } else {
            throw new UnsupportedOperationException(
                    "Unsupported IndexToIndexMultiMap type: " + type);
        }
    }
