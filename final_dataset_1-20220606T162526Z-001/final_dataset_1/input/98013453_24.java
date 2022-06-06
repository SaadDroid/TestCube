@Override
    public boolean validateValue(Object obj, String objName, List<String> messages) {
        boolean ret = true;

        if (obj != null) {
            if (obj instanceof AtlasEntity || obj instanceof Map) {
                for (AtlasEntityType superType : superTypes) {
                    ret = superType.validateValue(obj, objName, messages) && ret;
                }

                ret = super.validateValue(obj, objName, messages) && validateRelationshipAttributes(obj, objName, messages) && ret;
            } else {
                ret = false;
                messages.add(objName + ": invalid value type '" + obj.getClass().getName());
            }
        }

        return ret;
    }
