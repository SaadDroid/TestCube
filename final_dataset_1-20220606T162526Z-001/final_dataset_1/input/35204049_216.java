public TraitType defineTraitType(HierarchicalTypeDefinition<TraitType> traitDef) throws AtlasException {
        defineTypes(ImmutableList.<EnumTypeDefinition>of(), ImmutableList.<StructTypeDefinition>of(),
                ImmutableList.of(traitDef), ImmutableList.<HierarchicalTypeDefinition<ClassType>>of());
        return getDataType(TraitType.class, traitDef.typeName);
    }
