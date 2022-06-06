protected ResourceEditRelation replaceRelation(ResourceEditRelation selectedRelation, ResourceEditRelation relation) {
        if (relation.getIdentifier() != null ? relation.getIdentifier().equals(selectedRelation.getIdentifier()) : selectedRelation.getIdentifier() == null) {
            if (relation.getSlaveGroupId().equals(selectedRelation.getSlaveGroupId())) {
                return selectedRelation;
            }
        }
        return relation;
    }
