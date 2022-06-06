public Schema bind(Schema dst, Function<GroupDef, Direction> dirFn) throws IncompatibleSchemaException {
        Map<String, GroupDef> newGroups = new HashMap<>();
        for (GroupDef dstGroup : dst.getGroups()) {
            Direction dir = dirFn.apply(dstGroup);
            GroupDef srcGroup = src.getGroup(dstGroup.getName());

            GroupBinding groupBinding;
            ArrayList<FieldDef> newFields = new ArrayList<>(dstGroup.getFields().size());
            if (srcGroup == null) {
                if (src.getGroup(dstGroup.getId()) != null) {
                    throw new IncompatibleSchemaException("Group name mismatch on groups with id "+dstGroup.getId()+"!");
                }
                if (dstGroup.getSuperGroup() != null) {
                    // flatten into super group
                    GroupBinding superBinding = newGroups.get(dstGroup.getSuperGroup()).getBinding();
                    groupBinding = new GroupBinding(superBinding.getFactory(),
                            superBinding.getGroupType() instanceof MissingGroupType ? new MissingGroupType(dstGroup.getId()) : superBinding.getGroupType());
                } else {
                    groupBinding = new GroupBinding(Object::new,
                            new MissingGroupType(dstGroup.getId()));
                }
                for (FieldDef dstField : dstGroup.getFields()) {
                    newFields.add(new CreateAccessor<>(dstField).bindField(dstField));
                }
            } else {
                if (srcGroup.getId() != dstGroup.getId()) {
                    throw new IncompatibleSchemaException("Source and destination groups have different ids" + details(dstGroup, dir));
                }
                if (!Objects.equals(srcGroup.getSuperGroup(), dstGroup.getSuperGroup())) {
                    throw new IncompatibleSchemaException("Different group inheritance" + details(dstGroup, dir));
                }
                groupBinding = srcGroup.getBinding();
                checkRequiredFields(srcGroup, dstGroup, dir);

                for (FieldDef dstField : dstGroup.getFields()) {
                    FieldDef srcField = srcGroup.getField(dstField.getName());
                    
                    if(srcField == null) {
                        try {
                            newFields.add(new CreateAccessor<>(dstField).bindField(dstField));
                        } catch (SecurityException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    else {
                        newFields.add(bindField(srcField, dstField, srcGroup, dst, dir));
                    }
                }
            }

            GroupDef newGroup = new GroupDef(dstGroup.getName(), dstGroup.getId(), dstGroup.getSuperGroup(), newFields,
                    dstGroup.getAnnotations(), groupBinding);
            newGroups.put(newGroup.getName(), newGroup);
        }

        Schema s = new Schema(newGroups.values(), dst.getNamedTypes(), dst.getAnnotations(), src.getBinding(),
                buildRemovedClassRemap(newGroups, src.getGroups()));

        return s;
    }
