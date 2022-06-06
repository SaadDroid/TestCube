@Override
    public Object readObject(MessageReader reader, Context context) throws DatabindingException {
        try {
            // get the encoded array type info
            TypeMapping tm = context.getTypeMapping();
            if (tm == null) {
                tm = getTypeMapping();
            }
            ArrayTypeInfo arrayTypeInfo = new ArrayTypeInfo(reader, tm);

            // verify arrayType dimensions are the same as this type class's array dimensions
            if (getDimensions() != arrayTypeInfo.getTotalDimensions()) {
                throw new DatabindingException("In " + getSchemaType() + " expected array with "
                        + getDimensions() + " dimensions, but arrayType has "
                        + arrayTypeInfo.getTotalDimensions() + " dimensions: "
                        + arrayTypeInfo.toString());
            }

            // calculate max size
            int maxSize = 1;
            for (int dimension : arrayTypeInfo.getDimensions()) {
                maxSize *= dimension;
            }

            // verify offset doesn't exceed maximum size
            if (arrayTypeInfo.getOffset() >= maxSize) {
                throw new DatabindingException("The array offset " + arrayTypeInfo.getOffset() + " in "
                        + getSchemaType() + " exceeds the expecte size of " + maxSize);
            }

            // read the values
            List<Object> values = readCollection(reader,
                    context,
                    arrayTypeInfo,
                    maxSize - arrayTypeInfo.getOffset());

            // if it is a partially transmitted array offset the array values
            if (arrayTypeInfo.getOffset() > 0) {
                List<Object> list = new ArrayList<>(values.size() + arrayTypeInfo.getOffset());
                list.addAll(Collections.nCopies(arrayTypeInfo.getOffset(), null));
                list.addAll(values);
                values = list;
            }

            // check bounds
            if (values.size() > maxSize) {
                throw new DatabindingException("The number of elements " + values.size() + " in "
                        + getSchemaType() + " exceeds the expecte size of " + maxSize);
            }
            if (values.size() < maxSize) {
                values.addAll(Collections.nCopies(maxSize - values.size(), null));
                // todo is this an error?
                // throw new DatabindingException("The number of elements in " + getSchemaType() +
                //         " is less then the expected size of " + expectedSize);
            }
            if (values.size() != maxSize) {
                throw new IllegalStateException("Internal error: Expected values collection to contain "
                        + maxSize + " elements but it contains " + values.size() + " elements");
            }

            // create the array
            return makeArray(values, arrayTypeInfo.getDimensions(), getTypeClass().getComponentType());
        } catch (IllegalArgumentException e) {
            throw new DatabindingException("Illegal argument.", e);
        }
    }
