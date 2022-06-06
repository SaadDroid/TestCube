final void doWith(final MappedFieldMetaData metaData) {
        if (metaData == null) {
            throw new IllegalArgumentException("Method argument metaData must not be null.");
        }

        // Prepare the dynamic contextual data of this mapping
        final FieldData fieldData = new FieldData(metaData, evaluateFieldPath(metaData));
        // Determine whether the mapping can result in a non-null value
        final boolean isMappable = isMappable(fieldData);

        if (metaData.isLazy()) {
            // Lazy fields are never null, regardless of whether a value is mappable.
            Lazy<Object> lazy = isMappable ? new LazyFieldValue(fieldData, this) : LazyFieldValue.EMPTY;
            setField(metaData, lazy);
            return;
        }

        Object value = null;

        if (isMappable) {
            value = resolve(fieldData);
        }

        value = postProcessResolvedValue(fieldData, value);

        if (value != null) {
            setField(metaData, value);
        }
    }
