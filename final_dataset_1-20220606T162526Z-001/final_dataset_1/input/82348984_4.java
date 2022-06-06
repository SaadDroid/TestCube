public void saveState(@NonNull Object stateHolder, @NonNull Bundle state) {
        // Get the instance through the method to have the correct exception handling if instance is null.
        final Lyra lyra = instance();
        Field[] fields = lyra.mFieldsRetriever.getFields(stateHolder.getClass());

        Bundle lyraBundle = new Bundle();

        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            SaveState saveState = getSaveStateAnnotation(field);
            // If the field isn't accessible, it will be modified in accessible and will return inaccessible after.
            boolean accessible = field.isAccessible();
            if (!accessible) {
                field.setAccessible(true);
            }

            final Object fieldValue;
            try {
                // Get the field value.
                fieldValue = field.get(stateHolder);
            } catch (IllegalAccessException e) {
                throw runtimeIllegalAccessException(field);
            }

            if (fieldValue != null) {
                final StateCoder stateCoder;
                try {
                    stateCoder = lyra.mCoderRetriever.getCoder(saveState, field.getType());
                } catch (CoderNotFoundException e) {
                    throw new RuntimeException(e);
                }
                //noinspection unchecked
                stateCoder.serialize(lyraBundle, getKeyFromField(field), fieldValue);
            }

            if (!accessible) {
                // Modify the field to make it inaccessible again.
                field.setAccessible(false);
            }
        }

        // Put the saved fields in the sub Bundle of Lyra.
        state.putBundle(SUB_BUNDLE_KEY, lyraBundle);
    }
