@Override
    public int foreignableFieldHashCode() {
        HashCodeBuilder eb = new HashCodeBuilder();
        eb.append(this.id);
        eb.append(this.displayName);
        eb.append(this.fcOwner);
        eb.append(this.fcExternalKey);
        eb.append(this.fcExternalLink);

        eb.append(this.defaultValue);
        eb.append(this.exampleValue);
        eb.append(this.machineInterpretationKey);
        eb.append(this.optional);
        eb.append(this.encrypt);
        eb.append(this.propertyName);
        eb.append(this.nullable);
        eb.append(this.testing);
        eb.append(this.validationLogic);
        eb.append(this.propertyComment);
        eb.append(this.cardinalityProperty);

        eb.append(this.propertyTypeEntity != null ? this.propertyTypeEntity.getId() : null);

        return eb.toHashCode();
    }
