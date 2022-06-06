public void execute() throws IOException {
        // collect types
        collectTypes();

        // add supertypes
        for (EntityType type : allTypes.values()) {
            addSupertypeFields(type, allTypes);
        }

        // serialize them
        serialize(entityTypes, entitySerializer);
    }
