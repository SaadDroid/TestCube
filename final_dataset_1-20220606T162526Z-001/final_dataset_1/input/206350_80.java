public void relate(DataObject from, DataObject to) {

        if (from.getObjectContext() == null) {
            throw new IllegalArgumentException("'from' has null ObjectContext");
        }

        String property = objectIdPropertyName(from);
        String relationship = objectIdRelationshipName(property);

        if (to != null) {
            if (to.getObjectContext() == null) {
                throw new IllegalArgumentException("'to' has null ObjectContext");
            }

            if (from.getObjectContext() != to.getObjectContext()) {
                throw new IllegalArgumentException(
                        "'from' and 'to' objects are registered in different ObjectContexts");
            }

            from.writePropertyDirectly(relationship, to);

            if (to.getObjectId().isTemporary()
                    && !to.getObjectId().isReplacementIdAttached()) {

                // defer ObjectId resolving till commit
                from.writeProperty(property, new ObjectIdPropagatedValueFactory(
                        referenceableHandler,
                        to));
            }
            else {
                String uuid = referenceableHandler.getStringId(to);
                from.writeProperty(property, uuid);
            }
        }
        else {
            from.writeProperty(property, null);
            from.writePropertyDirectly(relationship, null);
        }
    }
