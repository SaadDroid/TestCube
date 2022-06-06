public void validate(Object target, Errors errors) {
        List list = (List) target;
        for (int i = 0; i < list.size(); i++) {
            ModelLink link = (ModelLink) list.get(i);
            validateParentModel(link, i, errors);
            validateChildModel(link, i, errors);

            if (link.getParentModel() != null && link.getChildModel() != null) {
                if (link.getParentModel().getId() == link.getChildModel().getId()) {
                    errors.rejectValue(String.format("[%s].childModel", i), "Model can not link to itself");
                }
            }

            isNotNull(link.getRelationshipType(), String.format("[%s].relationshipType", i), "Relationship Type", errors);

            if (link.getComment() != null && link.getComment().length() > 255) {
                errors.rejectValue(String.format("[%s].comment", i), "Comment can't be longer than 255 characters");
            }
        }
    }
