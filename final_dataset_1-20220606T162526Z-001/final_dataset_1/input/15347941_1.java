public void decode(InputStream in, HeaderListener headerListener) throws IOException {
    while (in.available() > 0) {
      switch(state) {
      case READ_HEADER_REPRESENTATION:
        byte b = (byte) in.read();
        if (maxDynamicTableSizeChangeRequired && (b & 0xE0) != 0x20) {
          // Encoder MUST signal maximum dynamic table size change
          throw MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED;
        }
        if (b < 0) {
          // Indexed Header Field
          index = b & 0x7F;
          if (index == 0) {
            throw ILLEGAL_INDEX_VALUE;
          } else if (index == 0x7F) {
            state = State.READ_INDEXED_HEADER;
          } else {
            indexHeader(index, headerListener);
          }
        } else if ((b & 0x40) == 0x40) {
          // Literal Header Field with Incremental Indexing
          indexType = IndexType.INCREMENTAL;
          index = b & 0x3F;
          if (index == 0) {
            state = State.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX;
          } else if (index == 0x3F) {
            state = State.READ_INDEXED_HEADER_NAME;
          } else {
            // Index was stored as the prefix
            readName(index);
            state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
          }
        } else if ((b & 0x20) == 0x20) {
          // Dynamic Table Size Update
          index = b & 0x1F;
          if (index == 0x1F) {
            state = State.READ_MAX_DYNAMIC_TABLE_SIZE;
          } else {
            setDynamicTableSize(index);
            state = State.READ_HEADER_REPRESENTATION;
          }
        } else {
          // Literal Header Field without Indexing / never Indexed
          indexType = ((b & 0x10) == 0x10) ? IndexType.NEVER : IndexType.NONE;
          index = b & 0x0F;
          if (index == 0) {
            state = State.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX;
          } else if (index == 0x0F) {
            state = State.READ_INDEXED_HEADER_NAME;
          } else {
            // Index was stored as the prefix
            readName(index);
            state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
          }
        }
        break;

      case READ_MAX_DYNAMIC_TABLE_SIZE:
        int maxSize = decodeULE128(in);
        if (maxSize == -1) {
          return;
        }

        // Check for numerical overflow
        if (maxSize > Integer.MAX_VALUE - index) {
          throw DECOMPRESSION_EXCEPTION;
        }

        setDynamicTableSize(index + maxSize);
        state = State.READ_HEADER_REPRESENTATION;
        break;

      case READ_INDEXED_HEADER:
        int headerIndex = decodeULE128(in);
        if (headerIndex == -1) {
          return;
        }

        // Check for numerical overflow
        if (headerIndex > Integer.MAX_VALUE - index) {
          throw DECOMPRESSION_EXCEPTION;
        }

        indexHeader(index + headerIndex, headerListener);
        state = State.READ_HEADER_REPRESENTATION;
        break;

      case READ_INDEXED_HEADER_NAME:
        // Header Name matches an entry in the Header Table
        int nameIndex = decodeULE128(in);
        if (nameIndex == -1) {
          return;
        }

        // Check for numerical overflow
        if (nameIndex > Integer.MAX_VALUE - index) {
          throw DECOMPRESSION_EXCEPTION;
        }

        readName(index + nameIndex);
        state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
        break;

      case READ_LITERAL_HEADER_NAME_LENGTH_PREFIX:
        b = (byte) in.read();
        huffmanEncoded = (b & 0x80) == 0x80;
        index = b & 0x7F;
        if (index == 0x7f) {
          state = State.READ_LITERAL_HEADER_NAME_LENGTH;
        } else {
          nameLength = index;

          // Disallow empty names -- they cannot be represented in HTTP/1.x
          if (nameLength == 0) {
            throw DECOMPRESSION_EXCEPTION;
          }

          // Check name length against max header size
          if (exceedsMaxHeaderSize(nameLength)) {

            if (indexType == IndexType.NONE) {
              // Name is unused so skip bytes
              name = EMPTY;
              skipLength = nameLength;
              state = State.SKIP_LITERAL_HEADER_NAME;
              break;
            }

            // Check name length against max dynamic table size
            if (nameLength + HEADER_ENTRY_OVERHEAD > dynamicTable.capacity()) {
              dynamicTable.clear();
              name = EMPTY;
              skipLength = nameLength;
              state = State.SKIP_LITERAL_HEADER_NAME;
              break;
            }
          }
          state = State.READ_LITERAL_HEADER_NAME;
        }
        break;

      case READ_LITERAL_HEADER_NAME_LENGTH:
        // Header Name is a Literal String
        nameLength = decodeULE128(in);
        if (nameLength == -1) {
          return;
        }

        // Check for numerical overflow
        if (nameLength > Integer.MAX_VALUE - index) {
          throw DECOMPRESSION_EXCEPTION;
        }
        nameLength += index;

        // Check name length against max header size
        if (exceedsMaxHeaderSize(nameLength)) {
          if (indexType == IndexType.NONE) {
            // Name is unused so skip bytes
            name = EMPTY;
            skipLength = nameLength;
            state = State.SKIP_LITERAL_HEADER_NAME;
            break;
          }

          // Check name length against max dynamic table size
          if (nameLength + HEADER_ENTRY_OVERHEAD > dynamicTable.capacity()) {
            dynamicTable.clear();
            name = EMPTY;
            skipLength = nameLength;
            state = State.SKIP_LITERAL_HEADER_NAME;
            break;
          }
        }
        state = State.READ_LITERAL_HEADER_NAME;
        break;

      case READ_LITERAL_HEADER_NAME:
        // Wait until entire name is readable
        if (in.available() < nameLength) {
          return;
        }

        name = readStringLiteral(in, nameLength);

        state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
        break;

      case SKIP_LITERAL_HEADER_NAME:
        skipLength -= in.skip(skipLength);

        if (skipLength == 0) {
          state = State.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
        }
        break;

      case READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX:
        b = (byte) in.read();
        huffmanEncoded = (b & 0x80) == 0x80;
        index = b & 0x7F;
        if (index == 0x7f) {
          state = State.READ_LITERAL_HEADER_VALUE_LENGTH;
        } else {
          valueLength = index;

          // Check new header size against max header size
          long newHeaderSize = (long) nameLength + (long) valueLength;
          if (exceedsMaxHeaderSize(newHeaderSize)) {
            // truncation will be reported during endHeaderBlock
            headerSize = maxHeaderSize + 1;

            if (indexType == IndexType.NONE) {
              // Value is unused so skip bytes
              state = State.SKIP_LITERAL_HEADER_VALUE;
              break;
            }

            // Check new header size against max dynamic table size
            if (newHeaderSize + HEADER_ENTRY_OVERHEAD > dynamicTable.capacity()) {
              dynamicTable.clear();
              state = State.SKIP_LITERAL_HEADER_VALUE;
              break;
            }
          }

          if (valueLength == 0) {
            insertHeader(headerListener, name, EMPTY, indexType);
            state = State.READ_HEADER_REPRESENTATION;
          } else {
            state = State.READ_LITERAL_HEADER_VALUE;
          }
        }

        break;

      case READ_LITERAL_HEADER_VALUE_LENGTH:
        // Header Value is a Literal String
        valueLength = decodeULE128(in);
        if (valueLength == -1) {
          return;
        }

        // Check for numerical overflow
        if (valueLength > Integer.MAX_VALUE - index) {
          throw DECOMPRESSION_EXCEPTION;
        }
        valueLength += index;

        // Check new header size against max header size
        long newHeaderSize = (long) nameLength + (long) valueLength;
        if (newHeaderSize + headerSize > maxHeaderSize) {
          // truncation will be reported during endHeaderBlock
          headerSize = maxHeaderSize + 1;

          if (indexType == IndexType.NONE) {
            // Value is unused so skip bytes
            state = State.SKIP_LITERAL_HEADER_VALUE;
            break;
          }

          // Check new header size against max dynamic table size
          if (newHeaderSize + HEADER_ENTRY_OVERHEAD > dynamicTable.capacity()) {
            dynamicTable.clear();
            state = State.SKIP_LITERAL_HEADER_VALUE;
            break;
          }
        }
        state = State.READ_LITERAL_HEADER_VALUE;
        break;

      case READ_LITERAL_HEADER_VALUE:
        // Wait until entire value is readable
        if (in.available() < valueLength) {
          return;
        }

        byte[] value = readStringLiteral(in, valueLength);
        insertHeader(headerListener, name, value, indexType);
        state = State.READ_HEADER_REPRESENTATION;
        break;

      case SKIP_LITERAL_HEADER_VALUE:
        valueLength -= in.skip(valueLength);

        if (valueLength == 0) {
          state = State.READ_HEADER_REPRESENTATION;
        }
        break;

      default:
        throw new IllegalStateException("should not reach here");
      }
    }
  }
