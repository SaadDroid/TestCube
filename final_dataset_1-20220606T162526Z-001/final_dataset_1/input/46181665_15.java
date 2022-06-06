protected Namer getXToOneNamerByConvention(Attribute fromAttribute, String fromEntityName, String fromAttributeVar, Namer targetEntityNamer) {
        String var = null;
        if (fromAttributeVar.toUpperCase().endsWith("ID")) {
            if (fromAttributeVar.length() > 2) {
                // attribute is "somethingId" ==> x to one is "something"
                var = fromAttributeVar.substring(0, fromAttributeVar.length() - 2);
            }
        } else {
            var = fromAttributeVar; // + "Ref";
        }

        if (var == null) {
            var = targetEntityNamer.getVar();
        }

        // with convention we do our best to avoid clash.
        return new AccessorNamer(targetEntityNamer, getClashSafeVar(fromEntityName, var));
    }
