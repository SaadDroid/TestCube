@NotNull
    @Override
    public DatabaseBuilder merge(
            @NotNull
            final DocumentBuilder document) {
        checkNotFrozen();

        assert document instanceof V1DocumentBuilder :
                "Wrong document builder implementation supplied";

        final V1DocumentBuilder builder = (V1DocumentBuilder) document;

        // Marking document as built
        builder.freeze();

        // Updating the indexes

        // pass fixed or variable to index

        for (Map.Entry<String, Collection<UnsignedByteArray>> e :
                builder.fields.asMap().entrySet()) {
            final String fieldName = e.getKey();
            final Collection<UnsignedByteArray> values = e.getValue();

            final IndexSegment existingIndex = indexes.get(fieldName);
            if (existingIndex == null) {
                final IndexSegment index;
                @NotNull
                final DocumentBuilder.IndexOption indexOption =
                        builder.index.get(fieldName);
                @NotNull
                final DocumentBuilder.IndexType indexType =
                        builder.length.get(fieldName);

                switch (indexOption) {
                    case FILTERABLE:
                        index = new V1FilterableIndex(
                                fieldName,
                                indexType == DocumentBuilder.IndexType.FIXED_LENGTH,
                                indexType == DocumentBuilder.IndexType.TRIE
                        );
                        break;
                    case SORTABLE:
                        index = new V1SortableIndex(
                                fieldName,
                                indexType == DocumentBuilder.IndexType.FIXED_LENGTH
                        );
                        break;
                    case FULL:
                        index = new V1FullIndex(
                                fieldName,
                                indexType == DocumentBuilder.IndexType.FIXED_LENGTH
                        );
                        break;
                    case STORED:
                        index = new V1StoredIndex(fieldName);
                        break;
                    default:
                        throw new UnsupportedOperationException(
                                "Unsupported index option: " + indexOption);
                }

                indexes.put(fieldName, index);
                index.addDocument(currentDocumentId, values);
            } else {
                existingIndex.addDocument(currentDocumentId, values);
            }
        }

        currentDocumentId++;

        return this;
    }
