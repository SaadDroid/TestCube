public ObjEntity entityMatchingRow(DataRow row) {
        // match depth first
        if (subentities != null) {
            for (EntityInheritanceTree child : subentities) {
                ObjEntity matched = child.entityMatchingRow(row);

                if (matched != null) {
                    return matched;
                }
            }
        }

        Expression qualifier = getDbQualifier();
        if (qualifier != null) {
            return qualifier.match(row) ? entity : null;
        }

        // no qualifier ... matches all rows
        return entity;
    }
