@Override
    @SuppressWarnings("unchecked")
    public E toValue(String clientValue)
    {
        if (InternalUtils.isBlank(clientValue))
            return null;

        Object id = null;

        try
        {

            id = typeCoercer.coerce(clientValue, propertyAdapter.getType());
        } catch (Exception ex)
        {
            throw new RuntimeException(String.format(
                    "Exception converting '%s' to instance of %s (id type for entity %s): %s", clientValue,
                    propertyAdapter.getType().getName(), entityClass.getName(), ExceptionUtils.toMessage(ex)), ex);
        }

        Serializable ser = (Serializable) id;

        E result = (E) session.get(entityClass, ser);

        if (result == null)
        {
            // We don't identify the entity type in the message because the logger is based on the
            // entity type.
            logger.error(String.format("Unable to convert client value '%s' into an entity instance.", clientValue));
        }

        return result;
    }
