@Override
    public boolean validateValue(Object obj, String objName, List<String> messages) {
        boolean ret = true;

        if (obj != null) {
            if (obj instanceof AtlasStruct) {
                AtlasStruct structObj = (AtlasStruct) obj;

                for (AtlasAttributeDef attributeDef : structDef.getAttributeDefs()) {
                    String         attrName  = attributeDef.getName();
                    AtlasAttribute attribute = allAttributes.get(attributeDef.getName());

                    if (attribute != null) {
                        AtlasType dataType  = attribute.getAttributeType();
                        Object    value     = structObj.getAttribute(attrName);
                        String    fieldName = objName + "." + attrName;

                        if (value != null) {
                            ret = dataType.validateValue(value, fieldName, messages) && ret;
                        } else if (!attributeDef.getIsOptional()) {
                            // if required attribute is null, check if attribute value specified in relationship
                            if (structObj instanceof AtlasEntity) {
                                AtlasEntity entityObj = (AtlasEntity) structObj;

                                if (entityObj.getRelationshipAttribute(attrName) == null) {
                                    ret = false;
                                    messages.add(fieldName + ": mandatory attribute value missing in type " + getTypeName());
                                }
                            } else {
                                ret = false;
                                messages.add(fieldName + ": mandatory attribute value missing in type " + getTypeName());
                            }
                        }
                    }
                }
            } else if (obj instanceof Map) {
                Map attributes             = AtlasTypeUtil.toStructAttributes((Map)obj);
                Map relationshipAttributes = AtlasTypeUtil.toRelationshipAttributes((Map)obj);

                for (AtlasAttributeDef attributeDef : structDef.getAttributeDefs()) {
                    String             attrName  = attributeDef.getName();
                    AtlasAttribute     attribute = allAttributes.get(attributeDef.getName());

                    if (attribute != null) {
                        AtlasType dataType  = attribute.getAttributeType();
                        Object    value     = attributes.get(attrName);
                        String    fieldName = objName + "." + attrName;

                        if (value != null) {
                            ret = dataType.validateValue(value, fieldName, messages) && ret;
                        } else if (!attributeDef.getIsOptional()) {
                            // if required attribute is null, check if attribute value specified in relationship
                            if (MapUtils.isEmpty(relationshipAttributes) || !relationshipAttributes.containsKey(attrName)) {
                                ret = false;
                                messages.add(fieldName + ": mandatory attribute value missing in type " + getTypeName());
                            }
                        }
                    }
                }
            } else {
                ret = false;
                messages.add(objName + "=" + obj + ": invalid value for type " + getTypeName());
            }
        }

        return ret;
    }
