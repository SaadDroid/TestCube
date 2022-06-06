public static Schema dereferencing(Schema schema) {
        Schema dereferencedSchema = schema;
        Stream names = getNamedTypes(schema);

        List<String> flattenNames = flattenStream(names);
        Set<String> distinctFlattenNames = new HashSet<>(flattenNames);

        if (distinctFlattenNames.size() != flattenNames.size()) {
            Map<String, String> namespaces = new HashMap<>();
            for (String name : distinctFlattenNames) {
                namespaces.put(name, "a"); //referenced namespaces will be suffixed by alphabet a, then b, then c, etc...
            }
            return buildDereferencedSchema(schema, namespaces);
        }
        return dereferencedSchema;
    }
